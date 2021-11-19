/*
 * Author: Joshua Clarke
 * Professor: Teddy Yap
 * Created: Nov. 18, 2021
 * Modified: Nov. 18, 2021
 * Description: A class that defines a drink machine. Use this class to determine
 * 				whether or not the drink machine is pouring drinks properly.
 */

public class DrinkMachine {
	public static final String SMALL = "small";
	public static final String MEDIUM = "medium";
	public static final String LARGE = "large";
	public static final double SMALL_VOLUME = 250.0;
	public static final double MEDIUM_VOLUME = 400.0;
	public static final double LARGE_VOLUME = 500.0;
	private static final double EPSILON = 10.0;
	private double volume; // (ml)
	private String size; // "small", "medium", "large"
	
	/*
	 * Instantiates this class.
	 * Sets size and volume to medium.
	 */
	public DrinkMachine() {
		this(DrinkMachine.MEDIUM_VOLUME, DrinkMachine.MEDIUM);
	}
	
	/*
	 * Instantiates this class.
	 * Sets size and volume from specified parameters.
	 */
	public DrinkMachine(double volume, String size) {
		this.volume = volume;
		this.size = size;
	}

	/*
	 * Returns current drink volume.
	 */
	public double getVolume() {
		return volume;
	}

	/*
	 * Checks if volume parameter specified is valid.
	 * If so, sets and returns current drink volume.
	 */
	public boolean setVolume(double volume) {
		if (volume > 0) {
			this.volume = volume;
			return true;
		}
		return false;
	}

	/*
	 * Returns current drink size.
	 */
	public String getSize() {
		return size;
	}

	/*
	 * Checks if size parameter specified is valid.
	 * If so, sets and returns current drink size.
	 */
	public boolean setSize(String size) {
		size = size.toLowerCase();
		if (size.equals(SMALL) || size.equals(MEDIUM) || size.equals(LARGE)) {
			this.size = size;
			return true;
		}
		return false;
	}

	/*
	 * Verifies if the volume of the drink is within 10.0 ml
	 * of the default size volume.
	 * Returns a report of the user's inputs as well as the result.
	 */
	public String verifySize() {
		String report = "";
		
		double difference = 0;
		
		if (size.equals(SMALL)) {
			difference = Math.abs(volume-SMALL_VOLUME);
		} else if (size.equals(MEDIUM)) {
			Math.abs(volume-MEDIUM_VOLUME);
		} else if (size.equals(LARGE)) {
			Math.abs(volume-LARGE_VOLUME);
		} else {
			return "Invalid drink size!";
		}

		String outOfBounds = String.format(difference > EPSILON ? "Outside tolerance of %.1f %s" : 
			"Within tolerance of %.1f %s",EPSILON,"ml !");
		report = String.format("%nSize: %s%nVolume: %.1f%nDifference: %.1f%n%s", size, volume, difference, outOfBounds);
		
		return report;
	}
	
	/*
	 * Returns a drink menu string used to display the drink sizes
	 * and their corresponding volumes.
	 */
	public String drinkSizeMenu() {
		String report = String.format(
				"Drink sizes:%n%s is %.1f (ml)%n%s is %.1f (ml)%n%s is %.1f (ml)",
				DrinkMachine.SMALL, DrinkMachine.SMALL_VOLUME,
				DrinkMachine.MEDIUM, DrinkMachine.SMALL_VOLUME,
				DrinkMachine.LARGE, DrinkMachine.SMALL_VOLUME
				);
		return report;
	}

}

/*
 * Author: Joshua Clarke
 * Professor: Teddy Yap
 * Created: Nov. 18, 2021
 * Modified: Nov. 18, 2021
 * Description: A program that determines if a drink machine needs maintenance.
 */

public class Assignment02 {

	/*
	 * Program main class. 
	 * Handles getting user input and reporting if maintenance is needed.
	 */
	public static void main(String[] args) {
		DrinkMachine machine = new DrinkMachine();
		User user = new User();
		boolean sizeSet;
		boolean volumeSet;
		
		do {
			sizeSet = false;
			volumeSet = false;
			
			while (!sizeSet) {
				sizeSet = machine.setSize(user.inputString(String.format("%n%s%n%n%s", machine.drinkSizeMenu(), "Enter drink size: ")));
				if (!sizeSet) {
					System.out.println("Invalid size! Please enter a valid size.");
				}
			}
			
			while (!volumeSet) {
				volumeSet = machine.setVolume(user.inputDouble("Enter drink volume: "));
				if (!volumeSet) {
					System.out.println("Invalid volume! Please enter a valid volume.");
				}
			}
			
			System.out.printf("%s%n%s%n",machine.verifySize(),"Program by Joshua Clarke");
			
		} while (user.inputString(String.format("%nWould you like to verify another drink?%n%s", 
				"Type Yes to continue: ")).toLowerCase().equals("yes"));
	}
}
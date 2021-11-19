/*
 * Author: Joshua Clarke
 * Professor: Teddy Yap
 * Created: Nov. 18, 2021
 * Modified: Nov. 18, 2021
 * Description: A program that calculates the cost of an admission ticket based on the age
 * 				of the customer.
 */

import java.util.Scanner;

public class User {
	
	private Scanner keyboard = new Scanner(System.in);
	
	/*
	 * Fetches integer input from user.
	 */
	public Integer inputInteger() {
		Integer value = null;
		try {
			value = keyboard.nextInt();
		} 
		catch (Exception e) {
			System.out.printf("%nPlease enter a valid number!%n");
		}
		keyboard.nextLine();
		return value;
	}
	
	/*
	 * Prints a prompt in console.
	 * Returns inputInteger() return value is not null.
	 */
	public int inputInteger(String message) {
		Integer value = null;
		do {
			System.out.printf("%s", message);
			value = inputInteger(); 
		} while(value == null);
		return value;
	}
	
	/*
	 * Fetches double input from user.
	 */
	public Double inputDouble() {
		Double value = null;
		try {
			value = keyboard.nextDouble();
		}
		catch (Exception e) {
			System.out.printf("%nPlease enter a valid number!%n");
		}
		keyboard.nextLine();
		return value;	
	}

	/*
	 * Prints a prompt in console.
	 * Returns inputDouble() return value is not null.
	 */
	public double inputDouble(String message) {
		Double value = null;
		do {
			System.out.printf("%s", message);
			value = inputDouble();
		} while (value == null);
		return value;
	}
	
	/*
	 * Fetches string input from user.
	 */
	public String inputString() {
		String value = keyboard.nextLine();
		return value;
	}
	
	/*
	 * Outputs a prompt in console.
	 * Returns inputString()
	 */
	public String inputString(String message) {
		System.out.printf("%s", message);
		String value = inputString();
		return value;
	}
}
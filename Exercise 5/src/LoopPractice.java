/*
 * Author: Joshua Clarke
 * Professor: Teddy Yap
 * Created: Nov. 20, 2021
 * Modified: Nov. 20, 2021
 * Description: A program used to practice different loop types.
 */

public class LoopPractice {
	
	private User user = new User(); // use this to get inputs
	
	/*
	 * Asks for user integer input continuously until user types something other than "yes".
	 * Outputs the sum, average and developer name.
	 */
	public void testWhileLoopProblem() {
		double sum = 0;
		double average = 0;
		int numberCounter = 0;
		String shouldContinue = "yes";
		System.out.printf("%s%n", "Indeterminate while loop demo");
		while (shouldContinue.equals("yes")) {
			numberCounter++;
			sum += user.inputInteger("Enter a number: ");
			shouldContinue = user.inputString("Continue? (Yes/No): ").toLowerCase();
		}
		average = sum/numberCounter;
		System.out.printf("Sum: %.4f%nAvg.: %.4f%n%s%n", sum, average, "Program by Joshua Clarke");
	}
	
	/*
	 * Asks for user integer input continuously until user types something other than "yes".
	 * Outputs the sum, average and developer name.
	 */
	public void testDoWhileLoopProblem() {
		double sum = 0;
		double average = 0;
		int numberCounter = 0;
		String shouldContinue = "yes";
		System.out.printf("%s%n", "Indeterminate do-while loop demo");
		do {
			numberCounter++;
			sum += user.inputInteger("Enter a number: ");
			shouldContinue = user.inputString("Continue? (Yes/No): ").toLowerCase();
		} while (shouldContinue.equals("yes"));
		average = sum/numberCounter;
		System.out.printf("Sum: %.4f%nAvg.: %.4f%n%s%n", sum, average, "Program by Joshua Clarke");
	}
	
	/*
	 * Asks for user string input.
	 * Counts the number of "a"s' in the string.
	 * Outputs the sentence's length and "a" count along with the developer's name.
	 */
	public void testForLoopProblem() {
		String sentence = "";
		int sentenceLen = 0;
		int letterCount = 0;
		char extractedCharacter = 0;
		System.out.printf("%s%n", "Determinate for loop demo");
		sentence = user.inputString("Enter a sentence: ");
		sentenceLen = sentence.length();
		for (int i = 0; i < sentenceLen; i++) {
			extractedCharacter = sentence.charAt(i);
			if (extractedCharacter == 'a') {
				letterCount++;
			}
		}
		System.out.printf("\"a\" count: %d%n%d%n%s", letterCount, sentenceLen, "Program by Joshua Clarke");
	}

}

/* Exercise 06 (21F) 
 * Author: Stanley Pieda
 * Modified By: Joshua Clarke
 * Lab Professor: Teddy Yap
 * Due Date: Friday, Nov. 26
 */

/*
 * Can encode and decode a string.
 */
public class SimpleCipher {
	
    /*
     * Encodes a string by adding 2 to its characters' unicode,
     * reversing it and converting it back into a string.
     */
	public String encode(String text) {
		String result = "";
		int textLen = text.length();
		char[] chars = new char[textLen];
		
		for (int index = 0; index < textLen; index++) {
			chars[index] = (char)(((int)chars[index])+2);
		}
		
		chars = reverse(chars);
		
		for (int index = 0; index < text.length(); index++) {
			result += chars[index];
		}
		
		return result;
	}
	
    /*
     * Decodes a string by substracting 2 from its characters' unicode,
     * reversing it and converting it back into a string.
     */
	public String decode(String text) {
		String result = "";
		int textLen = text.length();
		char[] chars = new char[textLen];
		
		for (int index = 0; index < textLen; index++) {
			chars[index] = (char)(((int)chars[index])-2);
		}
		
		chars = reverse(chars);
		
		for (int index = 0; index < text.length(); index++) {
			result += chars[index];
		}
		
		return result;
	}
	
	/*
	 * Reverses a character array.
	 * i.e. puts the last character as the first
	 * and the first as the last.
	 */
	private char[] reverse(char[] original) {
		int length = original.length;
		char[] reversed = new char[length];
		int writeIndex = 0;
		for(int readIndex = length - 1; readIndex >= 0; readIndex--) {
			reversed[writeIndex] = original[readIndex];
			writeIndex++;
		}
		// the readIndex above starts at the last index, and stops at index zero
		// the writeIndex starts at zero, and stops at the last index.
		return reversed;
	}
}

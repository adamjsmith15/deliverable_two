package deliverable_two;
import java.util.Scanner;
import java.lang.Math;

public class unicodeCalculator {
	public static void main(String[] arg) {
		Scanner scnr = new Scanner(System.in);
		String string1;
		String string2;
		int i;
		int string1Total = 0;
		int string2Total = 0;
		int stringDiff;
		
		System.out.println("Please enter your first string: ");
		//get string from input for string1
		string1 = scnr.nextLine();
		System.out.println("Please enter your second string: ");
		//get string from input for string2
		string2 = scnr.nextLine();
		
		//loop through string1 print char and unicode and add to string 1 total
		for (i = 0; i < string1.length(); ++i) {
			char tempChar = string1.charAt(i);
			int tempInt = tempChar;
			System.out.println("\u25A0 " + tempChar + ": " + tempInt);
			string1Total = string1Total + tempInt;
		}
		
		//loop through string2 print char and unicode and add to string 2 total
		for (i = 0; i < string2.length(); ++i) {
			char tempChar = string2.charAt(i);
			int tempInt = tempChar;
			System.out.println("\u25A0 " + tempChar + ": " + tempInt);
			string2Total = string2Total + tempInt;
		}
		//Calculate diff between string
		stringDiff = string1Total - string2Total;
		
		//output difference with new line
		System.out.println("Difference (as an absolute value): "
				+ Math.abs(stringDiff));
	}

}

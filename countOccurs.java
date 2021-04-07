
/* Gabriel Blunt
 * Occurrence Counter Program by G. Blunt Ent.
 * 02/22/2021
 * CIST 2371
 */
import java.util.Scanner;

public class countOccurs {

	public static void main(String[] args) {
		// This program reads the integers between 1 and 100 and counts the occurrences of each.
		
		// Initialize array.
		int[] counts = new int[100]; 
		
		// Welcome the user.
		
		System.out.println("Welcome to the Occurrence Counter Program.");
		System.out.println("This program counts the occurrences of the numbers you enter.");

		// Prompt the user to enter integers between 1 and 100
		System.out.print("Please enter integers between 1 and 100 with 0 being your last entry: ");

		// Call count method.
		count(counts);

		// Display results.
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] > 0)
				System.out.println((i + 1) + "\t" + " occurs " + counts[i] +
					" time" + (counts[i] > 1 ? "s" : ""));
		}
	}

	// Method reads and counts occurrences of numbers enters by user.
	
	public static void count(int[] counts){
		Scanner input = new Scanner(System.in);
		int number; // holds user input
		do {
			number = input.nextInt();
			if (number >= 1 && number <= 100)	
				counts[number - 1]++;
		} while (number != 0);
		
	}
	
	// Thank the user. 
	
	{System.out.println("Thanks for using my program.");
}
}
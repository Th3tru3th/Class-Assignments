// Gabriel Blunt
// 01/30/2021
// CIST 2371
// Phone Keypads Assignment
import java.util.Scanner;
public class PhoneKeypads {
	// This program prompts the user to enter a letter and displays its corresponding number.
	public static void main(String[] args) {
		
		// Welcome user
		System.out.println("Welcome to Gabriel's Phone Keypad Mapping Program!");
		
		// Declare variables and prompt the user to enter a letter.
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter either an upper or lowercase letter: ");
		char letter = input.nextLine().charAt(0);
		
		// Convert user's input to upper case.
			letter = Character.toUpperCase(letter); 
			int number = 0;
			
		// Use switch statements to find corresponding number.
		switch (letter) {
		case 'A': case 'B': case 'C':
			number = 2;
			break; 
			
		case 'D': case 'E': case 'F':
			number = 3;
			break;  
			
		case 'G': case 'H': case 'I':
			number = 4;
			break; 
			
		case 'J': case 'K': case 'L':
			number = 5;
			break; 
			
		case 'M': case 'N': case 'O':
			number = 6;
			break; 
			
		case 'P': case 'Q': case 'R': case 'S':
			number = 7;
			break; 
			
		case 'T': case 'U': case 'V':
			number = 8;
			break; 
			
		case 'W': case 'X': case 'Y': case 'Z':
			number = 9;
			break; 
			
		default:
			break;
		}
		
		// Display results
		if (number < 1) { System.out.println("** INVALID INPUT **");}
		else  {System.out.println("The corresponding number for " + letter + " is " + number + ".");	}
			
		
		// Thank user
		System.out.println("Thanks for using my program!");
	}
}


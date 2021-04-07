// Gabriel Blunt
// 01/24/2021
// Rock Paper Scissors Game

import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		// This program plays Rock, Paper, Scissors
		// Generate random number: 0, 1, or 2 for the program.
		int compSelect = (int)(Math.random() * 3);
		// Prompt user to enter 0, 1, or, 2.
		System.out.println("Please enter a number from 0 to 2 (Rock (0), Paper(1), or Scissors (2)): ");
		
		Scanner input = new Scanner(System.in);
		int uSelect = input.nextInt();
		// Take user selection and run it through the rules of the game 
		
			if (uSelect == compSelect) {System.out.println("You both made the same selection. This is a draw.");}
				else if (uSelect == 0 && compSelect == 1) {System.out.println("You are rock. The computer is paper. You lose.");}
				else if (uSelect == 0 && compSelect == 2) {System.out.println("You are rock. The computer is scissors. You win.");}
				else if (uSelect == 1 && compSelect == 0) {System.out.println("You are paper. The computer is rock. You win.");}
				else if (uSelect == 1 && compSelect == 2) {System.out.println("You are paper. The computer is scissors. You lose.");}
				else if (uSelect == 2 && compSelect == 0) {System.out.println("You are scissors. The computer is rock. You lose.");}
				else if (uSelect == 2 && compSelect == 1) {System.out.println("You are scissors. The computer is paper. You win.");}
			
		else System.out.println("You didn't enter 0, 1, or 2.");
		
	}
	
}

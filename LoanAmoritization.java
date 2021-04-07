/*	Gabriel Blunt
 * 	02/14/2021
 * CIST 2371
 * Loan Amortization Program
 */
import java.util.Scanner;

public class LoanAmoritization {

	public static void main(String[] args) {
	// This program displays the amortization schedule for a loan.
		
	// Create Scanner.
	Scanner input = new Scanner(System.in);
	
	System.out.println("Welcome to the Loan Amortization Program.");
		
	// Prompt user to enter the loan amount, annual interest rate, and number of years.
		
	System.out.println("Please enter the loan amount, for example 25000: ");
		double loanAmt = input.nextDouble();
		
	System.out.println("Please enter the annual interest rate, for example 7.25 : ");
		double annualIntRate = input.nextDouble();
		
		// Obtain monthly interest rate.
		
		double monthlyIntRate = annualIntRate / 1200; 
		
	System.out.println("Please enter the number of years as an integer, for example 5 : ");
		int numYears = input.nextInt();
		
	// Calculate the monthly payment.
		
		double monthlyPay = loanAmt * monthlyIntRate / 
				(1 - 1 / Math.pow(1 + monthlyIntRate, numYears * 12));  
		double totalPay = monthlyPay * numYears * 12;
		
	// Display Monthly and total payments.
		
		System.out.println("Monthly Payment: " + Math.round(monthlyPay * 100.0) / 100.0);
		System.out.println("Total Payment: " + Math.round(totalPay * 100.0) / 100.0);

	// Calculate the number of payments, principal and monthly interest rate.
		

		System.out.println("Payment#" + "\t" + "Interest" + "\t" + "Principal" + "\t" + "Balance");
		for (int i = 1; i <= numYears * 12; i++) {
			double monthlyInt = monthlyIntRate * totalPay;
			double principal = monthlyPay - monthlyInt;
			totalPay = totalPay - principal;
			System.out.println(i +"\t\t" + Math.round((monthlyInt * 100.0) / 100.0) + "\t\t" + 
								Math.round((principal * 100.0) / 100.0) + "\t\t" + Math.round((totalPay * 100.0) / 100.0));
		
		}
		
		// Thank the user.
	System.out.println("Thanks for using the program.");
	}
}



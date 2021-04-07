/* Gabriel Blunt
 * Temperature Conversion Program
 * 02/21/2021
 * CIST 2371
 */
public class TempConversion {

	public static void main(String[] args) {
		/* This program displays a table showing two temperatures converted from 40 degrees celsius to fahrenheit 
		 * and 120 degrees fahrenheit to celsius.*/
		
		// Welcome user.
		
		System.out.println("Welcome to my Temperature Conversion Program.");
		
		
		// Declare variables and initial values.
		
		double celsius = 40;
		double fahrenheit = 120;
		
		// Declare Strings for table headers.
		
		String header1 = "Celsius";
		String header2 = "Fahrenheit";
		
		// Display headers.
		
		System.out.printf("%-10s%-10s | %15s%12s \n", header1, header2,
							header2, header1);
		System.out.println("-------------------------------------------------------");
		
		// Loop to find temperatures.
		
		for (celsius = 40, fahrenheit = 120; celsius > 30; celsius--,
				fahrenheit = fahrenheit - 10)
		
		// Call methods and display data.
		
		System.out.printf("%-10.1f%-10.1f | %15.1f%12.2f \n", celsius, cToF(celsius),
							fahrenheit, fToC(fahrenheit));
	}
	public static double cToF(double celsius) {
		
		return (9.0 / 5) * celsius + 32;
		}
	public static double fToC(double fahrenheit) {
		
		return (5.0 / 9) * (fahrenheit - 32); 
		}
	{
		//Thank the user.
		System.out.println("Thanks for using my program.");
}
}

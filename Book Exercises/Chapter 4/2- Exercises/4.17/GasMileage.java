/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Takes miles you drove and gas you used this trip and 
 *  calculates trip miles per gallon. At the end it calculates total miles per 
 *  gallon.
 * Latest version: 5:24 PM, 5/20/2017. Changed comments. Added units to prompts.
 * Older versions: 11:12 PM, 7/24/2016
 */

import java.util.Scanner;

public class GasMileage
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int tripGasLose;
		int totalGasLose = 0;
		int tripMiles;
		int totalMiles = 0;
		float tripMilesPerGallon;
		float totalMilesPerGallon;

		// Input gallons of gas used.
		System.out.print("Enter gallons of gas you used this trip or enter -1 to leave: ");
		tripGasLose = input.nextInt();
		while (tripGasLose != -1)
		{
			// Input miles driven.
			System.out.print("Enter miles you drove last trip: ");
			tripMiles = input.nextInt();
			
			// Calculate and output trip MPG.
			tripMilesPerGallon = (float) tripMiles / tripGasLose;
			System.out.printf("Trip miles per gallon: %.2f%n%n", tripMilesPerGallon);
			
			// Increment totalMiles and totalGasLose.
			totalMiles += tripMiles;
			totalGasLose += tripGasLose;
			
			// Input gallons of gas used.
			System.out.print("Enter gallons of gas you used this trip or enter -1 to leave: ");
			tripGasLose = input.nextInt();
		}

		// // Calculate and output total MPG.
		totalMilesPerGallon = (float) totalMiles / totalGasLose;
		System.out.printf("%nTotal miles per gallon: %.2f%n", totalMilesPerGallon);
	}
}

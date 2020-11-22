/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Takes names and earnings of 3 people and calculates taxes.
 * Latest version: 4:16 AM 8/30/2020. Changed tax calculation for over 30k from 
 *  "earnings * 0.15F" to "4500 + ((earnings - 30_000) * 0.20F)".
 * Older versions: 5:56 PM, 5/20/2017. Changed comments.
 *		7:11 PM, 8/2/2016
 */

import java.util.Scanner;

public class TaxCalculator
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int counter = 1;
		String name;
		float earnings;
		float tax;

		while (counter <= 3)
		{
			System.out.print("Enter name: ");
			name = input.nextLine();
			System.out.print("Enter earnings: ");
			earnings = input.nextFloat();
			input.nextLine();

			if (earnings <= 30_000)
				tax = earnings * 0.15F;
			else
				tax = 4500 + ((earnings - 30_000) * 0.20F);

			System.out.printf("Tax of %s is %,.2f%n%n", name, tax);

			counter++;
		}
	}
}

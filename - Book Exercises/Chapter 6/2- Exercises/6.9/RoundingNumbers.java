/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Enter a number to round it.
 * Latest version: 11:58 AM, 6/30/2017
 * Older versions: 
 */

import java.util.Scanner;

public class RoundingNumbers
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		double number1;
		double number2;

		do
		{
			System.out.printf("%nEnter a number to round, or enter 0 to exit: ");
			number1 = input.nextDouble();
			if (number1 == 0)
				break;
			number2 = round(number1);
			System.out.println("Before: " + number1 + " After: " + number2);
		} while (true);
	}

	public static double round(double number1)
	{
		double floor = Math.floor(number1 + 0.5);
		return floor;
	}
}

/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Takes 5 numbers from user first. And then prints horizontal 
 *  asterisks as long as each number to five lines.
 * Latest version: 11:37 AM, 2/6/2019
 * Older versions: 
 */

import java.util.Scanner;

public class BarChartPrinting
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int number = 0;
		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		int number4 = 0;
		int number5 = 0;

		for (int counter = 1; counter <= 5; counter++)
		{
			System.out.print("Enter " + counter + ". number(1-30): ");
			number = input.nextInt();

			// Didnt want to use an array since the book hasnt covered it yet.
			switch (counter)
			{
				case 1:
					number1 = number;
					break;
				case 2:
					number2 = number;
					break;
				case 3:
					number3 = number;
					break;
				case 4:
					number4 = number;
					break;
				case 5:
					number5 = number;
					break;
			}
		}

		// Didnt want to use arrays since the book hasnt covered it yet.
		for (int counter = 1; counter <= 5; counter++)
		{
			switch (counter)
			{
				case 1:
					for (int counter2 = 1; counter2 <= number1; counter2++)
						System.out.print("*");
					System.out.println("");
					break;
				case 2:
					for (int counter2 = 1; counter2 <= number2; counter2++)
						System.out.print("*");
					System.out.println("");
					break;
				case 3:
					for (int counter2 = 1; counter2 <= number3; counter2++)
						System.out.print("*");
					System.out.println("");
					break;
				case 4:
					for (int counter2 = 1; counter2 <= number4; counter2++)
						System.out.print("*");
					System.out.println("");
					break;
				case 5:
					for (int counter2 = 1; counter2 <= number5; counter2++)
						System.out.print("*");
					System.out.println("");
					break;
			}
		}
	}
}

/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Finds minimum and maximum amongst several integers. Then 
 *  computes sum of these numbers.
 * Latest version: 7:29 PM, 4/18/2020. Replaced "if, if" with if else if" to make 
 *  it more efficient.
 * Older versions: 11:39 PM, 6/8/2017. Changed comments. Changed some of the prompts.
 *  Now it says "Enter i. value" instead of "Enter next value".
 *		5:47 AM, 9/5/2016
 */

import java.util.Scanner;

public class Extremes
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int numberOfValues;
		int value;
		int min;
		int max;
		int sum;

		System.out.print("How many values should be inputted? ");
		numberOfValues = input.nextInt();

		// It makes more sense to solve this problem with methods (send data to a 
		// method) but this is chapter 5 so this will do.
		System.out.print("Enter 1. value: ");
		value = input.nextInt();
		min = max = value;

		for (int counter = 1; counter < numberOfValues; counter++)
		{
			System.out.print("Enter " + (counter + 1) + ". value: ");
			value = input.nextInt();

			if (value < min)
				min = value;
			else	if (value > max)
				max = value;
		}

		sum = min + max;

		System.out.printf("Min = %d, Max = %d, Sum = %d%n", min, max, sum);
	}
}

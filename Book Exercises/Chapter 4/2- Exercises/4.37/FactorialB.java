/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Calculates the constant "e".
 * Latest version: 3:24 AM, 4/8/2020. Instead of calculating the entire factorial 
 *  every single iteration, we now multiply factorial with counter every iteration 
 *  to get "factorial counter". We start the iteration from 1 instead of 0 and 
 *  we start total from 1 instead of 0 because we dont want to have an extra 
 *  calculation "if (counter > 1)" before "factorial *= counter;". This allowed 
 *  us to get rid of memory and calculation for tempCounter too.
 * Older versions: 7:37 PM, 5/20/2017. Changed comments.
 *		4:49 PM, 8/9/2016
 */

import java.util.Scanner;

public class FactorialB
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int factorial = 1;
		int counter = 1;
		int iterationNumber;
		double total = 1;

		System.out.print("Enter iteration number: ");
		iterationNumber = input.nextInt();

		while (counter < iterationNumber)
		{
			factorial *= counter;

			total += (1.0 / factorial);
			System.out.println(total);

			counter++;
		}
	}
}

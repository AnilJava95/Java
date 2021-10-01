/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Calculates factorial.
 * Latest version: 7:36 PM, 5/20/2017. Changed comments.
 * Older versions: 2:17 PM, 8/9/2016
 */

import java.util.Scanner;

public class FactorialA
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int total = 1;
		int number;

		System.out.print("Enter a nonnegative integer to calculate its factorial: ");
		number = input.nextInt();

		while (number > 1)
		{
			total *= number;
			number--;
		}

		System.out.println(total);
	}
}

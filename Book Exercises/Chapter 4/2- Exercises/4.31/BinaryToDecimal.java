/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Converts binary number to decimal.
 * Latest version: 7:05 PM, 5/20/2017. Changed comments.
 * Older versions: 3:24 PM, 5/6/2016
 */

import java.util.Scanner;

public class BinaryToDecimal
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int number;
		int total = 0;
		int coefficient = 1;

		System.out.print("Enter a binary number: ");
		number = input.nextInt();

		while (number > 0)
		{
			total += (number % 10) * coefficient;
			number /= 10;
			coefficient *= 2;
		}
		System.out.println("Number in decimal form is: " + total);
	}
}

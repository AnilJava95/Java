/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Outputs a tabular data. Columns are N, N^2 N^3 N^4. Rows 
 *  number is taken from user.
 * Latest version: 10:03 PM,4/7/2020. Instead of multiplying counter 2, 3, 4 
 *  times respectively to find n^2, n^3, and n^4, we now use n2, n3, n4 variables.
 * Older versions: 6:01 PM, 5/20/2017. Changed comments.
 *		8:35 PM, 8/2/2016
 */

import java.util.Scanner;

public class TabularOutput
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int rowNumber;
		int counter = 1;
		int n2; // n^2
		int n3; // n^3
		int n4; // n^4

		System.out.print("Input row number: ");
		rowNumber = input.nextInt();
		System.out.println("");

		System.out.printf("%4s%6s%6s%6s", "N", "N^2", "N^3", "N^4");
		System.out.println("");
		System.out.println("");

		while (counter <= rowNumber)
		{
			n2 = counter * counter;
			n3 = n2 * counter;
			n4 = n3 * counter;
			System.out.printf("%4d%6d%6d%6d%n", counter, n2, n3, n4);

			counter++;
		}
	}
}

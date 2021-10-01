/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Prints a right angled triangle with the size taken from user.
 * Latest version: 6:59 PM, 5/20/2017. Changed comments.
 * Older versions: 1:15 PM, 8/6/2016
 */

import java.util.Scanner;

public class RightAngledTriangle
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int rowNumber;
		int rowCounter = 1;
		int columnCounter = 1;

		System.out.print("Enter row number: ");
		rowNumber = input.nextInt();

		while (rowCounter <= rowNumber)
		{
			while (columnCounter <= rowCounter)
			{
				System.out.print("*");
				columnCounter++;
			}
			System.out.println("");
			columnCounter = 1;
			rowCounter++;
		}
	}
}

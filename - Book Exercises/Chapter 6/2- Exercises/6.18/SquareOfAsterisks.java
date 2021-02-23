/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Takes length of side of a square from user and prints 
 *  the square made out of asterisks.
 * Latest version: 7:39 PM, 6/30/2017
 * Older versions: 
 */

import java.util.Scanner;

public class SquareOfAsterisks
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int sideLength;

		System.out.print("Enter length of asterisk square: ");
		sideLength = input.nextInt();

		squareOfAsterisks(sideLength);
	}

	public static void squareOfAsterisks(int sideLength)
	{
		for (int counter1 = 1; counter1 <= sideLength; counter1++)
		{
			for (int counter2 = 1; counter2 <= sideLength; counter2++)
			{
				System.out.print('*');
			}
			System.out.printf("%n");
		}
	}
}

/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Takes sales amounts of 10 salesman and finds
 *  the largest number and its place.
 * Latest version: 5:59 PM, 5/20/2017. Changed comments.
 * Older versions: 7:36 PM, 8/2/2016
 */

import java.util.Scanner;

public class FindTheLargestNumber
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int counter = 1;
		int largestNumber = 0;
		int number;
		int placeOfLargestSales = 0;

		while (counter <= 10)
		{
			System.out.printf("Input number of units sold by salesman no %d: ", counter);
			number = input.nextInt();

			if (number > largestNumber)
			{
				largestNumber = number;
				placeOfLargestSales = counter;
			}

			counter++;
		}

		System.out.println("");
		System.out.printf("Largest number is %d and its place is %d.%n", largestNumber,
			placeOfLargestSales);
	}
}

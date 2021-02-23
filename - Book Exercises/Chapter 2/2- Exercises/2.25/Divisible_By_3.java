/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Takes an integer from user and checks if it is divisible 
 *  by 3.
 * Latest version: 12:00 AM, 1/27/2019 Changed "if( number1 % 3 != 0)" with "else".
 * Older versions: 7:39 AM, 4/18/2017. Changed comments.
 *		5:19 PM, 6/19/2016
 */

import java.util.Scanner;

public class Divisible_By_3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int number1;

		System.out.print("Enter an integer: ");
		number1 = input.nextInt();

		if (number1 % 3 == 0)
			System.out.print("Number is divisible by 3");
		else
			System.out.print("Number is not divisible by 3");
	}
}

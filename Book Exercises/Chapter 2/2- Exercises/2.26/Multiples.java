/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Takes two integers from user and checks if triple of 
 *  first number is multiple of double of second number.
 * Latest version: 5:55 PM, 1/28/2019. Changed "number1 = number1 * number1 * number1;"
 *  to "number1Tripled = number1 * 3;". Same with number2. Also used "if else" 
 *  instead of "if if". Also changed 2x print methods with 1x print 
 *  method with string concatenation.
 * Older versions: 7:44 AM, 4/18/2017. Changed comments.
 *		5:55 PM, 6/19/2016
 */

import java.util.Scanner;

public class Multiples
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int number1;
		int number2;
		int number1Tripled;
		int number2Doubled;

		System.out.print("Enter first integer: ");
		number1 = input.nextInt();

		System.out.print("Enter second integer: ");
		number2 = input.nextInt();

		number1Tripled = number1 * 3;
		number2Doubled = number2 * 2;

		if (number1Tripled % number2Doubled == 0)
		{
			System.out.print("First number tripled is multiple of second number "
				+ "doubled");
		}
		else
		{
			System.out.print("First number tripled is not multiple of second number "
				+ "doubled");
		}
	}
}

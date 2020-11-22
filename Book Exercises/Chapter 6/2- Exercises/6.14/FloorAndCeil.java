/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: User inputs a double value, program calculates floor and 
 *  ceil of the value without using API floor and ceil methods.
 * Latest version: 2:08 PM, 4/29/2020. Changed "isInt(number) == true" with 
 *  "isInt(number)"
 * Older versions: 11:29 AM, 2/7/2019. Changed isInt method from (number * 10 % 10 == 0) 
 *  to ((int) number  == number).
 *		4:30 PM, 6/30/2017
 */

import java.util.Scanner;

public class FloorAndCeil
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		double number;
		System.out.print("Enter number to finds its floor and ceil: ");
		number = input.nextDouble();

		System.out.printf("floor(number) = %d%n", floor(number));
		System.out.printf("ceil(number) = %d%n", ceil(number));
	}

	public static boolean isInt(double number)
	{
		if ((int) number == number)
			return true;
		else
			return false;
	}

	public static int floor(double number)
	{
		if (isInt(number))
			return (int) number;
		else if (number >= 0)
			return (int) number;
		else
			return (int) number - 1;
	}

	public static int ceil(double number)
	{
		if (isInt(number))
			return (int) number;
		else if (number <= 0)
			return (int) number;
		else
			return (int) number + 1;
	}
}

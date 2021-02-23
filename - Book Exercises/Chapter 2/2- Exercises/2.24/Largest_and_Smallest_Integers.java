/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Inputs 5 integers. Displays smallest and largest of the 
 *  numbers.
 * Latest version: 3:46 PM, 4/1/2020. Changed "if (number2 > max)" with 
 *  "else if (number2 > max)" to make it more efficient.
 * Older versions: 7:34 AM, 4/18/2017. Changed comments.
 *		5:00 PM, 6/10/2016
 */

import java.util.Scanner;

public class Largest_and_Smallest_Integers
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int number1;
		int number2;
		int number3;
		int number4;
		int number5;
		int min;
		int max;

		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		min = max = number1;

		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		if (number2 < min)
			min = number2;
		else if (number2 > max)
			max = number2;

		System.out.print("Enter third integer: ");
		number3 = input.nextInt();
		if (number3 < min)
			min = number3;
		else if (number3 > max)
			max = number3;

		System.out.print("Enter fourth integer: ");
		number4 = input.nextInt();
		if (number4 < min)
			min = number4;
		else if (number4 > max)
			max = number4;

		System.out.print("Enter fifth integer: ");
		number5 = input.nextInt();
		if (number5 < min)
			min = number5;
		else if (number5 > max)
			max = number5;

		System.out.printf("Smallest is: %d%n", min);

		System.out.printf("Largest is: %d%n", max);
	}
}

/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Inputs 3 integers, displays sum, average, product, 
 *  smallest and largest of the numbers.
 * Latest version: 3:25 PM, 4/1/2020. Changed "if (number2 > max)" with 
 *  "else if (number2 > max)" to make it more efficient. Also, instead of 
 *  calculating sum twice in both printf methods, now it uses a sum variable.
 * Older versions: 7:06 AM, 4/18/2017. Changed comments.
 *		4:52 PM, 6/19/2016. Changed way of finding smallest and 
 *  largest.
 *		4:21 PM, 6/19/2016
 */

import java.util.Scanner;

public class Arithmetic_Smallest_And_Largest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int number1;
		int number2;
		int number3;
		int min;
		int max;
		int sum;

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

		sum = number1 + number2 + number3;
		System.out.printf("Sum is: %d%n", sum);

		System.out.printf("Average is: %d%n", sum / 3);

		System.out.printf("Product is: %d%n", number1 * number2 * number3);

		System.out.printf("Smallest is: %d%n", min);

		System.out.printf("Largest is: %d%n", max);
	}
}

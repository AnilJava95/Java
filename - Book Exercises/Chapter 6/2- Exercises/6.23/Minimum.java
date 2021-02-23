/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: User inputs 3 float values and program finds the minimum 
 *  value.
 * Latest version: 11:44 PM, 6/30/2017
 * Older versions: 
 */

import java.util.Scanner;

public class Minimum
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		float number1;
		float number2;
		float number3;
		float minimumNumber;

		System.out.println("Enter 3 numbers to find the minimum");

		System.out.print("Enter number1: ");
		number1 = input.nextFloat();

		System.out.print("Enter number2: ");
		number2 = input.nextFloat();

		System.out.print("Enter number3: ");
		number3 = input.nextFloat();

		minimumNumber = minimum3(number1, number2, number3);
		System.out.printf("Minimum number is %.2f", minimumNumber);
	}

	public static float minimum3(float number1, float number2, float number3)
	{
		float minimumNumber = Math.min(number1, number2);

		minimumNumber = Math.min(minimumNumber, number3);

		return minimumNumber;
	}
}

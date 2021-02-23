/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: User inputs side1 and side2 of a right triangle. Program
 *  calculates and prints the hypotenuse along with its sides.
 * Latest version: 5:06 PM, 6/30/2017
 * Older versions: 
 */

import java.util.Scanner;

public class HypotenuseCalculations
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		double side1;
		double side2;
		double hypotenuse;

		System.out.print("Enter length of side1 or enter 0 to exit the program: ");
		side1 = input.nextDouble();

		while (side1 != 0)
		{
			System.out.print("Enter length of side2: ");
			side2 = input.nextDouble();

			hypotenuse = calculateHypotenuse(side1, side2);

			System.out.printf("Side1 = %.2f, side2 = %.2f, hypotenuse = %.2f", 
				side1, side2, hypotenuse);

			System.out.printf("%n%nEnter length of side1 or enter 0 to exit the program: ");
			side1 = input.nextDouble();
		}
	}

	public static double calculateHypotenuse(double side1, double side2)
	{
		double hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
		return hypotenuse;
	}
}

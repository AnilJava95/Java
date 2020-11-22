/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Takes lengths of three sides of a triangle and calculates 
 *  if it is a valid right triangle.
 * Latest version: 7:28 PM, 5/20/2017. Changed comments.
 * Older versions: 8:15 AM, 8/9/2016
 */

import java.util.Scanner;
//import static java.lang.Math.abs;

public class SidesOfARightTriangle
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		float firstSide;
		float secondSide;
		float thirdSide;

		System.out.print("Enter first side: ");
		firstSide = input.nextFloat();
		System.out.print("Enter second side: ");
		secondSide = input.nextFloat();
		System.out.print("Enter third side: ");
		thirdSide = input.nextFloat();

		if ((firstSide * firstSide) + (secondSide * secondSide) == (thirdSide * thirdSide))
			System.out.println("Valid right triangle.");
		else
			System.out.println("Invalid right triangle.");
	}
}

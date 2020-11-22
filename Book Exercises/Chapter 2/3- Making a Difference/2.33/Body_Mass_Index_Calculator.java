/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Takes height and weight of user and prints body mass 
 *  index of user. Also prints BMI table first.
 * Latest version: 12:09 PM, 4/18/2017. Changed comments.
 * Older versions: 12:07 AM, 6/21/2016
 */

import java.util.Scanner;

public class Body_Mass_Index_Calculator
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		float weight;
		float height;

		// print BMI table
		System.out.print("BMI VALUES\nUnderweight: less than 18.5\n");
		System.out.print("Normal:      between 18.5 and 24.9\n");
		System.out.print("Overweight:  between 25 and 29.9\n");
		System.out.print("Obese:       30 or greater\n\n");

		System.out.print("Enter weight in Kilograms: ");
		weight = input.nextFloat();

		System.out.print("Enter height in meters: ");
		height = input.nextFloat();

		System.out.printf("Your BMI is: %f%n", weight / (height * height));
	}
}

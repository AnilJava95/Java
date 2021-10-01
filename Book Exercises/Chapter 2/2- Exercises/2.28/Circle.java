/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Takes radius of circle from user and prints diameter, 
 *  circumference and area of circle.
 * Latest version: 7:56 AM, 4/18/2017. Changed comments.
 * Older versions: 9:08 PM, 6/19/2016
 */

import java.util.Scanner;

public class Circle
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int radius;

		System.out.print("Enter radius: ");
		radius = input.nextInt();

		System.out.printf("Diameter is: %d%n", 2 * radius);
		System.out.printf("Circumference is: %f%n", 2 * Math.PI * radius);
		System.out.printf("Area is: %f%n", Math.PI * radius * radius);
	}
}

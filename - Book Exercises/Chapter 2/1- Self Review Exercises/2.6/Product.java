/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Calculates product of three integers.
 * Latest version: 5:34 AM, 4/18/2017. Changed comments and the convention on 
 *  reading variables.
 * Older versions: 1:56 AM, 6/19/2016
 */

import java.util.Scanner;

public class Product
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int x;
		int y;
		int z;
		int result;

		System.out.print("Enter first integer: ");
		x = input.nextInt();

		System.out.print("Enter second integer: ");
		y = input.nextInt();

		System.out.print("Enter third integer: ");
		z = input.nextInt();

		result = x * y * z;

		System.out.printf("Product is %d%n", result);
	}
}

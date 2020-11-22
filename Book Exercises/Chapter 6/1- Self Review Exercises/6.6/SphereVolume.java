/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Takes radius of a sphere from user, calculates volume and 
 *  prints it.
 * Latest version: 10:04 AM, 6/30/2017
 * Older versions: 
 */

import java.util.Scanner;

public class SphereVolume
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		double radius;
		double volume;

		System.out.print("Enter radius of a sphere to find its volume: ");
		radius = input.nextDouble();
		volume = sphereVolume(radius);
		System.out.printf("Volume of the sphere is %.2f%n", volume);
	}

	public static double sphereVolume(double radius)
	{
		double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		return volume;
	}
}

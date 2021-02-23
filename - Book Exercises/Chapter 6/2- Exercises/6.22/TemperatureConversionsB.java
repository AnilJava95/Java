/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Takes a kelvin value from user and calculates celsius 
 *  equivalent.
 * Latest version: 10:45 PM, 6/30/2017
 * Older versions: 
 */

import java.util.Scanner;

public class TemperatureConversionsB
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		double celsius;
		double kelvin;

		System.out.print("Enter kelvin to find it's celsis equivalent: ");
		kelvin = input.nextDouble();

		celsius = calculateCelsius(kelvin);

		System.out.printf("Kelvin: %.2f, Celsius: %.2f%n", kelvin, celsius);
	}

	public static double calculateCelsius(double kelvin)
	{
		double celsius = kelvin - 273.15;
		return celsius;
	}
}

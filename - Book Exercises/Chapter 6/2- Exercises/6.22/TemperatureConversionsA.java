/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Takes a celsius value from user and calculates kelvin 
 *  equivalent.
 * Latest version: 10:30 PM, 6/30/2017
 * Older versions: 
 */

import java.util.Scanner;

public class TemperatureConversionsA
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		double celsius;
		double kelvin;

		System.out.print("Enter celsius to find it's kelvin equivalent: ");
		celsius = input.nextDouble();

		kelvin = calculateKelvin(celsius);

		System.out.printf("Celsius: %.2f, Kelvin: %.2f%n", celsius, kelvin);
	}

	public static double calculateKelvin(double celsius)
	{
		double kelvin = celsius + 273.15;
		return kelvin;
	}
}

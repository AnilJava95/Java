/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Enter kelvin or celsius to find its counterpart.
 * Latest version: 14:18 07/02/2019. Instead of doing one after another, i gave 
 *  the user the option to choose which calculation he wants to do.
 * Older versions: 23:10 30/06/2017.
 */

import java.util.Scanner;

public class TemperatureConversionsC
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      double celsius;
      double kelvin;
		char selection;
      
		System.out.print("Type 'c' for celsius to kelvin calculation. "
			+ "Type 'k' for kelvin to celsius calculation: ");
		selection = input.next().charAt(0);
		System.out.println();
		
		if (selection == 'c')
		{
			// Enter celsius, calculate kelvin
			System.out.print("Enter celsius to find it's kelvin equivalent: ");
			celsius = input.nextDouble();

			kelvin = calculateKelvin(celsius);

			System.out.printf("Celsius: %.2f, Kelvin: %.2f%n", celsius, kelvin);
		}
		else if (selection == 'k')
		{
			// Enter kelvin, calculate celsius
			System.out.print("Enter kelvin to find it's celsis equivalent: ");
			kelvin = input.nextDouble();

			celsius = calculateCelsius(kelvin);

			System.out.printf("Kelvin: %.2f, Celsius: %.2f%n", kelvin, celsius);
		}
		else
		{
			System.out.println("Wrong input.");
		}
   }
   
   public static double calculateKelvin(double celsius)
   {
      double kelvin = celsius + 273.15;
      return kelvin;
   }
   
   public static double calculateCelsius(double kelvin)
   {
      double celsius = kelvin - 273.15;
      return celsius;
   }
}
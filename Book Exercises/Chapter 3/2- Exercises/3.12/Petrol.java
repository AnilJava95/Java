/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: This class is a driver class for PetrolPurchase class.
 *  Demonstrates capabilities of PetrolPurchase class.
 * Latest version: 6:50 PM, 4/3/2020. getPurchaseAmount method doesnt require 
 *  three arguments anymore. Changed "Percentege" to "Percentage". Instead of 
 *  keeping inputs in variables, we now directly pass inputs to methods.
 * Older versions: 1:42 PM, 4/28/2017. Changed comments. Changed next to nextLine
 *  when reading location.
 *		8:40 PM, 7/3/2016
 */

import java.util.Scanner;

public class Petrol
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		// Instantiating an object.
		PetrolPurchase station1 = new PetrolPurchase("New York", "Gasoline", 13,
			1.13, 4.75);

		// Setting values.
		System.out.print("Enter location of station1: ");
		String location = input.nextLine();
		station1.setLocationOfStation(location);

		System.out.print("Enter petrol type: ");
		String petrolType = input.nextLine();
		station1.setPetrolType(petrolType);

		System.out.print("Enter purchase in liters: ");
		station1.setPurchaseInLiters(input.nextInt());

		System.out.print("Enter liter price: ");
		station1.setLiterPrice(input.nextDouble());

		System.out.print("Enter discount percentege: ");
		station1.setDiscountPercentage(input.nextDouble());

		System.out.println("");

		// Getting values and printing.
		System.out.println("Station name: " + station1.getLocationOfStation());
		System.out.println("Petrol Type: " + station1.getPetrolType());
		System.out.println("Purchase amount in liters: " + station1.
			getPurchaseInLiters());
		System.out.println("Price of one liter: " + station1.getLiterPrice());
		System.out.println("Discount percentege: " + station1.getDiscountPercentage());

		// Calculating and getting net purchase.
		System.out.println("Net purchase = " + station1.getPurchaseAmount());
	}
}

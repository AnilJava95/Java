/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: This class is a driver class for PetrolPurchase class.
 *  Demonstrates capabilities of PetrolPurchase class.
 * Latest version: 13:42 28/04/2017. Changed comments. Changed next to nextLine
 *  when reading location.
 * Older versions: 20:40 03/07/2016
 */

import java.util.Scanner;

public class Petrol
{
   public static void main(String[] args)
   {
      double netPurchase;
      
      Scanner input = new Scanner(System.in);
      
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
      int purchaseInLiters = input.nextInt();
      station1.setPurchaseInLiters(purchaseInLiters);
      
      System.out.print("Enter liter price: ");
      double literPrice = input.nextDouble();
      station1.setLiterPrice(literPrice);
      
      System.out.print("Enter discount percentege: ");
      double discountPercentege = input.nextDouble();
      station1.setDiscountPercentege(discountPercentege);
      
      System.out.println("");
      
      // Getting values and printing.
      System.out.println("Station name: " + station1.getLocationOfStation());
      System.out.println("Petrol Type: " + station1.getPetrolType());
      System.out.println("Purchase amount in liters: " + station1.
			getPurchaseInLiters());
      System.out.println("Price of one liter: " + station1.getLiterPrice());
      System.out.println("Discount percentege: " + station1.
			getDiscountPercentege());
      
      // Calculating and getting net purchase.
      netPurchase = station1.getPurchaseAmount(purchaseInLiters, literPrice, 
			discountPercentege);
      System.out.println("Net purchase = " + netPurchase);
   }
}

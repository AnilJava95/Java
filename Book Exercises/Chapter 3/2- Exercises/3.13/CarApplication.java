/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Driver class for class Car. Demonstrates
 *    abilities of class Car.
 * Latest version: 14:40 28/04/2017. Changed comments. Removed prnts for command
 *    line
 * Older versions: 18:41 04/07/2016
 */

public class CarApplication
{
   public static void main(String[] args)
   {
      Car car1 = new Car("GTR", "2016", 100_000.00);
      Car car2 = new Car("Tesla S", "2016", 70_000.00);
      
      // printing prices of car objects
      System.out.println("Price of " + car1.getModelName() + " is " + 
              car1.getPrice());
      System.out.println("Price of " + car2.getModelName() + " is " + 
              car2.getPrice());
      
      car1.discount(5);  // applying discounts
      car2.discount(7);
      
      System.out.println(""); // blank line to make it look nice
      
      // printing discounted prices of car objects
      System.out.println("Discounted price of " + car1.getModelName() + " is " + 
              car1.getPrice());
      System.out.println("Discounted price of " + car2.getModelName() + " is " + 
              car2.getPrice());
   }
}
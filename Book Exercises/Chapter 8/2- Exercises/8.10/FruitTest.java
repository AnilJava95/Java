/*
 * Author's name and email: Michael
 * Program description: Test the Fruit enum type.
 * Latest version: 1:39 PM, 9/6/2019.
 * Older versions: 
 */

public class FruitTest
{
   public static void main(String[] args)
   {
		System.out.println("Plants: ");
		
		// Print all plants in enum Fruit
		for (Fruit fruit : Fruit.values())
		{
			System.out.printf("%-10s%-10s%-10s%n", fruit, fruit.getType(), 
				fruit.getCalories());
		}
   }
}
/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Test the Food enum type.
 * Latest version: 1:39 PM, 9/6/2019
 * Older versions: 
 */

public class FoodTest
{
	public static void main(String[] args)
	{
		System.out.println("Food: ");

		// Print all food in enum Food
		for (Food food : Food.values())
		{
			System.out.printf("%-10s%-10s%-10s%n", food, food.getType(),
				food.getCalories());
		}
	}
}

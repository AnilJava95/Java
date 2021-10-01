/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Takes number of stones(2.3 million), weight of stones 
 *  (2.3 ton) and number of years it took to built the giza pyramid(20 years) 
 *  and prints tonnes built per year, hour and minute.
 * Latest version: 12:16 PM 4/18/2017. Comments changed.
 * Older versions: 2:32 AM, 6/21/2016
 */

import java.util.Scanner;

public class Statistics_for_the_Great_Pyramid_of_Giza
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int stoneNum;
		float stoneWeight;
		int builtTime;
		float totalWeight;

		System.out.print("Enter estimated number of stones used: ");
		stoneNum = input.nextInt();

		System.out.print("Enter estimated weight(in tons) of stones used: ");
		stoneWeight = input.nextFloat();

		System.out.print("Enter estimated amount of years took to built the pyramid: ");
		builtTime = input.nextInt();

		totalWeight = stoneNum * stoneWeight;

		System.out.printf("%nTotal weight: %,.2f tons%n", totalWeight);
		System.out.printf("%n%,.2f tons were built each year%n", totalWeight / 
			builtTime);
		System.out.printf("%.2f tons were built each hour%n", totalWeight / 
			builtTime / 365 / 24);
		System.out.printf("%.2f tons were built each minute%n", totalWeight / 
			builtTime / 365 / 24 / 60);
	}
}

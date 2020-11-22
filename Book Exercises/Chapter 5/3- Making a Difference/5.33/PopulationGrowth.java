/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Predict future population.
 * Latest version: 3:58 PM, 2/6/2019. Stopped using growthRate as counter. Old 
 *  version had to divide growthRate by 100 every single time it was used.
 * Older versions: 2:12 AM, 6/10/2017. Changed comments. Minor changes.
 *		4:35 PM, 9/11/2016
 */

public class PopulationGrowth
{
	public static void main(String[] args)
	{
		long population = 1_350_000_000;
		float growthRate = 0.01F;

		for (int counter = 1; counter <= 7; counter++)
		{
			System.out.printf("Growth rate: %,d%n%n", counter);

			for (int counter2 = 1; counter2 <= 10; counter2++)
			{
				System.out.printf("Year: %d   Population: %,d%n", counter2, population);
				population *= Math.pow(Math.E, growthRate * growthRate);
				//population += population * growthRate;
			}

			growthRate += 0.01F;
			population = 1_350_000_000;
			System.out.println();
		}
	}
}

/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: 
 * Latest version: 8:30 PM, 5/20/2017. Changed comments.
 * Older versions: 9:07 PM, 8/14/2016
 */

public class WaterScarcity
{
	public static void main(String[] args)
	{
		int population = 91_812_566;
		double populationGrowth = 1.0225;
		double populationGrowthDecrease = 0.0008;
		long waterSource = 70_749_000_000L;
		float waterPerCapita;
		int year = 2014;

		System.out.printf("%s%15s%20s%n%n", "Year", "Population",
			"Water Per Capita");

		while (year <= 2030)
		{
			waterPerCapita = (float) waterSource / population;

			System.out.printf("%4d%,15d%20.2f%n", year, population, waterPerCapita);

			++year;
			population *= populationGrowth;
			populationGrowth -= populationGrowthDecrease;
		}
	}
}

/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Used the web to determine the current world population 
 *  and the annual world population growth rate. This application takes these 
 *  values and displays the estimated world population after one, two, three, 
 *  four, five years.
 * Latest version: 3:37 PM, 1/29/2019. Changed mistakes on numbers(pop, growthRate, 
 *	 growthRateChange). growthRate is changed from 1.013 to 1.0114. growthRateChange 
 *  is changed from 0.02 to 0.0002.
 * Older versions: 6:40 AM, 4/19/2017. Comments changed. I used to multiply pop with 
 *  1.13 but that increases pop by %13. Multiplying with 1.013 increases pop 
 *  by  %1.3. And in order to decrease growth rate from %1.3 to %1.1 you need 
 *  to subtract 0.02 from 0.013. But you need to realize growth rate change will 
 *	 decrease as it goes down to 0 and negative values.
 *		7/21/2016. Unfinished version due to not being able to use long for world population.
 */

public class World_Population_Growth_Calculator
{
	public static void main(String[] args)
	{
		short year = 2016;
		long pop = 7_466_964_280L; // Population in 2016
		float growthRate = 1.0114F; // Growth rate in 2016 (%1.14)
		float growthRateChange = 0.0002F;

		System.out.printf("Population in %d: %,d%n", year++, pop);
		System.out.printf("Population in %d: %,d%n", year++, pop *= growthRate);
		System.out.printf("Population in %d: %,d%n", year++, pop *= (growthRate
			-= growthRateChange));
		System.out.printf("Population in %d: %,d%n", year++, pop *= (growthRate
			-= growthRateChange));
		System.out.printf("Population in %d: %,d%n", year++, pop *= (growthRate
			-= growthRateChange));
		System.out.printf("Population in %d: %,d%n", year++, pop *= (growthRate
			-= growthRateChange));
	}
}

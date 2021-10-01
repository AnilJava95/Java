/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Calculating value o pi using numerical methods approach.
 * Latest version: 6:30 AM, 4/19/2020. Changed "Math.pow(-1, power)" to power.
 *  Changed "power += 1;" to "power *= 1;". Both take same time to execute so i'm 
 *  gonna assume the compiler optimizes -1^n.
 * Older versions: 4:32 AM, 10/16/2017. Added a comma to counter to make it easier 
 *  to read. Takes 136,120 terms to get to 3.14159.
 *		6:59 PM, 6/9/2017. Changed comments and printing format. Also 
 *  added a percentege difference display from last result.
 *    12:10 AM, 9/7/2016
 */

public class CalculatingtheValueofPi
{
	public static void main(String[] args)
	{
		double pi = 4;
		int power = 1;
		int denominator = 3;

		double difference;
		double lastPi;

		for (int counter = 1; counter <= 200_000; counter++)
		{
			lastPi = pi;
			pi += power * ((double) 4 / denominator);
			// 2.66 / 4 = 0.66. This means 2.66 is 66% of 4. This means 2.66 is what 
			// you get when you decrease 4 by 33%.
			difference = Math.abs((pi / lastPi - 1) * 100);
			System.out.printf("%,5d: %.15f difference = %f%%%n", counter, pi, difference);

			denominator += 2;
			power *= -1;
		}
	}
}

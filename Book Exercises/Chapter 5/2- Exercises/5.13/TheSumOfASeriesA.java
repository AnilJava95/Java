/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Find the summation of the sequence of numbers 1 to n. 
 *  n could be 1 to 100.
 * Latest version: 12:52 PM, 9/2/2019. Changed sum from 1 to 0.
 * Older versions: 1:03 AM, 6/9/2017. Changed comments.
 *		9:00 PM, 9/5/2016
 */

public class TheSumOfASeriesA
{
	public static void main(String[] args)
	{
		long sum = 0;

		System.out.printf("%3c %7s%n%n", 'n', "Sum");

		for (int counter = 1; counter <= 100; counter++)
		{
			sum += counter;

			System.out.printf("%3d %7d%n", counter, sum);
		}
	}
}

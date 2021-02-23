/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Calculates sum of integers between 1 and 30 that are 
 *  divisible by 3.
 * Latest version: 12:00 AM, 6/9/2017. Changed comments.
 * Older versions: 6:10 AM, 9/5/2016
 */

public class IntegersDivisibleBy3
{
	public static void main(String[] args)
	{
		int sum = 0;

		for (int counter = 3; counter <= 30; counter += 3)
		{
			//if (counter % 3 == 0)
			//{
			sum += counter;
			//}
		}

		System.out.println("Sum is: " + sum);
	}
}

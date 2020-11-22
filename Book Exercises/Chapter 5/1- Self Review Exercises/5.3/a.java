/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Sum of odd integers between 1 and 99.
 * Latest version: 4:49 PM, 6/8/2017. Changed comments.
 * Older versions: 2:00 PM, 9/4/2016
 */

public class a
{
	public static void main(String[] args)
	{
		int sum = 0;

		for (int counter = 1; counter <= 99; counter += 2)
		{
			sum += counter;
		}

		System.out.println(sum);
	}
}

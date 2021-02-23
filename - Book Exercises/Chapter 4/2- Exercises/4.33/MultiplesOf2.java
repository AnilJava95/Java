/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Prints multiples of 2. Notice how last number is negative 
 *  because we are using signed long. Numbers after that are 0 because when we 
 *  multiply a number by 2 we shift its bits left and feed 0 from right.
 * Latest version: 7:10 PM, 6/20/2017. Changed comments.
 * Older versions: 2:58 AM, 8/8/2016
 */

public class MultiplesOf2
{
	public static void main(String[] args)
	{
		long x = 1;

		while (true)
		{
			System.out.println(x);
			if (x == 0)
				break;
			x *= 2;
		}
	}
}

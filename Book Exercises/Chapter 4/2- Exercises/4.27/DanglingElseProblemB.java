/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Testing the exercises on book.
 * Latest version: 6:31 PM, 5/20/2017. Changed comments.
 * Older versions: 11:45 AM, 8/6/2016
 */

public class DanglingElseProblemB
{
	public static void main(String[] args)
	{
		int x = 9;
		int y = 11;

		if (x < 10)
		{
			if (y > 10)
			{
				System.out.println("*****");
			}
		}
		else
		{
			System.out.println("#####");
			System.out.println("$$$$$");
		}
	}
}

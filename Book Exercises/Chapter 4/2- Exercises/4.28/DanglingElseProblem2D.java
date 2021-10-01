/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Testing the exercises on book.
 * Latest version: 6:58 PM, 5/20/2017. Changed comments.
 * Older versions: 12:19 PM, 8/6/2016
 */

public class DanglingElseProblem2D
{
	public static void main(String[] args)
	{
		int x = 5;
		int y = 7;

		if (y == 8)
		{
			if (x == 5)
			{
				System.out.println("@@@@@");
			}
		}
		else
		{
			System.out.println("#####");
			System.out.println("$$$$$");
			System.out.println("&&&&&");
		}
	}
}

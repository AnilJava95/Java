/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Testing the exercises on book.
 * Latest version: 6:57 PM, 5/20/2017. Changed comments.
 * Older versions: 12:19 PM, 8/6/2016
 */

public class DanglingElseProblem2B_C
{
	public static void main(String[] args)
	{
		int x = 5;
		int y = 8;

		if (y == 8)
		{
			if (x == 5)
			{
				System.out.println("@@@@@");
			}
			else
			{
				System.out.println("#####");
				System.out.println("$$$$$");
				System.out.println("&&&&&");
			}
		}
	}
}

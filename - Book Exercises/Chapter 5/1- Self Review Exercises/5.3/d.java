/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Repeat part c using a for statement.
 * Latest version: 5:15 PM, 6/8/2017. Changed comments.
 * Older versions: 2:57 PM, 9/4/2016
 */

public class d
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 20; i++)
		{
			System.out.print(i);

			if ((i % 5) == 0)
				System.out.print("\n");
			else
				System.out.print("\t");
		}
	}
}

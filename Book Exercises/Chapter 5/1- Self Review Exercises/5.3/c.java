/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Print integers from 1 to 20. Print only five integers 
 *  per line.
 * Latest version: 4:58 PM, 6/8/2017. Changed comments.
 * Older versions: 2:55 PM, 9/4/2016
 */

public class c
{
	public static void main(String[] args)
	{
		int i = 1;

		while (i <= 20)
		{
			System.out.print(i);

			if ((i % 5) == 0)
				System.out.println("");
			else
				System.out.print("\t");

			i++;
		}
	}
}

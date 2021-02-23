/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Printing triangles on the book.
 * Latest version: 2:36 AM, 6/9/2017. Changed comments.
 * Older versions: 1:34 PM, 9/5/2016
 */

public class TrianglePrintingA
{
	public static void main(String[] args)
	{
		for (int counter1 = 1; counter1 <= 10; counter1++)
		{
			for (int counter2 = 1; counter2 <= counter1; counter2++)
				System.out.print("*");

			System.out.printf("%n");
		}
	}
}

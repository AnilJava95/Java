/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Printing triangles on the book.
 * Latest version: 2:38 AM, 6/9/2017. Changed comments.
 * Older versions: 11:35 PM, 9/5/2016
 */

public class TrianglePrintingB
{
	public static void main(String[] args)
	{
		for (int counter1 = 1; counter1 <= 10; counter1++)
		{
			for (int counter2 = 1; counter2 <= 11 - counter1; counter2++)
				System.out.print("*");

			System.out.printf("%n");
		}
	}
}

/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Print diamond shape with asterisks.
 * Latest version: 9:46 PM, 6/9/2017. Changed comments.
 * Older versions: 6:16 PM, 9/7/2016
 */

public class DiamondPrinting
{
	public static void main(String[] args)
	{
		int limit = 1;

		for (int counter1 = 1; counter1 <= 5; counter1++)
		{
			for (int counter4 = 1; counter4 <= 5 - counter1; counter4++)
				System.out.print(" ");

			for (int counter2 = 1; counter2 <= limit; counter2++)
				System.out.print("*");

			limit += 2;

			System.out.printf("%n");
		}

		limit = 7;

		for (int counter1 = 1; counter1 <= 4; counter1++)
		{
			for (int counter4 = 1; counter4 <= counter1; counter4++)
				System.out.print(" ");

			for (int counter2 = 1; counter2 <= limit; counter2++)
				System.out.print("*");

			System.out.printf("%n");

			limit -= 2;
		}
	}
}

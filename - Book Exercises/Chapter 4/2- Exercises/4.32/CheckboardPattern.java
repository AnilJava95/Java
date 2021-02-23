/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Prints a checkboard pattern with asterisks.
 * Latest version: 7:07 PM, 5/20/2017. Changed comments.
 * Older versions: 9:42 PM, 8/7/2016
 */

public class CheckboardPattern
{
	public static void main(String[] args)
	{
		int rowCounter = 1;
		int columnCounter = 1;

		while (rowCounter <= 8)
		{
			if (rowCounter % 2 == 1)
			{
				while (columnCounter <= 8)
				{
					System.out.print("*");
					System.out.print(" ");

					columnCounter++;
				}
				System.out.println("");
			}
			else
			{
				while (columnCounter <= 8)
				{
					System.out.print(" ");
					System.out.print("*");

					columnCounter++;
				}
				System.out.println("");
			}
			rowCounter++;
			columnCounter = 1;
		}
	}
}

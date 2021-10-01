/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Merged 4 triangles we printed at 5.15. But horizontally 
 *  not vertically. We divided each triangle into two parts. Asterisks and spaces.
 * Latest version: 2:16 PM, 2/6/2019. The change in TrianglePrintingD from 5.15 
 *  happened here too. Same changed was applied to first empty space printing for.
 * Older versions: 8:20 PM, 6/9/2017. Changed comments.
 *		1:56 PM, 9/7/2017
 */

public class ModifiedTrianglePrinting
{
	public static void main(String[] args)
	{
		for (int counter1 = 1; counter1 <= 10; counter1++)
		{
			for (int counter2 = 1; counter2 <= counter1; counter2++)
				System.out.print("*");

			for (int counter4 = 1; counter4 <= 10 - counter1; counter4++)
				System.out.print(" ");

			System.out.print("   ");

			for (int counter2 = 1; counter2 <= 11 - counter1; counter2++)
				System.out.print("*");

			for (int counter4 = 1; counter4 <= counter1 - 1; counter4++)
				System.out.print(" ");

			System.out.print("   ");

			for (int counter4 = 1; counter4 <= counter1 - 1; counter4++)
				System.out.print(" ");

			for (int counter2 = 1; counter2 <= 11 - counter1; counter2++)
				System.out.print("*");

			System.out.print("   ");

			for (int counter4 = 1; counter4 <= 10 - counter1; counter4++)
				System.out.print(" ");

			for (int counter2 = 1; counter2 <= counter1; counter2++)
				System.out.print("*");

			System.out.printf("%n");
		}
	}
}

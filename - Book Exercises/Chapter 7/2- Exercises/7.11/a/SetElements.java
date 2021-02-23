/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Sets elements between indexes 10-20 inclusive to 0.
 * Latest version: 10:53 AM, 2/11/2019. Changed display from "%d " to "%3d"
 * Older versions: 2:33 PM, 7/16/2017
 */

public class SetElements
{
	public static void main(String[] args)
	{
		int[] counts = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
			18, 19, 20, 21 };

		displayArray(counts);

		for (int counter = 10; counter <= 20; counter++)
			counts[counter] = 0;

		displayArray(counts);
	}

	public static void displayArray(int[] array)
	{
		for (int column : array)
			System.out.printf("%3d", column);

		System.out.println("");
	}
}

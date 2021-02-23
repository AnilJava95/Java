/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Display ten values of integer array bestScores, each on
 *  a new line.
 * Latest version: 2:43 PM, 7/16/2017
 * Older versions: 
 */

public class DisplayElements
{
	public static void main(String[] args)
	{
		int[] bestScores = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		displayArray(bestScores);
	}

	public static void displayArray(int[] array)
	{
		for (int column : array)
			System.out.printf("%d%n", column);

		System.out.println("");
	}
}

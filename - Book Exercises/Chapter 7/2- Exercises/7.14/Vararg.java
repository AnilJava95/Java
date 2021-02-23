/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: The calculateAverage method can take different number of 
 *  arguments and calculate the average.
 * Latest version: 7:57 PM, 7/16/2017
 * Older versions: 
 */

public class Vararg
{
	public static void main(String[] args)
	{
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 
			18, 19, 20 };

		int[] array2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.printf("Average of first array: %.2f%nAverage of second array: %.2f%n",
			calculateAverage(array), calculateAverage(array2));
	}

	public static double calculateAverage(int... array)
	{
		double average = 0;
		int total = 0;

		for (int element : array)
			total += element;

		average = (double) total / array.length;

		return average;
	}
}

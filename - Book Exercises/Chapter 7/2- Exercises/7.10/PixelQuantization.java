/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Takes a one dimensional array and quantizes the values. 
 *  Prints the before and after arrays.
 * Latest version: 2:25 PM, 7/16/2017
 * Older versions: 
 */

public class PixelQuantization
{
	public static void main(String[] args)
	{
		int[] array = { -5, 0, 15, 25, 45, 100, 180, 200 };

		displayArray(array);

		// Quantize pixel values held in array
		for (int column = 0; column < array.length; column++)
		{
			if (array[column] < 0)
				array[column] = 0;
			else if (array[column] <= 20)
				array[column] = 10;
			else if (array[column] <= 40)
				array[column] = 30;
			else if (array[column] <= 60)
				array[column] = 50;
			else if (array[column] <= 80)
				array[column] = 70;
			else if (array[column] <= 100)
				array[column] = 90;
			else if (array[column] <= 120)
				array[column] = 110;
			else if (array[column] <= 140)
				array[column] = 130;
			else if (array[column] <= 160)
				array[column] = 150;
			else if (array[column] <= 180)
				array[column] = 70;
			else
				array[column] = 190;
		}

		displayArray(array);
	}

	public static void displayArray(int[] array)
	{
		for (int column : array)
			System.out.printf("%d ", column);

		System.out.println("");
	}
}

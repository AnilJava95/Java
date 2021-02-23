/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: User inputs an array of integers, program removes dublicates 
 *  and displays the new array.
 * Latest version: 11:18 AM, 2/11/2019. Stopped displaying the empty array 
 *  initialized with -1 at the beginning of the program. I needed "displayArray" 
 *  method just to do that so i got rid of that method too.
 * Older versions: 4:51 PM, 7/16/2017
 */

import java.util.Scanner;

public class DublicateElimination
{
	public static void main(String[] args)
	{
		int[] array = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

		inputArray(array);

		displayArray2(array);

		System.out.println("Removing dublicates.");

		removeDublicates(array);

		displayArray2(array); // Dont display empty elements
	}

	public static void inputArray(int[] array)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter values between [10-100], both inclusive.");
		for (int counter = 0; counter < array.length; counter++)
		{
			System.out.printf("Enter %d. element: ", counter);
			array[counter] = input.nextInt();
		}
	}

	public static void removeDublicates(int[] array)
	{
		// The first for statement lets us do the dublicate checking for all elements
		// of the array. The second for statement 
		for (int counter = 0; counter < array.length; counter++)
			if (array[counter] == -1)
				continue;
			else
				for (int counter2 = counter + 1; counter2 < array.length; counter2++)
					if (array[counter] == array[counter2])
						array[counter2] = -1;
	}

	// Doesnt display the element if it is -1.
	public static void displayArray2(int[] array)
	{
		System.out.print("Array: ");
		for (int column : array)
			if (column == -1)
				continue;
			else
				System.out.printf("%d ", column);

		System.out.println("");
	}
}

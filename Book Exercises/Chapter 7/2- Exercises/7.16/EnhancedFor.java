/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Takes command line arguments and prints their absolute 
 *  values.
 * Latest version: 11:36 PM, 7/16/2017
 * Older versions: 
 */

public class EnhancedFor
{
	public static void main(String[] args)
	{
		printAbs(args);
	}

	public static void printAbs(String[] args)
	{
		int number;

		for (String string1 : args)
		{
			number = Math.abs(Integer.parseInt(string1));

			System.out.printf("%d ", number);
		}
	}
}

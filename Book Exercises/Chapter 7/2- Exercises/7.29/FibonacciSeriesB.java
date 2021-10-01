/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Prints fibonacci numbers in a table format to see which 
 *  fibonacci numbers the int data type can handle.
 * Latest version: 3:23 PM, 9/4/2019
 * Older versions: 
 */

public class FibonacciSeriesB
{
	public static void main(String[] args)
	{
		for (int counter = 1; counter <= 48; counter++)
			System.out.printf("%2d. fibonacci number is: %11d%n", counter,
				fibonacci(counter));
	}

	private static int fibonacci(int n)
	{
		int number1 = 0;
		int number2 = 1;

		if (n == 1)
			return 0;
		else if (n == 2)
			return 1;
		else
		{
			for (int counter = 3; counter <= n; counter++)
			{
				number2 += number1;
				number1 = number2 - number1;
			}
			return number2;
		}
	}
}

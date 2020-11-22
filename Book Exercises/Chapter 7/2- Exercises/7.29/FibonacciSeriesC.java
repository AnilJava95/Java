/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Prints fibonacci numbers in a table format to see which 
 *  fibonacci numbers the double data type can handle.
 * Latest version: 5:11 PM, 5/9/2020. Now we display results using the e 
 *  conversion character instead of f.
 * Older versions: 3:35 PM, 9/4/2019
 */

public class FibonacciSeriesC
{
	public static void main(String[] args)
	{
		double nthfibonacci;

		for (int counter = 1; counter <= 1500; counter++)
		{
			nthfibonacci = fibonacci(counter);
			System.out.printf("%4d. fibonacci number is: %20.15e%n", counter, nthfibonacci);
			if (nthfibonacci < 0)
				break;
		}
	}

	private static double fibonacci(int n)
	{
		double number1 = 0;
		double number2 = 1;

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

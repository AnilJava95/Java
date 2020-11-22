/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Finds perfect numbers and their divisors.
 * Latest version: 14:49 PM, 2/7/2019. Now the result display shows "factor1 + factor2 = number" 
 *  instead of "factor1 factor2".
 * Older versions: 1:07 AM, 7/1/2017
 */

public class PerfectNumbers
{
	public static void main(String[] args)
	{
		for (int counter1 = 1; counter1 <= 10_000; counter1++)
		{
			// If it is a perfect number, re find the factors and print them.
			if (isPerfect(counter1))
			{
				int halfCounter1 = counter1 / 2;

				for (int counter2 = 1; counter2 <= halfCounter1; counter2++)
					if (counter1 % counter2 == 0)
						System.out.print(" + " + counter2);
				System.out.println(" = " + counter1);
			}
		}
	}

	public static boolean isPerfect(int number)
	{
		int totalOfDivisors = 0;
		int halfNumber = number / 2;

		for (int counter = 1; counter <= halfNumber; counter++)
			if (number % counter == 0)
				totalOfDivisors += counter;

		if (number == totalOfDivisors)
			return true;
		else
			return false;
	}
}

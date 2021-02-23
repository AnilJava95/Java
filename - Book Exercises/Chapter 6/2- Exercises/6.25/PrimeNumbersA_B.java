/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Finds prime numbers from 2 to 10_000. Uses number / 2.
 * Latest version: 4:19 PM, 7/1/2017
 * Older versions: 
 */

public class PrimeNumbersA_B
{
	public static void main(String[] args)
	{
		for (int counter1 = 2; counter1 <= 10_000; counter1++)
			if (isPrime(counter1))
				System.out.println(counter1);
	}

	public static boolean isPrime(int number)
	{
		int halfNumber = number / 2;

		for (int counter = 2; counter <= halfNumber; counter++)
			if (number % counter == 0)
				return false;

		return true;
	}
}

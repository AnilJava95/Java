/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Finds prime numbers from 2 to 10_000. Uses sqrt(number).
 * Latest version: 4:20 PM, 7/1/2017
 * Older versions: 
 */

public class PrimeNumbersC
{
	public static void main(String[] args)
	{
		for (int counter1 = 2; counter1 <= 10_000; counter1++)
			if (isPrime(counter1))
				System.out.println(counter1);
	}

	public static boolean isPrime(int number)
	{
		int sqrtNumber = (int) Math.sqrt(number);

		for (int counter = 2; counter <= sqrtNumber; counter++)
			if (number % counter == 0)
				return false;

		return true;
	}
}

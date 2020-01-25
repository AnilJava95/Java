/*
 * Author's name and email: Michael
 * Program description: Finds prime numbers from 2 to 1000 using the Sieve of 
 *  Eratosthenes method.
 * Latest version: 4:48 PM, 9/4/2019.
 * Older versions: 
 */

import java.util.Arrays;

public class SieveOfEratosthenes
{
   public static void main(String[] args)
   {
		boolean[] array = new boolean[1000];
		Arrays.fill(array, true);
		
		for (int counter1 = 2; counter1 <= 999; counter1++)
		{
			if (array[counter1] == false)
				continue;
			else
			{
				for (int counter2 = counter1 + 1; counter2 <= 999; counter2++)
				{
					if (counter2 % counter1 == 0)
						array[counter2] = false;
				}
			}
		}
		
		System.out.printf("Prime numbers from 2 to 1000%n%n");
		for (int counter = 2; counter <= 999; counter++)
		{
			if (array[counter] == true)
			{
				System.out.println(counter);
			}
		}
   }
}
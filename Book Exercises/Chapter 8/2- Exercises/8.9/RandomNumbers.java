/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Taken a number n from user and generates n random 
 *  numbers [10-100].
 * Latest version: 11:48 AM, 9/6/2019
 * Older versions: 
 */

import java.util.Scanner;
import java.security.SecureRandom;

public class RandomNumbers
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		SecureRandom randomNumbers = new SecureRandom();
		int randomNumberAmount;

		System.out.print("How many random numbers [10-100] do you want: ");
		randomNumberAmount = input.nextInt();

		for (int counter = 0; counter < randomNumberAmount; counter++)
			System.out.printf("%d. random number: %d%n", counter,
				10 + randomNumbers.nextInt(91));
	}
}

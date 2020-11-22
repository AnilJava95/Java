/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Number guessing game. A random number between 1 and 1000 
 *  is generated. Players tries to guess it. Computer tells if player guessed 
 *  too high or too low.
 * Latest version: 11:26 PM, 7/2/2017
 * Older versions: 
 */

import java.util.Scanner;
import java.security.SecureRandom;

public class GuessTheNumber
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int randomNumber; // Between 1 and 1000.
		int playersGuess;

		randomNumber = randomNumber();

		do
		{
			System.out.print("Enter your guess or enter 0 to leave: ");
			playersGuess = input.nextInt();

			if (playersGuess < randomNumber)
				System.out.println("Too low, try again.");
			else if (playersGuess > randomNumber)
				System.out.println("Too high, try again.");
			else
			{
				System.out.printf("%nCongratulations. You guessed the number!%n");
				break;
			}
		} while (playersGuess != 0);
	}

	public static int randomNumber()
	{
		int randomNumber;
		SecureRandom randomNumbers = new SecureRandom();
		randomNumber = 1 + randomNumbers.nextInt(1000);
		return randomNumber;
	}
}

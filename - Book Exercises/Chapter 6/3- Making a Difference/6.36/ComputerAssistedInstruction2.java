/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Asks basic multiplication questions. Repeats the question 
 *  if the user got it wrong. Difference from last version is this one displays 
 *  random correct or wrong answer messages.
 * Latest version: 10:49 AM, 2/8/2019. Added in the changes i made in 
 *  ComputerAssistedInstruction class.
 *  Also last version had 2 generateRandomNumber methods and 2 comment methods. 
 *  I was able to get rid of one of each.
 * Older versions: 1:12 AM, 7/6/2017. Got rid of excess code/lines.
 *		10:54 AM, 7/5/2017
 */

import java.util.Scanner;
import java.security.SecureRandom;

public class ComputerAssistedInstruction2
{
	private static Scanner input = new Scanner(System.in);
	private static SecureRandom randomNumbers = new SecureRandom();

	public static void main(String[] args)
	{
		while (true)
			question();
	}

	private static int generateRandomNumber(int bound)
	{
		int randomNumber;
		randomNumber = 1 + randomNumbers.nextInt(bound);
		return randomNumber;
	}

	private static void question()
	{
		int number1 = generateRandomNumber(9);
		int number2 = generateRandomNumber(9);
		int answer;

		System.out.printf("How much is %d times %d: ", number1, number2);
		answer = input.nextInt();

		if (answer == number1 * number2)
			comment(true);
		else
		{
			comment(false);
			question(number1, number2);
		}
	}

	private static void question(int number1, int number2)
	{
		int answer;

		System.out.printf("How much is %d times %d: ", number1, number2);
		answer = input.nextInt();

		if (answer == number1 * number2)
			comment(true);
		else
		{
			comment(false);
			question(number1, number2);
		}
	}

	public static void comment(boolean isCorrect)
	{
		int displayStringCode = generateRandomNumber(4);

		if (isCorrect)
		{
			switch (displayStringCode)
			{
				case 1:
					System.out.printf("Very good!%n%n");
					break;
				case 2:
					System.out.printf("Excellent!%n%n");
					break;
				case 3:
					System.out.printf("Nice work!%n%n");
					break;
				case 4:
					System.out.printf("Keep up the good work!%n%n");
					break;
			}
		}
		else
		{
			switch (displayStringCode)
			{
				case 1:
					System.out.printf("No, please try again.%n%n");
					break;
				case 2:
					System.out.printf("Wrong. Try once more.%n%n");
					break;
				case 3:
					System.out.printf("Don't give up%n%n");
					break;
				case 4:
					System.out.printf("No. Keep trying!%n%n");
					break;
			}
		}
	}
}

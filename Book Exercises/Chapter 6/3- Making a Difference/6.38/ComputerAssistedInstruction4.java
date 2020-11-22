/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Asks basic multiplication questions. Repeats the question 
 *  if the user got it wrong. Displays random correct or wrong answer messages. 
 *  Calculates student performance. Difference from last one is this one lets the 
 *  student choose difficulty level.
 * Latest version: 12:26 AM, 2/8/2019. Added in the changes i made in 
 *  ComputerAssistedInstruction3 class.
 * Older versions: 1:04 PM, 7/6/2017
 */

import java.util.Scanner;
import java.security.SecureRandom;

public class ComputerAssistedInstruction4
{
	private static Scanner input = new Scanner(System.in);
	private static SecureRandom randomNumbers = new SecureRandom();

	static int rightAnswerCount;
	static int wrongAnswerCount;
	static int answerCount;
	static double performanceOfStudent;
	static int difficulty;

	public static void main(String[] args)
	{
		setDifficulty();

		do
		{
			question();

			if (answerCount >= 10)
			{
				calculatePerformance();

				setDifficulty();
			}
		} while (true);
	}

	private static int generateRandomNumber(int bound)
	{
		int randomNumber;

		if (bound == 9)
		{
			if (difficulty == 1)
				randomNumber = 1 + randomNumbers.nextInt(9);
			else if (difficulty == 2)
				randomNumber = 1 + randomNumbers.nextInt(99);
			else
				randomNumber = 1 + randomNumbers.nextInt(999);
			return randomNumber;
		}
		else
		{
			randomNumber = 1 + randomNumbers.nextInt(4);
			return randomNumber;
		}
	}

	private static void question()
	{
		int number1 = generateRandomNumber(9);
		int number2 = generateRandomNumber(9);
		int answer;

		System.out.printf("How much is %d times %d: ", number1, number2);
		answer = input.nextInt();
		answerCount++;

		if (answer == number1 * number2)
		{
			rightAnswerCount++;
			comment(true);
		}
		else
		{
			wrongAnswerCount++;
			comment(false);
			question(number1, number2);
		}
	}

	private static void question(int number1, int number2)
	{
		int answer;

		System.out.printf("How much is %d times %d: ", number1, number2);
		answer = input.nextInt();
		answerCount++;

		if (answer == number1 * number2)
		{
			rightAnswerCount++;
			comment(true);
		}
		else
		{
			wrongAnswerCount++;
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

	public static void calculatePerformance()
	{
		performanceOfStudent = (double) rightAnswerCount / answerCount * 100;

		System.out.printf("%nStudent performance: %.2f%%%n", performanceOfStudent);

		if (performanceOfStudent < 75.0)
			System.out.printf("Please ask your teacher for extra help.%n%n");
		else
			System.out.printf("Congratulations, you are ready to go to the next"
				+ " level!%n%n");

		System.out.printf("---Stats resetted.%n%n");

		// Resetting the program to restart the game.
		rightAnswerCount = 0;
		wrongAnswerCount = 0;
		answerCount = 0;
	}

	public static void setDifficulty()
	{
		System.out.print("Select difficulty(1, 2, 3): ");
		difficulty = input.nextInt();
		System.out.println("");
	}
}

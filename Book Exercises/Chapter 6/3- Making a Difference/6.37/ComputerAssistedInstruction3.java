/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Asks basic multiplication questions. Repeats the question 
 *  if the user got it wrong. Displays random correct or wrong answer messages. 
 *  Difference from last version is this one calculates student performance by 
 *  monitoring answer number and correct answer number.
 * Latest version: 11:05 AM, 2/8/2019. Added in the changes i made in 
 *  ComputerAssistedInstruction2 class.
 * Older versions: 12:53 PM, 7/6/2017
 */

import java.util.Scanner;
import java.security.SecureRandom;

public class ComputerAssistedInstruction3
{
	private static Scanner input = new Scanner(System.in);
	private static SecureRandom randomNumbers = new SecureRandom();

	static int rightAnswerCount;
	static int wrongAnswerCount;
	static int answerCount;
	static double performanceOfStudent;

	public static void main(String[] args)
	{
		do
		{
			question();

			if (answerCount >= 10)
				calculatePerformance();
		} while (true);
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
}

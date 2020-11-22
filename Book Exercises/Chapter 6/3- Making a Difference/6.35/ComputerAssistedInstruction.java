/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Asks basic multiplication questions. Repeats the question 
 *  if the user got it wrong.
 * Latest version: 11:19 AM, 2/8/2019. Added a loop to main method and returned the 
 *  question methods to caller if the answer is correct to get rid of unnecessary 
 *  method stack.
 * Older versions: 1:10 AM, 7/6/2017. Got rid of excess code/lines.
 *		10:35 AM, 7/5/2017
 */

import java.util.Scanner;
import java.security.SecureRandom;

public class ComputerAssistedInstruction
{
	private static Scanner input = new Scanner(System.in);
	private static SecureRandom randomNumbers = new SecureRandom();

	public static void main(String[] args)
	{
		while (true)
			question();
	}

	private static int generateRandomNumber() // 1-9
	{
		int randomNumber;
		randomNumber = 1 + randomNumbers.nextInt(9);
		return randomNumber;
	}

	private static void question()
	{
		int number1 = generateRandomNumber();
		int number2 = generateRandomNumber();
		int answer;

		System.out.printf("How much is %d times %d: ", number1, number2);
		answer = input.nextInt();

		if (answer == number1 * number2)
			System.out.printf("Very good!%n%n");
		else
		{
			System.out.printf("Wrong. Please try again.%n%n");
			question(number1, number2);
		}
	}

	private static void question(int number1, int number2)
	{
		int answer;

		System.out.printf("How much is %d times %d: ", number1, number2);
		answer = input.nextInt();

		if (answer == number1 * number2)
			System.out.printf("Very good!%n%n");
		else
		{
			System.out.printf("Wrong. Please try again.%n%n");
			question(number1, number2);
		}
	}
}

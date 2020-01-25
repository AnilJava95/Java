/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Asks basic multiplication questions. Repeats the question
 *  if the user got it wrong. Displays random correct or wrong answer messages. 
 *  Calculates student performance. Lets student choose difficulty level. Difference
 *  from last one is this one lets student pick type of arithmetic problem to study.
 *  Also this one has a random option.
 * Latest version: 16:02 06/07/2017. Got rid of one of the questions methods.
 * Older versions: 13:54 06/07/2017. 
 */

import java.util.Scanner;
import java.security.SecureRandom;

public class ComputerAssistedInstruction5
{
	private static Scanner input = new Scanner(System.in);
	
   static int rightAnswerCount;
   static int wrongAnswerCount;
   static int answerCount;
   static double performanceOfStudent;
   static int difficulty;
   static int questionType;
	static int tempQuestionType;
   
   public static void main(String[] args)
   {
      System.out.print("Select difficulty(1, 2, 3): ");
      difficulty = input.nextInt();
      System.out.println();
		
		System.out.print("Select question type(1: +, 2: -, 3: *, 4: /, 5: random): ");
		questionType = input.nextInt();
      System.out.println();
		
      do {
			int number1 = generateRandomNumber(9);
			int number2 = generateRandomNumber(9);
         question(number1, number2);
			
			if (answerCount >= 10)
			{
				// Calculate performance.
				if (wrongAnswerCount == 0)
					performanceOfStudent = 100.0;
				else
					performanceOfStudent = (double)rightAnswerCount / answerCount * 100;

				System.out.printf("%nStudent performance: %.2f%%%n", performanceOfStudent);

				if (performanceOfStudent < 75.0)
				{
					System.out.printf("Please ask your teacher for extra help.%n%n");
				}
				else
					System.out.printf("Congratulations, you are ready to go to the next"
						+ " level!%n%n");

				System.out.printf("---Stats resetted.%n%n");

				// Resetting the program to restart the game.
				rightAnswerCount = 0;
				wrongAnswerCount = 0;
				answerCount = 0;
				System.out.print("Select difficulty(1, 2, 3): ");
				difficulty = input.nextInt();
				System.out.println();
				
				System.out.print("Select question type(1: +, 2: -, 3: *, 4: /): ");
				questionType = input.nextInt();
				System.out.println();
			}
      } while(true);   
   }
   
   private static void question(int number1, int number2)
   {
      int answer;
		tempQuestionType = questionType;
		if (questionType == 5)
		{
			questionType = generateRandomNumber(4);
		}
		
      switch (questionType)
      {
         case 1:
            System.out.printf("How much is %d + %d: ", number1, number2);
            answer = input.nextInt();
            
            if (answer == number1 + number2)
               resolveCorrect(number1, number2);
            else
               resolveWrong(number1, number2);
            break;
         case 2:
            System.out.printf("How much is %d - %d: ", number1, number2);
            answer = input.nextInt();
            
            if (answer == number1 - number2)
               resolveCorrect(number1, number2);
            else
               resolveWrong(number1, number2);
            break;
         case 3:
            System.out.printf("How much is %d * %d: ", number1, number2);
            answer = input.nextInt();
            
            if (answer == number1 * number2)
               resolveCorrect(number1, number2);
            else
               resolveWrong(number1, number2);
            break;
         case 4:
            System.out.printf("How much is %d / %d: ", number1, number2);
            answer = input.nextInt();
            
            if (answer == number1 / number2)
               resolveCorrect(number1, number2);
            else
               resolveWrong(number1, number2);
            break;
      }
		
		questionType = tempQuestionType;
   }
   
   private static void resolveCorrect(int number1, int number2)
   {
      answerCount++;
      rightAnswerCount++;
      comment(true);
		return;
   }
   
   private static void resolveWrong(int number1, int number2)
   {
      answerCount++;
      wrongAnswerCount++;
      comment(false);
      question(number1, number2);
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
   
   private static int generateRandomNumber(int bound) // 1-9, 1-99, 1-999
   {
      int randomNumber;
      SecureRandom randomNumbers = new SecureRandom();
      
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
}
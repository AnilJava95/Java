/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Takes 5 integers from user, checks how many is positive, 
 *  negative and zero and stores this amounts in variables and prints these 3 
 *  varaibles.
 * Latest version: 08:27 18/04/2017. Changed comments.
 * Older versions: 21:07 20/06/2016
 */

import java.util.Scanner;

public class Negative_Positive_and_Zero_Values
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int number1;
      int number2;
      int number3;
      int number4;
      int number5;
      int negativeCount = 0;
      int positiveCount = 0;
      int zeroCount = 0;
      
      /* This block prompts, reads, checks if 5 values entered are either >, <, 
			== to 0 and increments variables called positiveCount, negativeCount, 
			zeroCount accordingly. */
      System.out.print("Enter 5 integers one by one or with one space in between: ");
      number1 = input.nextInt();
      if (number1 > 0)
         positiveCount = positiveCount + 1;
      if (number1 < 0)
         negativeCount = negativeCount + 1;
      if (number1 == 0)
         zeroCount = zeroCount + 1;
      number2 = input.nextInt();
      if (number2 > 0)
         positiveCount = positiveCount + 1;
      if (number2 < 0)
         negativeCount = negativeCount + 1;
      if (number2 == 0)
         zeroCount = zeroCount + 1;
      number3 = input.nextInt();
      if (number3 > 0)
         positiveCount = positiveCount + 1;
      if (number3 < 0)
         negativeCount = negativeCount + 1;
      if (number3 == 0)
         zeroCount = zeroCount + 1;
      number4 = input.nextInt();
      if (number4 > 0)
         positiveCount = positiveCount + 1;
      if (number4 < 0)
         negativeCount = negativeCount + 1;
      if (number4 == 0)
         zeroCount = zeroCount + 1;
      number5 = input.nextInt();
      if (number5 > 0)
         positiveCount = positiveCount + 1;
      if (number5 < 0)
         negativeCount = negativeCount + 1;
      if (number5 == 0)
         zeroCount = zeroCount + 1;
      
      System.out.printf("Number of positive integers inputted: %d%n", positiveCount);
      System.out.printf("Number of negative integers inputted: %d%n", negativeCount);
      System.out.printf("Number of zero integers inputted: %d%n", zeroCount);
   }
}
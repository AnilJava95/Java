/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Takes two integers from user, prints square of each, the 
 *  sum of their squares and the difference of the squares.
 * Latest version: 06:26 18/04/2017. Changed comments. Changed display algorithm 
 *  for difference of squares. Now it will displey absolute difference.
 * Older versions: 04:00 19/06/2016
 */

import java.util.Scanner;

public class Arithmetic
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int number1;
      int number2;
      int diff;
      
      System.out.print("Enter first integer: ");
      number1 = input.nextInt();
      
      System.out.print("Enter second integer: ");
      number2 = input.nextInt();
      
      number1 = number1 * number1;
      number2 = number2 * number2;
      
      System.out.printf("%nSquare of first number: %d%n", number1);
      
      System.out.printf("Square of second number: %d%n", number2);
      
      System.out.printf("Sum of squares: %d%n", number1 + number2);
      
      diff = number1 - number2; // Prints absolute value of difference of squares
      if(diff < 0)
      {
         System.out.printf("Difference of squares: %d%n", -diff);
      }
      else
      {
         System.out.printf("Difference of squares: %d%n", diff);
      }
   }
}
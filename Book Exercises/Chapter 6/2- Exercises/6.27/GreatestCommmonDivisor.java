/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Takes 2 numbers and finds their greatest common divisor.
 * Latest version: 23:08 01/07/2017. 
 * Older versions: 
 */

import java.util.Scanner;

public class GreatestCommmonDivisor
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int number1;
      int number2;
      int greatestCommonDivisor;
      
      System.out.println("Enter two numbers to find their greatest common divisor.");
      
      System.out.print("Enter first number: ");
      number1 = input.nextInt();
      
      System.out.print("Enter second number: ");
      number2 = input.nextInt();
      
      greatestCommonDivisor = greatestCommonDivisor(number1, number2);
      System.out.printf("Greatest common divisor is: %d%n", greatestCommonDivisor);
   }
   
   public static int greatestCommonDivisor(int number1, int number2)
   {
      if (number2 == 0)
         return number1;
      else
         return greatestCommonDivisor(number2, number1 % number2);
   }
}
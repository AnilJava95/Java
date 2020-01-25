/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Takes two inputs from user and determines if the first 
 *  number is a multiple of the second number.
 * Latest version: 17:55 30/06/2017.
 * Older versions: 
 */

import java.util.Scanner;

public class Multiples
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int number1;
      int number2;
      
      System.out.println("This program takes two integer values from user and "
         + "sees if first value is a multiple of second value");
      
      System.out.print("Enter number1 or enter 0 to exit the program: ");
      number1 = input.nextInt();
      
      while (number1 != 0)
      {
         System.out.print("Enter number2: ");
         number2 = input.nextInt();
         
         System.out.printf("number1 = %d,number2 = %d, multiples: %b", number1, 
            number2, isMultiple(number1, number2));
         
         System.out.printf("%n%nEnter number1 or enter 0 to exit the program: ");
         number1 = input.nextInt();
      }
   }
   
   public static boolean isMultiple(int number1, int number2)
   {
      if (number1 % number2 == 0)
         return true;
      else
         return false;
   }
}
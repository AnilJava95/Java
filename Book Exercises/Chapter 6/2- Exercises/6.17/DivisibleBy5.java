/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Inputs 10 numbers from user one by one. Sees if they are 
 *  divisible by 5 or not.
 * Latest version: 19:19 30/06/2017.
 * Older versions: 
 */

import java.util.Scanner;

public class DivisibleBy5
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int number;
      
      for (int counter = 1; counter <= 10; counter++)
      {
         System.out.print("Enter a number to see if it is divisible by 5: ");
            number = input.nextInt();
         
         System.out.printf("Number is %s by 5.%n%n", 
            isDivisible(number)?"divisible":"not divisible");
      }
   }
   
   public static boolean isDivisible(int number)
   {
      if (number % 5.0 == 0)
         return true;
      else
         return false;
   }
}
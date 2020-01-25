/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: User inputs a double value, program calculates floor and 
 *  ceil of the value without using API floor and ceil methods.
 * Latest version: 11:29 07/02/2019. Changed isInt method from (number 8 10 % 10 == 0) 
 *  to ((int) number  == number).
 * Older versions: 16:30 30/06/2017.
 */

import java.util.Scanner;

public class FloorAndCeil
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      double number;
      System.out.print("Enter number to finds its floor and ceil: ");
      number = input.nextDouble();
      
      System.out.printf("floor(number) = %.2f%n", floor(number));
      System.out.printf("ceil(number) = %.2f%n", ceil(number));
   }
   
   public static boolean isInt(double number)
   {
      if ((int) number  == number)
         return true;
      else
         return false;
   }
   
   public static double floor(double number)
   {
      if (isInt(number) == true)
         return number;
      else if (number >= 0)
         return (int) number;
      else
         return (int) number - 1;
   }
   
   public static double ceil(double number)
   {
      if (isInt(number) == true)
         return number;
      else if (number <= 0)
         return (int) number;
      else
         return (int) number + 1;
   }
}
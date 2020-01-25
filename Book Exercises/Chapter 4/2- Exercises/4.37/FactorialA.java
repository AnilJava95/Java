/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Calculates factorial.
 * Latest version: 19:36 20/05/2017. Changed comments.
 * Older versions: 14:17 09/08/2016.
 */

import java.util.Scanner;

public class Factorial_A
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int total = 1;
      int number;
      
      System.out.print("Enter a nonnegative integer to calculate its factorial: ");
      number = input.nextInt();
      
      while (number > 1)
      {
         total *= number;
         number--;
      }
      
      System.out.println(total);
   }
}
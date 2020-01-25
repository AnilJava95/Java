/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Converts binary number to decimal.
 * Latest version: 19:05 20/05/2017. Changed comments.
 * Older versions: 15:24 06/05/2016.
 */

import java.util.Scanner;

public class BinaryToDecimal
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int number;
      int total = 0;
      int coefficient = 1;
      
      System.out.print("Enter a binary number: ");
      number = input.nextInt();
      
      while (number > 0)
      {
         total += (number % 10) * coefficient;
         number /= 10;
         coefficient *= 2;
      }
      System.out.println("Number in decimal form is: " + total);
   }
}
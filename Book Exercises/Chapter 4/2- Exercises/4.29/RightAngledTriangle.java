/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Prints a right angled triangle with the size taken from user.
 * Latest version: 18:59 20/05/2017. Changed comments.
 * Older versions: 13:15 06/08/2016.
 */

import java.util.Scanner;

public class RightAngledTriangle
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int rowNumber;
      int rowCounter = 1;
      int columnCounter = 1;
      
      System.out.print("Enter row number: ");
      rowNumber = input.nextInt();
      
      while ( rowCounter <= rowNumber )
      {
         while (columnCounter <= rowCounter)
         {
         System.out.print("*");
         columnCounter++;
         }
         System.out.println("");
         columnCounter = 1;
         rowCounter++;
      }
   }
}
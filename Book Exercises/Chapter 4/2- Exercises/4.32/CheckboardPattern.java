/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Prints a checkboard pattern with asterisks.
 * Latest version: 19:07 20/05/2017. Changed comments.
 * Older versions: 21:42 07/08/2016.
 */

import java.util.Scanner;

public class CheckboardPattern
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int rowCounter = 1;
      int columnCounter = 1;
      
      while (rowCounter <= 8)
      {
         if (rowCounter % 2 == 1)
         {
            while (columnCounter <= 8)
            {
               System.out.print("*");
               System.out.print(" ");
               
               columnCounter++;
            }
            System.out.println("");
            columnCounter = 1;
         }
         else
         {
            while (columnCounter <= 8)
            {
               System.out.print(" ");
               System.out.print("*");
               
               columnCounter++;
            }
            System.out.println("");
            columnCounter = 1;
         }
         rowCounter++;
      }
   }
}
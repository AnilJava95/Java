/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Modified version of 5.24 that reads an odd number in the 
 *  range of 1-19 to specify the number of rows in the diamond.
 * Latest version: 22:08 09/06/2017. Changed comments.
 * Older versions: 19:17 07/09/2016.
 */

import java.util.Scanner;

public class ModifiedDiamondPrinting
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int totalRowNumber;
      int halfTotalRowNumber;
		int limit;
      
      System.out.print("Enter an odd row number(1-19): ");
      totalRowNumber = input.nextInt();
      
      halfTotalRowNumber = totalRowNumber / 2;
      limit = totalRowNumber / 2 + 1;
		
      for (int counter1 = 1; counter1 <= limit; counter1++)
      {
         for (int counter4 = 1; counter4 <= halfTotalRowNumber; counter4++)
         {
            System.out.print(" ");
         }
         
         for (int counter2 = 1; counter2 <= (counter1 - 1) * 2 + 1; counter2++)
         {
            System.out.print("*");
         }
         
         halfTotalRowNumber -= 1;
         
         System.out.printf("%n");
      }
      
      halfTotalRowNumber = totalRowNumber - 2;
      limit -= 1;
		
      for (int counter1 = 1; counter1 <= limit; counter1++)
      {
         for (int counter4 = 1; counter4 <= counter1; counter4++)
         {
            System.out.print(" ");
         }
         
         for (int counter2 = 1; counter2 <= halfTotalRowNumber; counter2++)
         {
            System.out.print("*");
         }
         
         System.out.printf("%n");
         
         halfTotalRowNumber -= 2;
      }
   }
}
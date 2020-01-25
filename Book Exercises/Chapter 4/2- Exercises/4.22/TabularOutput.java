/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Outputs a tabular data. Columns are N, N^2 N^3 N^4. Rows 
 *  number is taken from user.
 * Latest version: 18:01 20/05/2017. Changed comments.
 * Older versions: 20:35 02/08/2016
 */

import java.util.Scanner;

public class TabularOutput
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int rowNumber;
      int counter = 1;
      
      System.out.print("Input row number: ");
      rowNumber = input.nextInt();
      System.out.println("");
      
      System.out.printf("%4s%6s%6s%6s", "N", "N^2", "N^3", "N^4");
      System.out.println("");
      System.out.println("");
      
      while (counter <= rowNumber)
      {
         System.out.printf("%4d%6d%6d%6d%n", counter, counter * counter, counter * 
				counter * counter, counter * counter * counter * counter);
			
         counter++;
      }
   }
}
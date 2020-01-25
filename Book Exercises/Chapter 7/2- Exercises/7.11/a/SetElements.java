/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Sets elements between indexes 10-20 inclusive to 0.
 * Latest version: 10:53 11/02/2019. Changed display from "%d " to "%3d"
 * Older versions: 14:33 16/07/2017.
 */

import java.util.Scanner;

public class SetElements
{
   public static void main(String[] args)
   {
      //Scanner input = new Scanner(System.in);
      
      int[] counts = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
         18, 19, 20, 21 };
      
      displayArray(counts);
      
      for (int counter = 10; counter <= 20; counter++)
      {
         counts[counter] = 0;
      }
      
      displayArray(counts);
   }
   
   public static void displayArray(int[] array)
   {
      for (int column : array)
         System.out.printf("%3d", column);
      
      System.out.println("");
   }
}
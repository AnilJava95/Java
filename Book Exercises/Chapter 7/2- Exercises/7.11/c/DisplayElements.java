/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Display ten values of integer array bestScores, each on
 *  a new line.
 * Latest version: 14:43 16/07/2017.
 * Older versions: 
 */

import java.util.Scanner;

public class DisplayElements
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int[] bestScores = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      
      displayArray(bestScores);
   }
   
   public static void displayArray(int[] array)
   {
      for (int column : array)
      {
         System.out.printf("%d%n", column);
      }
      
      System.out.println("");
   }
}
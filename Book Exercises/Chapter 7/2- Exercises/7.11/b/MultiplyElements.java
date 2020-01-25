/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Multiplies all elements 0-20 inclusive of the array bonus.
 * Latest version: 10:54 11/02/2019. Changed display from "%d " to "%3d"
 * Older versions: 14:38 16/07/2017.
 */

import java.util.Scanner;

public class MultiplyElements
{
   public static void main(String[] args)
   {
      //Scanner input = new Scanner(System.in);
      
      int[] bonus = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
         18, 19, 20 };
      
      displayArray(bonus);
      
      for (int column = 0; column < bonus.length; column++)
      {
         bonus[column] *= 2;
      }
      
      displayArray(bonus);
   }
   
   public static void displayArray(int[] array)
   {
      for (int column : array)
         System.out.printf("%3d", column);
      
      System.out.println("");
   }
}
/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: The calculateAverage method can take different number of 
 *  arguments and calculate the average.
 * Latest version: 19:57 16/07/2017.
 * Older versions: 
 */

import java.util.Scanner;

public class Vararg
{
   public static void main(String[] args)
   {
      //Scanner input = new Scanner(System.in);
      
      int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
         18, 19, 20 };
      
      int[] array2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      
      System.out.printf("Average of first array: %.2f%nAverage of second array: %.2f%n", 
         calculateAverage(array), calculateAverage(array2));
   }
   
   /*public static void displayArray1D(int[] array)
   {
      for (int column : array)
      {
         System.out.printf("%d ", column);
      }
      
      System.out.println("");
   }*/
   
   public static double calculateAverage(int... array)
   {
      double average = 0;
      int total = 0;
      
      for (int element : array)
      {
         total += element;
      }
      
      average = (double)total / array.length;
      
      return average;
   }
}
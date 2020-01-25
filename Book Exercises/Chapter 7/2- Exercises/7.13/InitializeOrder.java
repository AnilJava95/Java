/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Shows in which order the elements are inputted if you input 
 *  them column first.
 * Latest version: 17:50 16/07/2017.
 * Older versions: 
 */

//import java.util.Scanner;

public class InitializeOrder
{
   public static void main(String[] args)
   {
      //Scanner input = new Scanner(System.in);
      
      int[][] array = new int[5][6];
      
      displayArray(array);
      
      System.out.println("");
      
      inputArray(array);
      
      displayArray(array);
   }
   
   public static void displayArray(int[][] array)
   {
      for (int row = 0; row < array.length; row++)
      {
         for (int column = 0; column < array.length; column++)
         {
            System.out.printf("%02d ", array[row][column]);
         }
         
         System.out.println("");
      }
   }
   
   // Inputs the array column first.
   public static void inputArray(int[][] array)
   {
      int counter = 0;
      
      for (int column = 0; column < array.length; column++)
      {
         for (int row = 0; row < array.length; row++)
			{
				array[row][column] = counter;
				counter ++;
			}
      }
   }
}
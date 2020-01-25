/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Takes command line arguments and prints their absolute 
 *  values.
 * Latest version: 23:36 16/07/2017.
 * Older versions: 
 */

//import java.util.Scanner;

public class EnhancedFor
{
   public static void main(String[] args)
   {
      printAbs(args);
   }
   
   public static void printAbs(String[] args)
   {
      int number;
      
      for(String string1 : args)
      {
         number = Math.abs(Integer.parseInt(string1));
         
         System.out.printf("%d ", number);
      }
   }
}
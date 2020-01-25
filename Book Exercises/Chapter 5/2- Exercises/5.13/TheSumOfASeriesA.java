/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Find the summation of the sequence of numbers 1 to n. 
 *  n could be 1 to 100.
 * Latest version: 12:52 PM, 9/2/2019. Changed sum from 1 to 0.
 * Older versions: 01:03 09/06/2017. Changed comments.
 *		21:00 05/09/2016.
 */

public class TheSumOfASeriesA
{
   public static void main(String[] args)
   {
      long sum = 0;
      
      System.out.printf("%3c %7s%n%n", 'n', "Sum");
      
      for (int counter = 1; counter <= 100; counter++)
      {
         sum += counter;
         
         System.out.printf("%3d %7d%n", counter, sum);
      }
   }
}
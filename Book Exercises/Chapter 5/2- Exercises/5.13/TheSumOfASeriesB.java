/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Find the summation of the sequence of numbers 1 to n. 
 *  n could be 1 to 100.
 * Latest version: 01:03 09/06/2017. Changed comments.
 * Older versions: 21:00 05/09/2016.
 */

public class TheSumOfASeriesB
{
   public static void main(String[] args)
   {
      double sum = 1.0;
      
      System.out.printf("%3c %7s%n%n", 'n', "Sum");
      
      for (int counter = 1; counter <= 100; counter++)
      {
         sum *= counter;
         
         System.out.printf("%3d %7f%n", counter, sum);
      }
   }
}
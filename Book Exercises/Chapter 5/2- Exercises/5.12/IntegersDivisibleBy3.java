/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Calculates sum of integers between 1 and 30 that are 
 *  divisible by 3.
 * Latest version: 00:00 09/06/2017. Changed comments.
 * Older versions: 06:10 05/09/2016.
 */

public class IntegersDivisibleBy3
{
   public static void main(String[] args)
   {
      int sum = 0;
      int counter;
      
      for (counter = 3;  counter <= 30; counter += 3)
      {
         //if (counter % 3 == 0)
         //{
            sum += counter;
         //}
      }
      
      System.out.println("Sum is: " + sum);
   }
}
/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Sum of odd integers between 1 and 99.
 * Latest version: 16:49 08/06/2017. Changed comments.
 * Older versions: 14:00 04/09/2016.
 */

public class a
{
   public static void main(String[] args)
   {
      int sum = 0;
      int counter;
      
      for (counter = 1; counter <= 99; counter += 2)
      {
            sum += counter;
      }
      
      System.out.println(sum);
   }
}
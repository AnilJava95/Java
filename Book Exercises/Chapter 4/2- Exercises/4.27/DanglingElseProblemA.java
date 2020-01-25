/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Testing the exercises on book.
 * Latest version: 18:29 20/05/2017. Changed comments.
 * Older versions: 11:00 06/08/2016.
 */

public class DanglingElseProblemA
{
   public static void main(String[] args)
   {
      int x = 9;
      int y = 11;
      
      if (x < 10)
      {
         if (y > 10)
         {
            System.out.println("*****");
         }
         else
         {
            System.out.println("#####");
         }
      }
      System.out.println("$$$$$");
   }
}
/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Printing triangles on the book.
 * Latest version: 02:38 09/06/2017. Changed comments.
 * Older versions: 23:35 05/09/2016.
 */

public class TrianglePrintingB
{
   public static void main(String[] args)
   {
      
      for (int counter1 = 1; counter1 <= 10; counter1++)
      {
         for (int counter2 = 1; counter2 <= 11 - counter1; counter2++)
         {
            System.out.print("*");
         }
         
         System.out.printf("%n");
      }
   }
}
/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Printing triangles on the book.
 * Latest version: 14:15 06/02/2019. Changed "11 - counter1" to "10 - counter1". 
 *  Got rid of the extra space that wasnt supposed to be there.
 * Older versions: 02:42 07/06/2017. Changed comments.
 *		18:11 05/09/2016.
 */

public class TrianglePrintingD
{
   public static void main(String[] args)
   {
      for (int counter1 = 1; counter1 <= 10; counter1++)
      {
         for (int counter4 = 1; counter4 <= 10 - counter1; counter4++)
         {
            System.out.print(" ");
         }
         
         for (int counter2 = 1; counter2 <= counter1; counter2++)
         {
            System.out.print("*");
         }
         
         System.out.printf("%n");
      }
   }
}
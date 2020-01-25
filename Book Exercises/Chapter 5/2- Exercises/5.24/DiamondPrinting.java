/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Print diamond shape with asterisks.
 * Latest version: 21:46 09/06/2017. Changed comments.
 * Older versions: 18:16 07/09/2016.
 */

public class DiamondPrinting
{
   public static void main(String[] args)
   {
      int limit = 1;
      
      for (int counter1 = 1; counter1 <= 5; counter1++)
      {
         for (int counter4 = 1; counter4 <= 5 - counter1; counter4++)
         {
            System.out.print(" ");
         }
         
         for (int counter2 = 1; counter2 <= limit; counter2++)
         {
            System.out.print("*");
         }
         
         limit += 2;
         
         System.out.printf("%n");
      }
      
      limit = 7;
      
      for (int counter1 = 1; counter1 <= 4; counter1++)
      {
         for (int counter4 = 1; counter4 <= counter1; counter4++)
         {
            System.out.print(" ");
         }
         
         for (int counter2 = 1; counter2 <= limit; counter2++)
         {
            System.out.print("*");
         }
         
         System.out.printf("%n");
         
         limit -= 2;
      }
   }
}
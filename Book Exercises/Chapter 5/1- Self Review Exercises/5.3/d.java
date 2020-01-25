/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Repeat part c using a for statement.
 * Latest version: 17:15 08/06/2017. Changed comments.
 * Older versions: 14:57 04/09/2016.
 */

public class d
{
   public static void main(String[] args)
   {
      for (int i = 1; i <= 20; i++)
      {
         System.out.print(i);
         
         if ((i % 5) == 0)
         {
            System.out.print("\n");
         }
         else
         {
            System.out.print("\t");
         }
      }
   }
}
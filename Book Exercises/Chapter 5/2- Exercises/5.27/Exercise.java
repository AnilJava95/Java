/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: The question on the book asks "What does the following 
 *  program do?"
 * Latest version: 22:30 09/06/2017. Changed comments.
 * Older versions: 23:31 07/09/2016.
 */

public class Exercise
{
   public static void main(String[] args)
   {
      int i, j, k;
      
      for (i = 1; i <= 5; i++)
      {
         for (j = 1; j <= 3; j++)
         {
            for (k = 1; k <= 4; k++)
               System.out.print('*');
					System.out.println();
         }
			System.out.println();
      }
   }
}
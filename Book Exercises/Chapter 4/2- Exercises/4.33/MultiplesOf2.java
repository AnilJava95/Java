/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Prints multiples of 2. Notice how last number is 
 *  negative because we are using signed long. Numbers after that are 0 because 
 *  when we multiply a number by 2 we shift its bits left and feed 0 from right.
 * Latest version: 19:10 20/05/2017. Changed comments.
 * Older versions: 02:58 08/08/2016.
 */

import java.util.Scanner;

public class MultiplesOf2
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      long x = 1;
      
      while (true)
      {
         System.out.print(x);
			if(x == 0)
			{
				System.out.println("");
				break;
			}
         x *= 2;
         System.out.println("");
      }
   }
}
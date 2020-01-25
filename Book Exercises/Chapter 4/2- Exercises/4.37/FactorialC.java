/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Calculates e over x.
 * Latest version: 19:38 20/05/2017. Changed comments.
 * Older versions: 17:32 09/08/2016.
 */

import java.util.Scanner;

public class Factorial_C
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int factorial = 1;
      int counter = 0;
      int iterationNumber;
      double total = 0;
      int tempCounter;
      double top = 1;
      int x;
      
      System.out.print("Enter iteration number: ");
      iterationNumber = input.nextInt();
      
      System.out.print("Enter x: ");
      x = input.nextInt();
      
      while (counter < iterationNumber)
      {
			tempCounter = counter;
			
			// We still find factorials of, 0, 1, 2, etc. but when we say 
			//  tempCounter - 1 instead if tempcounter, we skip last multiplication.
			while ((tempCounter - 1) > 0)
			{
				factorial *= tempCounter;
				tempCounter--;
			}
			
			tempCounter = counter;
			
			// Using "tempCounter - 1" we get x^0, x^1, x^2 etc.
			while ((tempCounter - 1) > 0)
			{
				top *= x;
				tempCounter--;
			}
			
			total += ((double) top / factorial);
			System.out.println(total);
			
			factorial = 1;
			counter ++;
      }
   }
}
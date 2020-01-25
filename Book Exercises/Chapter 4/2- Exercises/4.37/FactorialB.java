/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Calculates the constant "e".
 * Latest version: 19:37 20/05/2017. Changed comments.
 * Older versions: 16:49 09/08/2016.
 */

import java.util.Scanner;

public class Factorial_B
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int factorial = 1;
      int counter = 0;
      int iterationNumber;
      double total = 0;
      int tempCounter;
      
      System.out.print("Enter iteration number: ");
      iterationNumber = input.nextInt();
      
      while (counter < iterationNumber)
      {
			tempCounter = counter;
			
			while ((tempCounter - 1) > 0)
			{
				factorial *= tempCounter;
				tempCounter--;
			}
			
			total += ((double) 1 / factorial);
			System.out.println(total);
			
			factorial = 1;
			counter ++;
      }
   }
}
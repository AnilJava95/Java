/*
 * Author's name and email: Michael
 * Program description: Takes a number n from user and finds nth fibonacci 
 *  number.
 * Latest version: 3:06 PM, 9/4/2019.
 * Older versions: 
 */

import java.util.Scanner;

public class FibonacciSeriesA
{
   public static void main(String[] args)
   {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Which fibonacci number do you want? [1-47]: ");
		int n = input.nextInt();
		
		System.out.println(n + ". fibonacci number is: " + fibonacci(n));
   }
	
	private static int fibonacci(int n)
	{
		int number1 = 0;
		int number2 = 1;
		
		if (n == 1)
			return 0;
		else if (n == 2)
			return 1;
		else 
		{
			for (int counter = 3; counter <= n; counter++)
			{
				number2 += number1;
				number1 = number2 - number1;
			}
			return number2;
		}
	}
}
/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Asks user for an integer, obtains it from the user and 
 *  displays whether the number and its square are greater than, equal to, not 
 *  equal to or less than number 100.
 * Latest version: 21:41 26/01/2019. Fixed typo in print of results. It said
 *  "System.out.printf("Square of %d > 100%n", number1Squared);". I removed
 *  "Square of".
 * Older versions: 06:43 18/04/2017. Changed comments. Changed some of the 
 *  printed messages.
 *		11:23 19.06.2016
 */

import java.util.Scanner;

public class Comparing_Integers
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number1Squared;
		
		System.out.print("Enter an integer: ");
		number1 = input.nextInt();
		
		number1Squared = number1 * number1;
		
		if (number1 > 100)
			System.out.printf("%d > 100%n", number1);
		
		if (number1 == 100)
			System.out.printf("%d == 100%n", number1);
		
		if (number1 != 100)
			System.out.printf("%d != 100%n", number1);
		
		if (number1 < 100)
			System.out.printf("%d < 100%n", number1);
		
		if (number1Squared > 100)
			System.out.printf("%d > 100%n", number1Squared);
		
		if (number1Squared == 100)
			System.out.printf("%d == 100%n", number1Squared);
		
		if (number1Squared != 100)
			System.out.printf("%d != 100%n", number1Squared);
		
		if (number1Squared < 100)
			System.out.printf("%d < 100%n", number1Squared);
	}
}

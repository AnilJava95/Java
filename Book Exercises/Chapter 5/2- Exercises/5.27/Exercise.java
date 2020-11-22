/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: The question on the book asks "What does the following 
 *  program do?"
 * Latest version: 10:30 PM, 6/9/2017. Changed comments.
 * Older versions: 11:31 PM, 9/7/2016
 */

public class Exercise
{
	public static void main(String[] args)
	{
		int i, j, k;

		for (i = 1; i <= 5; i++) // prints 5 groups of 3 lines of 4 asterisks
		{
			for (j = 1; j <= 3; j++) // prints 3 lines of 4 asterisks
			{
				for (k = 1; k <= 4; k++) // prints a line of 4 asterisks
					System.out.print('*');
				
				System.out.println();
			}
			
			System.out.println();
		}
	}
}

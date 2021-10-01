/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Calculates weekly salaries of salesmen using %9 of sales 
 *  they made  + 200.
 * Latest version: 5:26 PM, 2/4/2019. Changed "totalSalesOneWeek * (float) 9 / 100" 
 *  with "totalSalesOneWeek * 0.09F".
 * Older versions: 3:55 PM, 10/28/2018. Changed from flag system to while(true) + 
 *  break system.
 *		5:37 PM, 5/20/2017. Changed comments.
 *		11:09 PM, 7/27/2016
 */

import java.util.Scanner;

public class SalesCommission
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		float sale;
		float totalSalesOneWeek = 0.0F;
		float salary;
		//int salesManFlag = 0; // Used in the old version.

		while (true)
		{
			System.out.print("Enter sales one by one or in total to calculate salary. "
				+ "Or enter -2 to exit: ");
			sale = input.nextFloat();
			if (sale == -2.0)
				break;
			while (true)
			{
				totalSalesOneWeek += sale;
				System.out.print("Enter next sale or enter -1 to print salary and "
					+ "return to main menu: ");
				sale = input.nextFloat();
				if (sale == -1.0)
				{
					salary = 200 + (totalSalesOneWeek * 0.09F);
					System.out.printf("Salary is: %.2f%n", salary);
					totalSalesOneWeek = 0.0F;
					break;
				}
			}
		}
	}
}

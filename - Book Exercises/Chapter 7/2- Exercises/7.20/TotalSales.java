/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Two dimensional array "sales" with rows holding different 
 *  products and columns holding different salespeople. Salespeople can pass [0-5] 
 *  slips per day to total their revenue. Then we display This two dimensional array 
 *  with totals to the right of rows and below columns.
 * Latest version: 5:13 PM, 2/12/2019
 * Older versions: 
 */

import java.util.Scanner;

public class TotalSales
{
	static int[][] sales = new int[5][4];
	static int[] columnTotal = new int[4];

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		while (true)
		{
			System.out.printf("Enter 1 to pass new slip or enter 0 to proceed: ");
			if (input.nextByte() == 0)
				break;
			else
			{
				System.out.print("Enter salesPersonNumber, productNumber "
					+ "and daily total revenue with spaces in between: ");
				passSlip(input.nextByte(), input.nextByte(), input.nextInt());
			}
		}

		System.out.printf("%n%13s %5s %5s %5s %7s%n%n", "SP1", "SP2", "SP3", "SP4", "Total");
		for (byte productNumber = 0; productNumber < 5; productNumber++)
		{
			int rowTotal = 0;

			System.out.printf("P%-6d", productNumber);
			for (byte salesPersonNumber = 0; salesPersonNumber <= 3; salesPersonNumber++)
			{
				System.out.printf(" %5d", sales[productNumber][salesPersonNumber]);
				rowTotal += sales[productNumber][salesPersonNumber];

				columnTotal[salesPersonNumber] += sales[productNumber][salesPersonNumber];
			}
			
			System.out.printf("%8d%n", rowTotal);
		}

		// Used to print the last row that contains column totals.
		System.out.printf("%nTotal:%7d %5d %5d %5d%n%n", columnTotal[0], columnTotal[1],
			columnTotal[2], columnTotal[3]);
	}

	private static void passSlip(byte productNumber, byte salesPersonNumber, int revenue)
	{
		/* Salespeople enter their daily revenue for all products one by one. 
		 Notice how we are entering all products for one sales people at a time 
		 but productNumber is row and salesPersonNumber is column.
		 */
		sales[productNumber][salesPersonNumber] = revenue;
	}
}

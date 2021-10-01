/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Wealth distribution, income and charity.
 * Latest version: 2:10 AM, 6/10/2017. Changed comments.
 * Older versions: 3:27 PM, 9/11/2016
 */

import java.util.Scanner;

public class WealthDistribution
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		String ethnicName;
		int charityThreshold;
		int yearlyIncome;
		int charityAmount;
		int charityPercentege;

		System.out.print("Enter name of ethnic group: ");
		ethnicName = input.nextLine();

		System.out.print("Enter charity threshold: ");
		charityThreshold = input.nextInt();

		System.out.print("Enter yearly income: ");
		yearlyIncome = input.nextInt();

		if (yearlyIncome < charityThreshold)
			System.out.print("No charity is paid.");
		else
		{
			System.out.print("Enter charity percentege: ");
			charityPercentege = input.nextInt();

			charityAmount = yearlyIncome * charityPercentege / 100;
			System.out.printf("Charity Amount: %,d%n", charityAmount);
		}
	}
}

/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Takes initial balance, items charged, total credits, 
 *  credit limit and calculates if new balance is over limit or not.
 * Latest version: 5:29 PM, 5/20//2017. Changed comments. Changed a variable 
 *  name to newAccount and made it type double.
 * Older versions: 12:40 AM, 7/25/2016
 */

import java.util.Scanner;

public class CreditLimitCalculator
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int accountNumber;
		int balance;
		int itemsCharged;
		int totalCredits;
		int creditLimit;
		int newAccount;

		System.out.print("Enter 1 to input a new customer's data or enter "
			+ "another integer number to exit: ");
		newAccount = input.nextInt();

		while (newAccount == 1)
		{
			System.out.print("Enter account number: ");
			accountNumber = input.nextInt();

			System.out.print("Enter balance: ");
			balance = input.nextInt();

			System.out.print("Enter items charged: ");
			itemsCharged = input.nextInt();

			System.out.print("Enter total credits applied: ");
			totalCredits = input.nextInt();

			System.out.print("Enter credit limit: ");
			creditLimit = input.nextInt();

			balance = balance + itemsCharged - totalCredits;
			System.out.printf("Balance: %d%n", balance);

			if (balance > creditLimit)
			{
				System.out.println("Credit limit exceeded");
			}
			System.out.println("");

			System.out.print("Enter 1 to input a new customer's data or enter "
				+ "another number to exit: ");
			newAccount = input.nextInt();
		}
	}
}

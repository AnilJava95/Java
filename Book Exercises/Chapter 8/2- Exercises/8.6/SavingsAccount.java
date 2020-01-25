/*
 * Author's name and email: Michael
 * Program description: Create SavingsAccount class and then instantiate two 
 *  objects of it with 2k and 3k dollars. Calculate interest for 12 months with 
 *  4% interest. Then reset balances and do the same for 5% interest.
 * Latest version: 9:56 PM, 03/09/2019.
 * Older versions: 
 */

public class SavingsAccount
{
	static float annualInterestRate;

	private float savingsBalance;

	public SavingsAccount(int balance)	
	{
		savingsBalance = balance;
	}

	public void calculateMonthlyInterest()
	{
		savingsBalance += savingsBalance * (annualInterestRate / 12.0F / 100);
	}

	public static void modifyInterestRate(float newAnnualInterestRate)
	{
		annualInterestRate = newAnnualInterestRate;
	}

	public static void main(String[] args)
	{
		// Calculate interest for 12 months with 4% interest for 2k and 3k.
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		annualInterestRate = 4.0F;
		
		System.out.printf("%5s%12s%12s%n", "Month", "Balance", "Balance2");
		for (int month = 1; month <= 12; month++)
		{
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
			System.out.printf("%5d%12.2f%12.2f%n", month, saver1.savingsBalance, 
				saver2.savingsBalance);
		}
		System.out.println("");
		
		// Calculate interest for 12 months with 4% interest for 2k and 3k.
		saver1.savingsBalance = 2000;
		saver2.savingsBalance = 3000;
		
		annualInterestRate = 5.0F;
		
		System.out.printf("%5s%12s%12s%n", "Month", "Balance", "Balance2");
		for (int month = 1; month <= 12; month++)
		{
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
			System.out.printf("%5d%12.2f%12.2f%n", month, saver1.savingsBalance, 
				saver2.savingsBalance);
		}
	}
}

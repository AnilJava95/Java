/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Ticket buying software for a plane of 10 seats. 5 First 
 *  class and 5 economy. Asks customer what he wants.
 * Latest version: 4:59 PM, 2/11/2019. Second part of "sellFirstClass" method was 
 *  unfinished.
 * Older versions: 9:20 PM, 7/17/2017
 */

import java.util.Scanner;

public class AirlineReservationsSystem
{
	private static Scanner input = new Scanner(System.in);
	private static boolean isSeatSold = false;
	// Used by the program to understand if a seat has been sold while searching 
	// through seats or no empty seats we found.
	private static boolean[] array = new boolean[11]; // 1-5 first class, 6-10 second class.
	private static byte seatSelection;

	public static void main(String[] args)
	{
		do
		{
			System.out.printf("Press 1 for first class seat or press 2 for economy seat "
				+ "or press 3 to exit: ");
			seatSelection = input.nextByte();
			
			if (seatSelection == 1)
				sellFirstClass();
			else if (seatSelection == 2)
				sellEconomy();
		} while (seatSelection != 3);
	}

	public static void sellFirstClass()
	{
		for (byte counter = 1; counter <= 5; counter++)
			if (array[counter] == false)
			{
				array[counter] = true;
				isSeatSold = true;
				System.out.printf("Your seat number is %d(first class).%n", counter);
				break;
			}

		if (isSeatSold == false)
		{
			System.out.printf("No first class seats left. Press 4 if you would like "
				+ "to buy an economy seat or press 3 to exit: ");
			seatSelection = input.nextByte();

			if (seatSelection == 4)
				sellEconomy();
			else
			{
				System.out.printf("Next flight leaves in 3 hours.%n");
				return;
			}
		}

		isSeatSold = false; // Resetting the program for next customer.
	}

	public static void sellEconomy()
	{
		for (byte counter = 6; counter <= 10; counter++)
		{
			if (array[counter] == false)
			{
				array[counter] = true;
				isSeatSold = true;
				System.out.printf("Your seat number is %d(economy).%n", counter);
				break;
			}
		}

		if (isSeatSold == false)
		{
			System.out.printf("No economy seats left. Press 4 if you would like "
				+ "to buy a first class seat or press 3 to exit: ");
			seatSelection = input.nextByte();

			if (seatSelection == 4)
				sellFirstClass();
			else
			{
				System.out.printf("Next flight leaves in 3 hours.%n");
				return;
			}
		}

		isSeatSold = false; // Resetting the program for next customer.
	}
}

// This is the modified version of Craps.java. Now there is wager, bank balance 
//  and chatter in the game and you can play the game as long as you want.

// Fig. 6.8: Craps.java
// Craps class simulates the dice game craps.
import java.security.SecureRandom;
import java.util.Scanner;

public class Craps2
{
	// create secure random number generator for use in method rollDice
	private static final SecureRandom randomNumbers = new SecureRandom();

	// enum type with constants that represent the game status
	private enum Status { CONTINUE, WON, LOST };

	// constants that represent common rolls of the dice
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

	private static int bankBalance = 1000;

	public static void main(String[] args)
	{
		// the point player will be assigned if no win or loss on first roll
		int myPoint = 0;
		Status gameStatus; // can contain CONTINUE, WON or LOST

		Scanner input = new Scanner(System.in);

		System.out.println("Balance: " + bankBalance);
		while (true)
		{
			int wager;

			do
			{
				System.out.print("Enter wager or enter 0 to exit: ");
				wager = input.nextInt();

				// Check if wager is 0 or negative.
				if (wager <= 0)
					System.exit(0);

				// Check if balance is enough for wager.
				if (!isBalanceEnough(wager))
				{
					System.out.println("Wager value bigger than bank balance. Please "
						+ "try again.");
					continue;
				}
				else // We have valid wager. Start playing the game.
					break;
			} while (true);

			int sumOfDice = rollDice(); // first roll of the dice

			// determine game status and point based on first roll 
			switch (sumOfDice)
			{
				case SEVEN: // win with 7 on first roll
				case YO_LEVEN: // win with 11 on first roll           
					gameStatus = Status.WON;
					break;
				case SNAKE_EYES: // lose with 2 on first roll
				case TREY: // lose with 3 on first roll
				case BOX_CARS: // lose with 12 on first roll
					gameStatus = Status.LOST;
					break;
				default: // did not win or lose, so remember point         
					gameStatus = Status.CONTINUE; // game is not over
					myPoint = sumOfDice; // remember the point
					System.out.printf("Point is %d%n", myPoint);
					break;
			}

			// while game is not complete
			while (gameStatus == Status.CONTINUE) // not WON or LOST
			{
				sumOfDice = rollDice(); // roll dice again

				// determine game status
				if (sumOfDice == myPoint) // win by making point
					gameStatus = Status.WON;
				else if (sumOfDice == SEVEN) // lose by rolling 7 before point
					gameStatus = Status.LOST;
			}

			// display won or lost message and edit bank balance
			if (gameStatus == Status.WON)
			{
				bankBalance += wager;
				System.out.printf("Player wins, new bank balance = %d%n%n", bankBalance);
				chatter(gameStatus);
			}
			else
			{
				bankBalance -= wager;
				System.out.printf("Player lose, new bank balance = %d%n%n", bankBalance);
				chatter(gameStatus);
			}
		}
	}

	// roll dice, calculate sum and display results
	public static int rollDice()
	{
		// pick random die values
		int die1 = 1 + randomNumbers.nextInt(6); // first die roll
		int die2 = 1 + randomNumbers.nextInt(6); // second die roll

		int sum = die1 + die2; // sum of die values

		// display results of this roll
		System.out.printf("Player rolled %d + %d = %d%n",
			die1, die2, sum);

		return sum;
	}

	public static boolean isBalanceEnough(int wager)
	{
		if (wager <= bankBalance)
			return true;
		else
			return false;
	}

	private static String chatter(Status gameStatus)
	{
		int stringNumber = randomNumbers.nextInt(2);

		if (gameStatus == Status.WON)
		{
			if (stringNumber == 0)
				return "Sorry you busted!";
			else
				return "Oh, you're going broke, huh?";
		}
		else
		{
			if (stringNumber == 0)
				return "You are winning!";
			else
				return "Now's the time cash in your chips!";
		}
	}
} // end class Craps

/**
 * ************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and * Pearson Education,
 * Inc. All Rights Reserved. * * DISCLAIMER: The authors and publisher of this
 * book have used their * best efforts in preparing the book. These efforts
 * include the * development, research, and testing of the theories and programs
 * * to determine their effectiveness. The authors and publisher make * no
 * warranty of any kind, expressed or implied, with regard to these * programs
 * or to the documentation contained in these books. The authors * and publisher
 * shall not be liable in any event for incidental or * consequential damages in
 * connection with, or arising out of, the * furnishing, performance, or use of
 * these programs. *
 ************************************************************************
 */

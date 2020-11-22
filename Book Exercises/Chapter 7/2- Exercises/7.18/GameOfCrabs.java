// Plays the game of craps one million times and prints various statistics.

// Fig. 6.8: Craps.java
// Craps class simulates the dice game craps.
import java.security.SecureRandom;

public class GameOfCrabs
{
	// Create secure random number generator for use in method rollDice.
	private static final SecureRandom randomNumbers = new SecureRandom();

	// Enum type with constants that represent the game status.
	private enum Status
	{
		CONTINUE, WON, LOST
	};

	// Constants that represent common rolls of the dice.
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

	private static int[] arrayWin = new int[22];
	private static int[] arrayLose = new int[22];
	private static int rollCounter;
	private static int winCounter;
	private static int loseCounter;
	private static final int GAME_LENGTH = 1_000_000;
	private static int totalGameLength;
	private static float averageLength;
	private static int totalWonGameLength;
	private static float averageWonGameLength;
	private static int totalLostGameLength;
	private static float averageLostGameLength;
	private static Status gameStatus;

	// Plays one million game of craps.
	public static void main(String[] args)
	{
		for (int counter = 0; counter < GAME_LENGTH; counter++)
		{
			int myPoint = 0; // Point if no win or loss on first roll.

			int sumOfDice = rollDice(); // First roll of the dice.
			rollCounter = 1; // Reset roll counter for the new round.

			// Determine game status and point based on first roll.
			switch (sumOfDice)
			{
				case SEVEN: // Win with 7 on first roll.
				case YO_LEVEN: // Win with 11 on first roll.
					processWin();
					break;
				case SNAKE_EYES: // Lose with 2 on first roll.
				case TREY: // Lose with 3 on first roll.
				case BOX_CARS: // Lose with 12 on first roll.
					processLoss();
					break;
				default: // Did not win or lose, so remember point.
					gameStatus = Status.CONTINUE; // Game is not over.
					myPoint = sumOfDice; // Remember the point.
					//System.out.printf("Point is %d%n", myPoint); // Print slows down 
					// the program.
					break;
			}

			// While game is not complete.
			while (gameStatus == Status.CONTINUE) // Not WON or LOST.
			{
				sumOfDice = rollDice(); // roll dice again
				rollCounter++;

				// Determine game status.
				if (sumOfDice == myPoint) // Win by rolling point.
					processWin();
				else if (sumOfDice == SEVEN) // Lose by rolling 7 before point.
					processLoss();
			}

			// display won or lost message // Print slows down the program.
			/*if (gameStatus == Status.WON)
				System.out.println("Player wins");
			else
				System.out.println("Player loses");*/
		}

		//Display win statistics.
		System.out.println("Amount of times we won in different rolls(21. roll is "
			+ "rolls beyond 20)");
		for (int counter = 1; counter < arrayWin.length; counter++)
		{
			System.out.printf("%2d: %,8d %n", counter, arrayWin[counter]);
			winCounter += arrayWin[counter];
		}

		System.out.printf("%nTotal wins = %,d%n", winCounter);

		//Display lose statistics.
		System.out.printf("%nAmount of times we lost in different rolls(21. roll is "
			+ "rolls beyond 20)%n");
		for (int counter = 1; counter < arrayLose.length; counter++)
		{
			System.out.printf("%2d: %,8d %n", counter, arrayLose[counter]);
			loseCounter += arrayLose[counter];
		}

		System.out.printf("%nTotal loses = %,d%n", loseCounter);

		// Display win percentage.
		System.out.printf("%nWin percentege = %,.2f%%%n", 100 * (double) winCounter
			/ (winCounter + loseCounter));

		// Display average, won and lost game lengths.
		averageLength = ((float) totalGameLength / GAME_LENGTH);
		System.out.printf("Average game length of %,d rounds played is %.2f%n",
			GAME_LENGTH, averageLength);
		averageWonGameLength = ((float) totalWonGameLength / winCounter);
		System.out.printf("Average won game length of %,d rounds won is %.2f%n",
			winCounter, averageWonGameLength);
		averageLostGameLength = ((float) totalLostGameLength / loseCounter);
		System.out.printf("Average lost game length of %,d rounds lost is %.2f%n",
			loseCounter, averageLostGameLength);

		// Display first round and non-first round win rates.
		System.out.printf("%,d many times you won in the first round while %,d many "
			+ "times you lost in the first round.%nWin rate in first round = %.2f%%%n",
			arrayWin[1], arrayLose[1], 100 * (float) arrayWin[1]
			/ (arrayWin[1] + arrayLose[1]));
		System.out.printf("Win rate in non-first round: %.2f%%%n", 100 * (float) (winCounter - arrayWin[1])
			/ ((winCounter - arrayWin[1]) + (loseCounter - arrayLose[1])));
	}

	// Roll dice, calculate sum, and display results.
	public static int rollDice()
	{
		// Pick random die values.
		int die1 = 1 + randomNumbers.nextInt(6); // First die roll.
		int die2 = 1 + randomNumbers.nextInt(6); // Second die roll.

		int sum = die1 + die2; // Sum of die values.

		// Display results of this dice roll.
		/*System.out.printf("Player rolled %d + %d = %d%n",  // Print slows down the program
			die1, die2, sum);*/
		return sum;
	}

	public static void processWin()
	{
		gameStatus = Status.WON;
		totalGameLength += rollCounter;
		totalWonGameLength += rollCounter;
		if (rollCounter <= 21)
			arrayWin[rollCounter]++;
		else
			arrayWin[21]++;
	}

	public static void processLoss()
	{
		gameStatus = Status.LOST;
		totalGameLength += rollCounter;
		totalLostGameLength += rollCounter;
		if (rollCounter <= 21)
			arrayLose[rollCounter]++;
		else
			arrayLose[21]++;
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
 * ***********************************************************************
 */

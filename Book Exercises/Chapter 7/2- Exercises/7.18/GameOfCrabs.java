// Fig. 6.8: Craps.java
// Craps class simulates the dice game craps.
import java.security.SecureRandom;

public class GameOfCrabs
{
   // create secure random number generator for use in method rollDice
   private static final SecureRandom randomNumbers = new SecureRandom();
	
   // enum type with constants that represent the game status
   private enum Status {CONTINUE, WON, LOST};
	
   // constants that represent common rolls of the dice
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
   //private static int firstRoundWinCounter;
   //private static int firstRoundLoseCounter;
	
   // plays one million game of craps
   public static void main(String[] args)
   {
      for (int counter = 0; counter < GAME_LENGTH; counter++)
      {
         int myPoint = 0; // point if no win or loss on first roll
         Status gameStatus; // can contain CONTINUE, WON or LOST
			
         int sumOfDice = rollDice(); // first roll of the dice
         rollCounter = 1;
			
         // determine game status and point based on first roll 
         switch (sumOfDice) 
         {
            case SEVEN: // win with 7 on first roll
            case YO_LEVEN: // win with 11 on first roll           
               gameStatus = Status.WON;
               arrayWin[rollCounter]++;
               totalGameLength += rollCounter;
               totalWonGameLength += rollCounter;
               //winCounter++;
               //firstRoundWinCounter++;
               break;
            case SNAKE_EYES: // lose with 2 on first roll
            case TREY: // lose with 3 on first roll
            case BOX_CARS: // lose with 12 on first roll
               gameStatus = Status.LOST;
               arrayLose[rollCounter]++;
               totalGameLength += rollCounter;
               totalLostGameLength += rollCounter;
               //loseCounter++;
               //firstRoundLoseCounter++;
               break;
            default: // did not win or lose, so remember point         
               gameStatus = Status.CONTINUE; // game is not over
               myPoint = sumOfDice; // remember the point
               //System.out.printf("Point is %d%n", myPoint); // Print slows down 
					// the program
               break;
         } 

         // while game is not complete
         while (gameStatus == Status.CONTINUE) // not WON or LOST
         {
            sumOfDice = rollDice(); // roll dice again
            rollCounter++;

            // determine game status
            if (sumOfDice == myPoint) // win by making point
            {
               gameStatus = Status.WON;
               //winCounter++;
               totalGameLength += rollCounter;
               totalWonGameLength += rollCounter;
               if (rollCounter >= 21)
                  arrayWin[21]++;
               else
                  arrayWin[rollCounter]++;
            }
            else if (sumOfDice == SEVEN) // lose by rolling 7 before point
            {
               gameStatus = Status.LOST;
               //loseCounter++;
               totalGameLength += rollCounter;
               totalLostGameLength += rollCounter;
               if (rollCounter >= 21)
                  arrayLose[21]++;
               else
                  arrayLose[rollCounter]++;
            }
         } 

         // display won or lost message // Print slows down the program
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
			/ ( winCounter + loseCounter));
		
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
			/ ( (winCounter - arrayWin[1]) + (loseCounter - arrayLose[1]) ));
   }
	
   // roll dice, calculate sum and display results
   public static int rollDice()
   {
      // pick random die values
      int die1 = 1 + randomNumbers.nextInt(6); // first die roll
      int die2 = 1 + randomNumbers.nextInt(6); // second die roll
		
      int sum = die1 + die2; // sum of die values
		
      // display results of this roll
      /*System.out.printf("Player rolled %d + %d = %d%n",  // Print slows down the program
         die1, die2, sum);*/
		
      return sum; 
   }
} // end class Craps

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/

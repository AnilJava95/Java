/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Player guesses a random number between 1 and 1000. 
 *  Difference from 6.30 is that this one counts number of tries. 
 * Latest version: 2:50 PM, 9/3/2019. Changed while statement to do while.
 * Older versions: 23:58 02/07/2017.
 */

import java.util.Scanner;
import java.security.SecureRandom;

public class GuessTheNumber2
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int randomNumber; // Between 1 and 1000.
      //int gameState;
      int playersGuess;
      int guessCounter = 0;
      
      randomNumber = randomNumber();
      
      //System.out.println("GuessTheNumber.main()");
      
      do
      {
			System.out.print("Enter your guess or enter 0 to leave: ");
         playersGuess = input.nextInt();
			if(playersGuess == 0)
				break;
         guessCounter++;
			
         if (playersGuess < randomNumber)
            System.out.println("Too low, try again.");
         else if (playersGuess > randomNumber)
            System.out.println("Too high, try again.");
         else
         {
            System.out.printf("%nCongratulations. You guessed the number!%nNumber"
               + " of guesses: %d%n", guessCounter);
            
				if (guessCounter < 10)
               System.out.printf("Either you know the secret or you got lucky!%n");
            else if(guessCounter == 10)
               System.out.printf("Aha! You know the secret!%n");
            else
					System.out.printf("You should be able to do better!%n");
				
				break;
         }
      } while(true);
   }
   
   public static int randomNumber()
   {
      int randomNumber;
      SecureRandom randomNumbers = new SecureRandom();
      randomNumber = 1 + randomNumbers.nextInt(1000);
      return randomNumber;
   }
}
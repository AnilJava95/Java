/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Number guessing game. Arandom number between 1 and 1000 
 *  is generated. Players tries to guess it. Computer tells if player guessed 
 *  too high or too low.
 * Latest version: 23:26 02/07/2017.
 * Older versions: 
 */

import java.util.Scanner;
import java.security.SecureRandom;

public class GuessTheNumber
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int randomNumber; // Between 1 and 1000.
      //int gameState;
      int playersGuess;
      
      randomNumber = randomNumber();
      
      //System.out.println("GuessTheNumber.main()");
      
      do {
         System.out.print("Enter your guess or enter 0 to leave: ");
         playersGuess = input.nextInt();
         
         if (playersGuess < randomNumber)
            System.out.println("Too low, try again.");
         else if (playersGuess > randomNumber)
            System.out.println("Too high, try again.");
         else
			{
				System.out.printf("%nCongratulations. You guessed the number!%n");
				break;
			}
      } while (playersGuess != 0);
   }
   
   public static int randomNumber()
   {
      int randomNumber;
      SecureRandom randomNumbers = new SecureRandom();
      randomNumber = 1 + randomNumbers.nextInt(1000);
      return randomNumber;
   }
}
/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Plays first stage of game crabs 36 million times. Rolls 
 *  two dice and calculates their sum. And increments respective element in array 
 *  to keep count too see what is the possibility of getting certain sums.
 * Latest version: 13:39 11/02/2019. Moved "randomNumbers" declaration from "rollDice" 
 *  method to field. Run time decreased from 59 seconds to 9 seconds...
 * Older versions: 02:11 17/07/2017.
 */

import java.util.Scanner;
import java.security.SecureRandom;

public class DiceRolling
{
	static SecureRandom randomNumbers = new SecureRandom();
	
   public static void main(String[] args)
   {
      //Scanner input = new Scanner(System.in);
      
      int[] array = new int[13];
      int sumOfTwoDice = 0;
      
      for (int counter = 0; counter < 36_000_000; counter++)
      {
         sumOfTwoDice = rollDice();
         
         array[sumOfTwoDice]++;
      }
      
      for (int counter = 2; counter < 13; counter++)
      {
         System.out.printf("%2d: %,9d%n", counter , array[counter]);
      }
   }
   
   public static int rollDice()
   {
      int randomNumber1 = 1 + randomNumbers.nextInt(6);
      int randomNumber2 = 1 + randomNumbers.nextInt(6);
      
      int sumOfDice = randomNumber1 + randomNumber2;
      
      return sumOfDice;
   }
}
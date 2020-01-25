/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Asks user to either toss a coin or stop the program. 
 *  Coin is flipped randomly and each side is counted and displayed.
 * Latest version: 01:24 02/07/2017.
 * Older versions: 
 */

import java.util.Scanner;
import java.security.SecureRandom;

public class CoinTossing
{
   private enum Coin { HEADS, TAILS };
   
   private static int headsCount;
   private static int tailsCount;
	
	static SecureRandom randomNumbers = new SecureRandom();
   
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int menuSelect;
      
      System.out.printf("Menu%n1: Toss coin.%n2: Stop.%nYour selection: ");
      menuSelect = input.nextInt();
      
      while (menuSelect != 2)
      {
         if(flip() == Coin.HEADS)
            headsCount++;
         else
            tailsCount++;
         
         System.out.printf("%nHeads count: %d%nTails count: %d%n%n", headsCount, tailsCount);
         
         System.out.printf("Menu%n1: Toss coin.%n2: Stop.%nYour selection: ");
         menuSelect = input.nextInt();
      }
   }
   
   public static Coin flip()
   {
      int randomValue = randomNumbers.nextInt(2);
      
      if(randomValue == 0)
         return Coin.HEADS;
      else
         return Coin.TAILS;
   }
}
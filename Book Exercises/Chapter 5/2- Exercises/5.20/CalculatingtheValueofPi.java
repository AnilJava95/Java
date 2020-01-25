/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Calculating value o pi using numerical methods approach.
 * Latest version: 04:32 16/10/2017. Added a comma to counter to make it easier 
 *  to read. Takes 136,120 terms to get to 3.14159.
 * Older versions: 18:59 09/06/2017. Changed comments and printing format. Also 
 *  added a percentege difference display from last result.
 *    00:10 07/09/2016.
 */

public class CalculatingtheValueofPi
{
   public static void main(String[] args)
   {
      double pi = 4;
      int power = 1;
      int denominator = 3;
      
      double difference;
      double lastPi = 4;
      
      for (int counter = 1; counter <= 200_000; counter++)
      {
         lastPi = pi;
         pi += Math.pow(-1, power) * ((double) 4 / denominator);
			// 4 / 2.66 = 0.66. This means 2.66 is 66% of 4. This means 2.66 is what 
			//  you get when you decrease 4 by 33%.
         difference = Math.abs((pi / lastPi -1) * 100);
         
         denominator += 2;
         power += 1;
         
         System.out.printf("%,5d: %.15f difference = %f%%%n", counter, pi, difference);
      }
   }
}
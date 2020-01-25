/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Finds prime numbers from 2 to 100_00. Uses sqrt(number).
 * Latest version: 16:20 01/07/2017.
 * Older versions: 
 */

import java.util.Scanner;

public class PrimeNumbersC
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      for(int counter1 = 2; counter1 <= 100_000; counter1++)
      {
         if (isPrime(counter1))
         {
            System.out.println(counter1);
         }
      }
   }
   
   public static boolean isPrime(int number)
   {
      int divisor = 0;
      int sqrtNumber = (int)Math.sqrt(number);
      
      for(int counter = 2; counter <= sqrtNumber; counter++)
      {
         if(number % counter == 0)
            return false;
      }
      
      return true;
   }
}
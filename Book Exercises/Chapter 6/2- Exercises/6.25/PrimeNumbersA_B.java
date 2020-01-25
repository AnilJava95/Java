/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Finds prime numbers from 2 to 100_00. Uses number / 2.
 * Latest version: 16:19 01/07/2017.
 * Older versions: 
 */

import java.util.Scanner;

public class PrimeNumbersA_B
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
      int halfNumber = number / 2;
      
      for(int counter = 2; counter <= halfNumber; counter++)
      {
         if(number % counter == 0)
            return false;
      }
      
      return true;
   }
}
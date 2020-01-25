/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Checks if the number is a palindrome number(same when 
 *  read backwards).
 * Latest version: 19:31 20/05/2017. Changed comments.
 * Older versions: 14:35 06/08/2016.
 */

import java.util.Scanner;

public class Palindrome
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int number = 0;
      int tempNumber;
      int digit;
      int firstDigit;
      int secondDigit;
      //int thirdDigit;
      int fourthDigit;
      int fifthDigit;
      
      while (number != -1)
      {
         digit = 0;
         
         System.out.print("Enter a 5 digit number or enter -1 to exit: ");
         number = input.nextInt();
         if (number == -1)
            break;
			
         tempNumber = number;
         
         while (tempNumber > 0)
         {
            tempNumber /= 10;
            digit++;
         }
         
         if (digit != 5)
         {
            System.out.printf("Number is not 5 digits. Try again: %n%n");
            continue;
         }
         
         firstDigit = number % 10;
         secondDigit = number % 100 / 10;
         //thirdDigit = number % 1_000 / 100;
         fourthDigit = number % 10_000 / 1_000;
         fifthDigit = number % 100_000 / 10_000;
         
         if (firstDigit == fifthDigit && secondDigit == fourthDigit) {
            System.out.printf("Number is palindrome.%n%n");
         }
         else
            System.out.printf("Number is not palindrome%n%n");
      }
   }
}
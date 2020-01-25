/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Encrypts a message.
 * Latest version: 15:03 05/02/2019. Problems arised if encrypted message's first 
 *  digit is zero. In order to get rid of that problem, i hold the encrypted 
 *  digits one by one. We do this since we didnt use strings and arrays.
 * Older versions: 19:43 20/05/2017. Changed comments.
 *  15:10 14/08/2016.
 */

import java.util.Scanner;

public class Encrypt
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int number;
      int encryptedNumber = 0;
      //int counter = 1;
      //int coefficient = 1;
      int firstDigit;
      int secondDigit;
      int thirdDigit;
      int fourthDigit;
      
      System.out.print("Enter a 4 digit number to encrypt it: ");
      number = input.nextInt();
      
      thirdDigit = ((number / 1000 + 7) % 10);
      fourthDigit = ((number / 100 % 10 + 7) % 10);
      firstDigit = ((number / 10 % 10 + 7) % 10);
      secondDigit = ((number % 10 + 7) % 10);
		
		System.out.printf("Encrypted message: %d%d%d%d%n", firstDigit, secondDigit, 
			thirdDigit, fourthDigit);
   }
}
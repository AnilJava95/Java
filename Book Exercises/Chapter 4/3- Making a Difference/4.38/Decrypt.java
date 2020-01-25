/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Decrypts a message.
 * Latest version: 11:59 AM, 9/2/2019. Instead of first taking the digits and then decrypting them, 
 *  i merged them. I also used two step decrypt instead of three. I got the 
 *  two step decrypt algorithm from my notes(4.38.jpg).
 * Older versions: 15:03 05/02/2019. Problems arised if encrypted message's first 
 *  digit is zero. In order to get rid of that problem, i hold the encrypted 
 *  digits one by one. We do this since we didnt use strings and arrays.
 */

import java.util.Scanner;

public class Decrypt
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int firstDigit;
      int secondDigit;
      int thirdDigit;
      int fourthDigit;
		int encryptedNumber;
		
		System.out.print("Enter a 4 digit number to decrypt it: ");
      encryptedNumber = input.nextInt();
		
		// Dividing number to its digits and also getting rid of digit swap.
		thirdDigit = ((encryptedNumber / 1000) + 3) % 10;
      fourthDigit = ((encryptedNumber / 100 % 10) + 3) % 10;
      firstDigit = ((encryptedNumber / 10 % 10) + 3) % 10;
      secondDigit = ((encryptedNumber % 10) + 3) % 10;
		
		/*
		// Last part of decrypting.
		firstDigit = (firstDigit + 10 - 7) % 10;
      secondDigit = (secondDigit + 10 - 7) % 10;
      thirdDigit = (thirdDigit + 10 - 7) % 10;
      fourthDigit = (fourthDigit + 10 - 7) % 10;
		*/
      
      System.out.printf("Decrypted message : %d%d%d%d%n", firstDigit, 
			 secondDigit, thirdDigit, fourthDigit);
	}
}
/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Seperates an integer with 5 digits to its digits. 
 *  Program can handle more or less digits too.
 * Latest version: 11:11 29/01/2019. Changed "%d   %d" with "%d%4d".
 * Older versions: 08:19 18/04/2017. Changed comments.
		23.36 19/06/2016
 */

import java.util.Scanner;

public class Seperating_Digits_in_an_Integer
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter an integer: ");
      int number = input.nextInt();
      
      // seperate and show digits
      System.out.printf("%d%4d", number / 10000 % 10, number / 1000 % 10);
      System.out.printf("%4d%4d",number / 100 % 10, number / 10 % 10);
      System.out.printf("%4d%n", number % 10);
   }
}
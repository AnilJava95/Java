/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Takes length of a square and the character from user and 
 *  prints a square made out of that character with that side length.
 * Latest version: 19:50 30/06/2017.
 * Older versions: 
 */

import java.util.Scanner;

public class SquareOfCharacters
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int sideLength;
      char fillCharacter;
      
      System.out.print("Enter length of asterisk square: ");
      sideLength = input.nextInt();
      
      System.out.print("Enter character of the square: ");
      fillCharacter = input.next().charAt(0);
      
      squareOfAsterisks(sideLength, fillCharacter);
   }
   
   public static void squareOfAsterisks(int sideLength, char fillCharacter)
   {
      for(int counter1 = 1; counter1 <= sideLength; counter1++)
      {
         for(int counter2 = 1; counter2 <= sideLength; counter2++)
         {
            System.out.print(fillCharacter);
         }
         System.out.printf("%n");
      }
   }
}
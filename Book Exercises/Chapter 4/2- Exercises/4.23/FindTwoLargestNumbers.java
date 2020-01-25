/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Finds the largest and second largest numbers
 *  among 10 numbers and their places.
 * Latest version: 11:49 05/02/2019. Changed "largest = number;" with 
 *  "secondLargest = number; placeOfSecondLargest = counter;" in "else if".
 * Older versions: 18:09 20/05/2017. Changed comments. Now only displaying 2 digits
 *  after decimal point. Changed data types to float from int.
 *		21:30 02/08/2016
 */

import java.util.Scanner;

public class FindTwoLargestNumbers
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      float largest = 0.0F;
      float secondLargest = 0.0F;
      int placeOfLargest = 0;
      int placeOfSecondLargest = 0;
      float number;
      int counter = 1;
      
      while (counter <= 5)
      {
         System.out.print("Enter next number: ");
         number = input.nextFloat();
         
         if (number > largest)
         {
            secondLargest = largest;
            largest = number;
            
            placeOfSecondLargest = placeOfLargest;
            placeOfLargest = counter;
         }
         else if (number > secondLargest)
         {
            secondLargest = number;
				placeOfSecondLargest = counter;
         }
         
         counter++;
      }
      
      System.out.printf("%nLargest: %.2f, place: %d%nSecond Largest: %.2f, " +
         "place: %d%n",largest, placeOfLargest, secondLargest, placeOfSecondLargest);
   }
}
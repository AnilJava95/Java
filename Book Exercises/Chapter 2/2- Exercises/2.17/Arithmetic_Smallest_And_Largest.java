/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Inputs 3 integers, displays sum, average, product, 
 *  smallest and largest of the numbers.
 * Latest version:  07:06 18/04/2017. Changed comments.
 * Older versions:  16:52 19/06/2016. Changed way of finding smallest and 
 *  largest.
 *    16:21 19/06/2016.
 */

import java.util.Scanner;

public class Arithmetic_Smallest_And_Largest
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
		
      int number1;
      int number2;
      int number3;
      int min;
      int max;
		
      System.out.print("Enter first integer: ");
      number1 = input.nextInt();
      min = max = number1;
		
      System.out.print("Enter second integer: ");
      number2 = input.nextInt();
      if(number2 < min)
         min = number2;
      if (number2 > max)
         max = number2;
		
      System.out.print("Enter third integer: ");
      number3 = input.nextInt();
      if(number3 < min)
         min = number3;
      if (number3 > max)
         max = number3;
		
      System.out.printf("Sum is: %d%n", number1 + number2 + number3 );
		
      System.out.printf("Average is: %d%n", (number1 + number2 + number3) / 3 );
		
      System.out.printf("Product is: %d%n", number1 * number2 * number3);
		
      System.out.printf("Smallest is: %d%n", min);
		
      System.out.printf("Largest is: %d%n", max);
   }
}
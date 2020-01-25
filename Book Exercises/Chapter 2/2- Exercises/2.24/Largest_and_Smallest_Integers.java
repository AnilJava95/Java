/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Inputs 5 integers. Displays smallest and largest of the 
 *  numbers.
 * Latest version: 07:34 18/04/2017. Changed comments.
 * Older versions: 17:00 10/06/2016
 */

import java.util.Scanner;

public class Largest_and_Smallest_Integers
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
		
   	int number1;
   	int number2;
   	int number3;
   	int number4;
   	int number5;
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
		
    	System.out.print("Enter fourth integer: ");
      number4 = input.nextInt();
      if(number4 < min)
   	   min = number4;
      if (number4 > max)
   	   max = number4;
		
     	System.out.print("Enter fifth integer: ");
      number5 = input.nextInt();
      if(number5 < min)
         min = number5;
      if (number5 > max)
         max = number5;
		
      System.out.printf("Smallest is: %d%n", min);
		
      System.out.printf("Largest is: %d%n", max);
   }
}
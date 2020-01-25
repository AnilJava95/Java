/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Takes an integer from user and checks if it is divisible 
 *  by 3.
 * Latest version: 00:00 27/01/2019 Changed "if( number1 % 3 != 0)" with "else".
 * Older versions: 07:39 18/04/2017. Changed comments.
 *		17:19 19/06/2016
 */
 
import java.util.Scanner;

public class Divisible_By_3
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
		
   	int number1;
		
      System.out.print("Enter an integer: ");
      number1 = input.nextInt();
		
   	if( number1 % 3 == 0)
         System.out.print("Number is divisible by 3");
      else
         System.out.print("Number is not divisible by 3");
   }
}
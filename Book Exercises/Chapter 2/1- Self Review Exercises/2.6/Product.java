/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Calculates product of three integers
 * Latest version: 05:34 18/04/2017. Changed comments and the convention on 
 *  reading variables.
 * Older versions: 01:56 19/06/2016
 */

import java.util.Scanner; 

public class Product
{
   public static void main(String[] args)
   {
      
      Scanner input = new Scanner(System.in);
      int x;
      int y;
      int z;
      int result;
       
      System.out.print("Enter first integer: ");
      x = input.nextInt();
      
      System.out.print("Enter secon integer: ");
      y = input.nextInt();
      
      System.out.print("Enter third integer: ");
      z = input.nextInt();
      
      result = x * y * z;
      
      System.out.printf("Product is %d%n", result);
    } 
} 

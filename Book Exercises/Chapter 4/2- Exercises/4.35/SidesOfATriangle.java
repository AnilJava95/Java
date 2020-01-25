/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Takes lengths of three sides of a triangle and calculates 
 *  if it is a valid triangle.
 * Latest version: 19:24 20/05/2017. Changed comments.
 * Older versions: 08:06 09/08/2016.
 */

import java.util.Scanner;
import static java.lang.Math.abs;

public class SidesOfATriangle
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      float firstSide;
      float secondSide;
      float thirdSide;
      
      System.out.print("Enter first side: ");
      firstSide = input.nextFloat();
      System.out.print("Enter second side: ");
      secondSide = input.nextFloat();
      System.out.print("Enter third side: ");
      thirdSide = input.nextFloat();
      
      if ( (abs(firstSide - secondSide) < thirdSide ) &&
         ((firstSide + secondSide) > thirdSide) )
      {
         System.out.println("Valid triangle.");
      }
      else
      {
         System.out.println("Invalid triangle.");
      }
   }
}
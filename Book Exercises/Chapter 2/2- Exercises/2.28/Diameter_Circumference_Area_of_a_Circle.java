/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Takes radius of circle from user and prints diatemeter, 
 *  circumference and area of circle.
 * Latest version: 07:56 18/04/2017. Changed comments.
 * Older versions: 21:08 19/06/2016
 */

import java.util.Scanner;

public class Diameter_Circumference_Area_of_a_Circle
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int radius;
      
      System.out.print("Enter radius: ");
      radius = input.nextInt();
      
      System.out.printf("Diameter is: %d%n", 2 * radius);
      System.out.printf("Circumference is: %f%n", 2 * Math.PI * radius);
      System.out.printf("Area is: %f%n", Math.PI * radius * radius);
   }
}
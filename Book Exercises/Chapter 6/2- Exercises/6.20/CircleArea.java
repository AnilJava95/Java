/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Takes radius of a circle from user, calculates and prints
 *  area of that circle.
 * Latest version: 20:07 30/06/2017.
 * Older versions: 
 */

import java.util.Scanner;

public class CircleArea
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      double radius;
      double area;
      
      System.out.print("Enter radius of a circle to find it's area: ");
      radius = input.nextDouble();
      
      area = circleArea(radius);
      System.out.printf("Radius = %.2f, Area = %.2f%n", radius, area);
   }
   
   public static double circleArea(double radius)
   {
      double area = Math.PI * Math.pow(radius, 2);
      return area;
   }
}
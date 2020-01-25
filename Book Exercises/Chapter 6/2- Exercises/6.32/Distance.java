/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Takes two x and y coordinates of two points from user and 
 *  finds the distance between them and displays it.
 * Latest version: 09:02 04/07/2017.
 * Older versions: 
 */

import java.util.Scanner;

public class Distance
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      double point1x;
      double point1y;
      double point2x;
      double point2y;
      double distance;
      
      System.out.println("Enter 2 points to finds distance between them.");
      
      System.out.print("Enter point1x: ");
      point1x = input.nextDouble();
      
      System.out.print("Enter point1y: ");
      point1y = input.nextDouble();
      
      System.out.print("Enter point2x: ");
      point2x = input.nextDouble();
      
      System.out.print("Enter point2y: ");
      point2y = input.nextDouble();
      
      distance = distance(point1x, point1y, point2x, point2y);
      
      System.out.printf("Distance = %.2f%n", distance);
   }
   
   public static double distance(double point1x, double point1y, double point2x, 
      double point2y)
   {
      double distance = Math.sqrt(Math.pow(point2x - point1x, 2) + 
         Math.pow(point2y - point1y, 2));
              return distance;
   }
}
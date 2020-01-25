/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Takes the main method arguments and finds minimum, 
 *  maximum, average of minimum and maximum. And then prints them all.
 * Latest version: 12:21 11/02/2019. 0 was default value for min and max. I made 
 *  args[0] the default value for min and max. Also changed calculateMinimum and 
 *  calculateMaximum methods to use normal for loop so we dont waste time comparing 
 *  args[0] with args[0].
 * Older versions: 23:05 16/07/2017.
 */

//import java.util.Scanner;

public class CommandLineArguments
{
   public static void main(String[] args)
   {
      //Scanner input = new Scanner(System.in);
      
      int minimum = calculateMinimum(args);
      int maximum = calculateMaximum(args);
      double average = calculateAverage(minimum, maximum);
      
      System.out.printf("Min: %d%nMax: %d%nAverage: %.2f%n", minimum, maximum, 
         average);  
   }
   
   public static int calculateMinimum(String[] args)
   {
      int minimum = Integer.parseInt(args[0]);
      
      for(int counter = 1; counter < args.length; counter++)// String string1 : args)
      {
         if (Integer.parseInt(args[counter]) < minimum)
         {
            minimum = Integer.parseInt(args[counter]);
         }
      }
      
      return minimum;
   }
   
   public static int calculateMaximum(String[] args)
   {
      int maximum = Integer.parseInt(args[0]);
      
      for(int counter = 1; counter < args.length; counter++)// String string1 : args)
      {
         if (Integer.parseInt(args[counter]) > maximum)
         {
            maximum = Integer.parseInt(args[counter]);
         }
      }
      
      return maximum;
   }
   
   public static double calculateAverage(int minimum, int maximum)
   {
      double average = ( (double) minimum + maximum) / 2.0;
      
      return average;
   }
}
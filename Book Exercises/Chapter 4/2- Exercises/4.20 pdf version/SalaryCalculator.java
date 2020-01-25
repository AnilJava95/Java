/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Calculates weekly salaries of workers based 
 *  on their work hours this week.
 * Latest version: 17:45 20/05/2017. Changed comments. Now only display 2 digit 
 *  after decimal point.
 * Older versions: 17:21 31/07/2016. Changed the ways you can leave the program.
 *  Made it easier and more logical.
 *    01:26 30/07/2016
 */

import java.util.Scanner;

public class SalaryCalculator
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      float normalPayPerHour;
      float workHour;
      float weekSalary;
      
      System.out.print("Enter hours of work this week or enter -1 to leave: ");
      workHour = input.nextFloat();
      
      if(workHour == -1)
      {
         System.out.println("End of program");
         System.exit(0);
      }
      
      System.out.print("Enter normal pay per hour: ");
      normalPayPerHour = input.nextFloat();
      
      while(workHour != -1)
      {
         if(workHour <= 40)
         {
            weekSalary = (workHour * normalPayPerHour);
         }
         else
         {
            weekSalary = (40 * normalPayPerHour) + ((workHour - 40) * (1.5F * 
					normalPayPerHour));
         }
         System.out.printf("Week salary is: %.2f%n%n", weekSalary);
         
         System.out.print("Enter new hours of work this week or enter -1 to "
				+ "leave: ");
         workHour = input.nextFloat();
         
         if(workHour == -1)
         {
         System.out.println("End of program");
         System.exit(0);
         }
         
         System.out.print("Enter normal pay per hour: ");
         normalPayPerHour = input.nextFloat();
      }
   }
}
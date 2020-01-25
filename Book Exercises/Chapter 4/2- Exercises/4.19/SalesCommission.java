/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Calculates weekly salaries of salesmen using
 *  %9 of sales they made  + 200.
 * Latest version: 17:26 04/02/2019. Changed "totalSalesOneWeek * (float) 9 / 100" 
 *  with "totalSalesOneWeek * 0.09F".
 * Older versions: 15:55 28/10/2018. Changed from flag system to while(true) + 
 *  break system.
 *		17:37 20/05/2017. Changed comments.
 *		23:09 27/07/2016
 */

import java.util.Scanner;

public class SalesCommission
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      float sale;
      float totalSalesOneWeek = 0.0F;
      float salary;
      //int salesManFlag = 0; //Used in the old version instead of true
      
      while(true)
      {
         System.out.print("Enter sales one by one or in total to calculate salary. "
				+ "Or enter -2 to exit: ");
         sale = input.nextFloat();
         if (sale == -2.0)
         {
            break;
         }
         while(true)
         {
            totalSalesOneWeek += sale;
            System.out.print("Enter next sale or enter -1 to print salary and " +
               "return to main menu: ");
            sale = input.nextFloat();
            if (sale == -1.0)
            {
               salary = 200 + (totalSalesOneWeek * 0.09F);
               System.out.printf("Salary is: %.2f%n", salary);
               totalSalesOneWeek = 0;
					break;
            }
         }
      }
   }
}
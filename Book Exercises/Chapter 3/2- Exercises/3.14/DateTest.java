/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Demonstrates abilities of class Date.
 *  Creates date class, initializes one object, sets-displays date.
 * Latest version: 15:02 28/04/2017. Changed comments.
 * Older versions: 20:05 04/07/2016
 */

public class DateTest
{
   public static void main(String[] args)
   {
      Date date1 = new Date(28, 11, 1995);
      
      System.out.printf("First date is: %s%n", date1.displayDate());	
      date1.setDateDay(30);
      System.out.printf("Updated date is: %s%n", date1.displayDate());
   }
}
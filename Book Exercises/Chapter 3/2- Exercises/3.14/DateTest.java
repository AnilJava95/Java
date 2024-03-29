/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Demonstrates abilities of class Date.
 *  Creates date class, initializes one object, sets-displays date.
 * Latest version: 3:02 PM, 4/28/2017. Changed comments.
 * Older versions: 8:05 PM, 7/4/2016
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

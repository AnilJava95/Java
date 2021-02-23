/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Contains class Date. Class date can hold a date that has 
 *  day, month and year. It can display date.
 * Latest version: 3:00 PM, 4/28/2017. Changed comments.
 * Older versions: 7:47 PM, 7/4/2016. Changed the way we display date. We used 
 *  to use print now we return a formatted string.
 *    7:37 PM, 7/4/2016
 */

public class Date
{
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void setDateDay(int day)
	{
		this.day = day;
	}

	public int getDateDay()
	{
		return day;
	}

	public void setDateMonth(int month)
	{
		this.month = month;
	}

	public int getDateMonth()
	{
		return month;
	}

	public void setDateYear(int year)
	{
		this.year = year;
	}

	public int getDateYear()
	{
		return year;
	}

	public String displayDate()
	{
		String Date = String.format("%d/%d/%d", day, month, year);

		return Date;
	}
}

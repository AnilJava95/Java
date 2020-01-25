/*
 * Author's name and email: Michael
 * Program description: A class that can be initialized with different foramts 
 * of time. And can display time in different formats.
 * Latest version: 5:24 PM, 9/6/2019.
 * Older versions: 
 */

public class FancyTime
{
   private int hour;
	private int minute;
	private int second;
   private String meridiem = "";
	
	public FancyTime(int hour, int minute, int second, String meridiem)
	{
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.meridiem = meridiem;
	}
	
	public FancyTime(int hour, int minute, int second)
	{
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public FancyTime(int hour, int minute)
	{
		this.hour = hour;
		this.minute = minute;
	}
	
	public void displayTime(byte flag)
	{
		switch (flag)
		{
			case 1:
				System.out.printf("%02d:%02d:%02d %s%n", hour, minute, second, meridiem);
				break;
			case 2:
				System.out.printf("%02d:%02d:%02d%n", hour, minute, second);
				break;
			case 3:
				System.out.printf("%02d:%02d%n", hour, minute);
				break;
		}
	}
   
}
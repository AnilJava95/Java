/*
 * Author's name and email: Michael
 * Program description: Tests FancyTime class.
 * Latest version: 5:24 PM, 9/6/2019.
 * Older versions: 
 */

public class FancyTimeTest
{
   public static void main(String[] args)
   {
		FancyTime time1 = new FancyTime(4, 16, 32, "a.m");
		FancyTime time2 = new FancyTime(15, 45, 1);
		FancyTime time3 = new FancyTime(23, 0);
		
		time1.displayTime((byte) 1);
		time1.displayTime((byte) 2);
		time1.displayTime((byte) 3);
		System.out.println("");
		
		time2.displayTime((byte) 1);
		time2.displayTime((byte) 2);
		time2.displayTime((byte) 3);
		System.out.println("");
		
		time3.displayTime((byte) 1);
		time3.displayTime((byte) 2);
		time3.displayTime((byte) 3);
   }
}
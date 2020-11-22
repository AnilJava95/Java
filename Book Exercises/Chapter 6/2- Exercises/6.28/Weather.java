/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Takes weather degree in celsius and returns the 
 *  appropriate message.
 * Latest version: 12:17 AM, 7/2/2017
 * Older versions: 
 */

import java.util.Scanner;

public class Weather
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
 
		float weatherDegree;

		System.out.print("Enter weather degree in celsius: ");
		weatherDegree = input.nextFloat();

		System.out.println(weather(weatherDegree));
	}

	public static String weather(float weatherDegree)
	{
		if (weatherDegree >= 20 && weatherDegree <= 30)
			return "It's lovely weather for sports today!";
		else if (weatherDegree >= 10 && weatherDegree < 20)
			return "It's reasonable weather for sports today.";
		else
			return "Please exercise with care today, watch out for the weather!";
	}
}

/*
 * Author's name and email: Michael
 * Program description: Polling program. Asks people how important certain issues
 *  are for them. Keeps data in a two dimensional array. Displays results.
 * Latest version: 5:25 PM, 9/5/2019.
 * Older versions: 
 */

import java.util.Scanner;

public class Polling
{
   public static void main(String[] args)
   {
		Scanner input = new Scanner(System.in);
		String[] topics = { "The Muslim Question", "The Jewish Question", 
			"The Marxist Question", "Build That Wall", "Defeat China"};
		int[][] surveyResponse = new int[5][10];
		int[] total = new int[5]; // Used to find highest total point for a topic and average
		int highestTotal = 0; // Used to keep which topic has the highest points.
		int lowestTotal = 2_000_000_000; // Used to keep which topic has the highest points.
		byte highestIndex = 0;
		byte lowestIndex = 0;
		
		int counter = 0;
		byte importance;
		
		// Take people's opinions.
		do
		{
			System.out.printf("How important is this issue for you? [1-10] (-1 to "
				+ "exit)%n%s: ", topics[counter % 5]);
			importance = input.nextByte();
			if (importance == -1)
				break;
			else
				surveyResponse[counter % 5][importance - 1]++;
			counter++;
		} while(true);
		
		// Display results
		System.out.printf("%n%-25s %3s %3s %3s %3s %3s %3s %3s %3s %3s %3s  Average%n", 
				"Topics", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
		for (int counter1 = 0; counter1 < topics.length; counter1++)
		{
			System.out.printf("%n%-25s ", topics[counter1]);
			for (int counter2 = 0; counter2 < surveyResponse[counter1].length; counter2++)
			{
				System.out.printf("%3s ", surveyResponse[counter1][counter2]);
				if (surveyResponse[counter1][counter2] != 0)
					total[counter1] = total[counter1] + (counter2 + 1) * surveyResponse[counter1][counter2];
			}
			System.out.printf("%8.2f", (float) total[counter1] / 10);
			if (total[counter1] > highestTotal)
			{
				highestTotal = total[counter1];
				highestIndex = (byte) counter1;
			}
			if (total[counter1] < lowestTotal)
			{
				lowestTotal = total[counter1];
				lowestIndex = (byte) counter1;
			}
		}
		System.out.printf("%n%nHighest rated topic is \"%s\" with %d points.%n", topics[highestIndex], total[highestIndex]);
		System.out.printf("Lowest rated topic is \"%s\" with %d points.%n", topics[lowestIndex], total[lowestIndex]);
   }
}
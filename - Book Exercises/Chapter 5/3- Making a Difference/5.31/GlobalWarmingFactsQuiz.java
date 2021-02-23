/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Global warming quiz.
 * Latest version: 1:50 AM, 6/10/2017. Changed comments and did some other minor 
 *  display changes.
 * Older versions: 1:11 PM, 9/11/2016
 */

import java.util.Scanner;

public class GlobalWarmingFactsQuiz
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int answer;
		int trueAnswers = 0;

		for (int counter1 = 1; counter1 <= 5; counter1++)
		{
			switch (counter1)
			{
				case 1:
					System.out.printf("Q1 %s%n%n%s%n%s%n%s%n%s%n%n", "Which of the following"
						+ " is a greenhouse gas that is released by human activities"
						+ " and speeds up global warming?", "1) petroleum", "2) natural gas",
						"3) carbon dioxide", "4) nuclear power");
					break;
				case 2:
					System.out.printf("Q2 %s%n%n%s%n%s%n%s%n%s%n%n", "Which of the following"
						+ " human activities does NOT release carbon dioxide into"
						+ " the atmosphere?", "1) burning fossil fuels", "2) deforestation",
						"3) fishing", "4) driving");
					break;
				case 3:
					System.out.printf("Q3 %s%n%n%s%n%s%n%s%n%s%n%n", "As global warming"
						+ " continues, the intensity of what type of storm that hits"
						+ " coastlines is predicted to increase?", ") tornadoes",
						"2) tsunamis", "3) hurricanes", "4) earthquakes");
					break;
				case 4:
					System.out.printf("Q4 %s%n%n%s%n%s%n%s%n%s%n%n", "Rising water temperatures"
						+ " is a result of global warming and may eventually increase"
						+ " sea levels due to the dissolving of what?", ") mountains",
						"2) wetlands", "3) glacers", "4) river beds");
					break;
				case 5:
					System.out.printf("Q5 %s%n%n%s%n%s%n%s%n%s%n%n", "Which of the following"
						+ " is NOT a negative effect of global warming?", ") species extinction",
						"2) new infectious diseases", "3) larger fish population", "4) loss of coastal areas");
					break;
			}

			System.out.print("Enter your answer(1-4): ");
			answer = input.nextInt();
			System.out.println("");

			if (answer == 3)
				++trueAnswers;
		}

		switch (trueAnswers)
		{
			case 5:
				System.out.println("Excellent");
				break;
			case 4:
				System.out.println("Very Good");
				break;
			default:
				System.out.printf("Time To brush up on your knowledge of global warming,%n http://www.factmonster.com/quizzes/global-warming/1.html%n");
		}
	}
}

/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: An application that uses repetition and switch statements 
 *  to print the song "The Twelwe Days of Christmas."
 * Latest version: 10:43 PM, 6/9/2017. Changed comments.
 * Older versions: 10:26 PM, 9/8/2016
 */

public class TheTwelveDaysOfChristmasSong
{
	public static void main(String[] args)
	{
		for (int counter1 = 1; counter1 <= 12; counter1++)
		{
			System.out.print("On the ");

			switch (counter1)
			{
				case 1:
					System.out.print("first ");
					break;
				case 2:
					System.out.print("second ");
					break;
				case 3:
					System.out.print("third ");
					break;
				case 4:
					System.out.print("fourth ");
					break;
				case 5:
					System.out.print("fifth ");
					break;
				case 6:
					System.out.print("sixth ");
					break;
				case 7:
					System.out.print("seventh ");
					break;
				case 8:
					System.out.print("eighth ");
					break;
				case 9:
					System.out.print("nineth ");
					break;
				case 10:
					System.out.print("tenth ");
					break;
				case 11:
					System.out.print("eleventh ");
					break;
				case 12:
					System.out.print("twelfth ");
					break;
			}

			System.out.printf("day of christmas%nMy mother sent to me,%n");

			switch (counter1)
			{
				case 12:
					System.out.printf("Twelve Drummers Drumming%n");
				case 11:
					System.out.printf("Eleven Pipers Piping%n");
				case 10:
					System.out.printf("Ten Lords a Leaping%n");
				case 9:
					System.out.printf("Nine Ladies Dancing%n");
				case 8:
					System.out.printf("Eight Maids a Milking%n");
				case 7:
					System.out.printf("Seven Swans a Swimming%n");
				case 6:
					System.out.printf("Six Geese a Laying%n");
				case 5:
					System.out.printf("Five Golden Rings%n");
				case 4:
					System.out.printf("Four Calling Birds%n");
				case 3:
					System.out.printf("Three French Hens%n");
				case 2:
					System.out.printf("Two Turtle Doves%n");
				case 1:
					if (counter1 != 1)
						System.out.printf("and a Partridge in a Pear Tree%n");
					else
						System.out.printf("A Partridge in a Pear Tree%n");
			}

			System.out.println();
		}
	}
}

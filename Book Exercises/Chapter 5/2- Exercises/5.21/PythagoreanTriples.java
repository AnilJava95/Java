/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Displays a table of the Pythagorean triples for side1, 
 *  side2 and the hypotenuse, all no longer than 500.
 * Latest version: 2:03 PM, 2/6/2019. Added a table header and alligned data with 
 *  header.
 * Older versions: 8:08 PM, 6/9/2017. Changed comments.
 *		3:59 AM, 9/7/2016
 */

public class PythagoreanTriples
{
	public static void main(String[] args)
	{
		System.out.printf("%7s%7s%7s%n%n", "Side1", "Side2", "Hypo.");

		for (int counter1 = 1; counter1 <= 500; counter1++)
			for (int counter2 = 1; counter2 <= 500; counter2++)
				for (int counter3 = 1; counter3 <= 500; counter3++)
					if (counter1 * counter1 + counter2 * counter2 == counter3 * counter3)
						System.out.printf("%7d%7d%7d%n", counter1, counter2, counter3);
	}
}

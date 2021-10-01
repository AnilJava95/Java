/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Shows integer values of some characters
 * Latest version: 8:01 AM, 4/18/2017. Changed comments and added new line 
 *  character display.
 * Older versions: 10:51 PM, 6/19/2016
 */

public class Integer_Values_of_a_Character
{
	public static void main(String[] args)
	{
		System.out.printf("%c %d%n%c %d%n", 'A', (int) 'A', 'B', (int) 'B');
		System.out.printf("%c %d%n%c %d%n", 'C', (int) 'C', 'a', (int) 'a');
		System.out.printf("%c %d%n%c %d%n", 'b', (int) 'b', 'c', (int) 'c');
		System.out.printf("%c %d%n%c %d%n", '0', (int) '0', '1', (int) '1');
		System.out.printf("%c %d%n%c %d%n", '2', (int) '2', '$', (int) '$');
		System.out.printf("%c %d%n%c %d%n", '*', (int) '*', '+', (int) '+');
		System.out.printf("%c %d%n%c %d%n", '/', (int) '/', ' ', (int) ' ');
		System.out.printf("%s %d%n", "\\n", (int) '\n');
	}
}

/*
 * Author's name and email: Michael
 * Program description: Tortoise and hare race to the finish line. 
 * Latest version: 6:28 PM, 9/4/2019.
 * Older versions: 
 */

import java.util.Random;
import java.util.Arrays;

public class TortoiseAndHare
{
   public static void main(String[] args)
   {
		Random random = new Random();
		
		String[] array = new String[71];
		Arrays.fill(array, " ");
		byte tortoisePosition = 1;
		byte harePosition = 1;
		
		// test variables
		/*
		int tortoiseWins = 0;
		int hareWins = 0;
		int ties = 0;
		*/
		
		System.out.printf("BANG !!!!!%nAND THEY'RE OFF !!!!!%n%n");
		
		while(true)
		{
			byte tortoiseMove = (byte) (random.nextInt(10) + 1);
			byte hareMove = (byte) (random.nextInt(10) + 1);
			
			switch(tortoiseMove)
			{
				case 1: case 2: case 3: case 4: case 5:
					tortoisePosition += 3;
					break;
				case 6: case 7:
					tortoisePosition -= 6;
					break;
				case 8: case 9: case 10:
					tortoisePosition += 1;
				break;
			}
			
			switch(hareMove)
			{
				case 1: case 2: // test what happens if these cases dont exist and case is 1 or 2. error?
					break;
				case 3: case 4: 
					harePosition += 9;
					break;
				case 5:
					harePosition -= 12;
					break;
				case 6: case 7: case 8:
					harePosition += 1;
					break;
				case 9: case 10:
					harePosition -= 2;
				break;
			}
			
			// Array index safety codes.
			if (tortoisePosition < 1)
				tortoisePosition = 1;
			else if (tortoisePosition > 70)
				tortoisePosition = 70;
			if (harePosition < 1)
				harePosition = 1;
			else if (harePosition > 70)
				harePosition = 70;
			
			// Marking new positions of tortoise and hare.
			if (tortoisePosition != harePosition)
			{
				array[tortoisePosition] = "T";
				array[harePosition] = "H";
			}
			else
			{
				array[tortoisePosition] = "OUCH!!!";
			}
			
			// Display race line.
			for (int counter = 1; counter <= 70; counter++)
			{
				System.out.print(array[counter]);
			}
			System.out.printf("%n%n");
			
			// Checking if any of them passed the finish line.
			if (tortoisePosition >= 70 && harePosition < 70)
			{
				System.out.println("TORTOISE WINS!!! YAY!!!");
				break;
				// Test code
				/*
				tortoiseWins++;
				array[tortoisePosition] = " ";
				array[harePosition] = " ";
				tortoisePosition = 1;
				harePosition = 1;
				System.out.println("*** tortoise wins: " + tortoiseWins + "%nhare wins:"
				+ hareWins + "%nties: " + ties + "***");
				*/
			}
			else if (harePosition >= 70 && tortoisePosition < 70)
			{
				System.out.println("Hare wins. Yuch.");
				break;
				// Test code
				/*
				hareWins++;
				array[tortoisePosition] = " ";
				array[harePosition] = " ";
				tortoisePosition = 1;
				harePosition = 1;
				System.out.println("*** tortoise wins: " + tortoiseWins + "%nhare wins:"
				+ hareWins + "%nties: " + ties + "***");
				*/
			}
			else if (harePosition >= 70 && tortoisePosition >= 70)
			{
				System.out.println("TORTOISE WINS!!! YAY!!!");
				break;
				// Test code
				/*
				ties++;
				array[tortoisePosition] = " ";
				array[harePosition] = " ";
				tortoisePosition = 1;
				harePosition = 1;
				System.out.println("*** tortoise wins: " + tortoiseWins + "%nhare wins:"
				+ hareWins + "%nties: " + ties + "***");
				*/
			}
			
			/* Putting empty space to positions of hare and tortoise so their old
			 positions dont display them being there. */
			array[tortoisePosition] = " ";
			array[harePosition] = " ";
		}
   }
}
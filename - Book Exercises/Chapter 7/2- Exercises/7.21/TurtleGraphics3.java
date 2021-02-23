/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Takes commands from user via command line arguments. 
 *  Draws what those commands would draw.
 * Latest version: 4:10 PM 3/20/2020. Updated display method to use enhanced for
 *  instead of for. Changed how implement direction. Now i use multiples (0, 
 *  0.5, 1, 1.5) of Math.PI.
 * Older versions: 6:36 PM, 9/4/2019. Changed turnLeft and turnRight methods.
 *  Also changed how i define direction(now with constant byte variables instead
 *  of enum). Also, myDirection is now a byte instead of Direction type enum.
 *		3:56 PM, 2/21/2019. Changed if else structure in turnLeft, turnRight and 
 *	 moveForward methods to switch structure.
 *		12:43 AM, 2/19/2019
 */

public class TurtleGraphics3
{
	static enum PenPosition { 	UP, DOWN };
	static int[][] floor = new int[20][20];
	static int[] commands = { 	2, 5, 12, 3, 5, 12, 3, 5, 12, 3, 5, 12, 1, 6, 9 };
	//static int[] commands = new int[50]; // This is used when we want to enter 
	// commands from main method argument
	static int positionX;
	static int positionY;
	static PenPosition penPosition = PenPosition.UP;
	static double myDirection = 0.0;

	public static void main(String[] args)
	{
		// Taking users commands from args and converting them to integers.
		/*for (int counter = 0; counter < args.length; counter++)
			commands[counter] = Integer.parseInt(args[counter]);
		*/

		//for (int counter = 0; counter < args.length; counter++)
		for (int counter = 0; counter < commands.length; counter++)
			switch (commands[counter])
			{
				case 1:
					penUp();
					break;
				case 2:
					penDown();
					break;
				case 3:
					turnRight();
					break;
				case 4:
					turnLeft();
					break;
				case 5:
					moveForward(commands[counter + 1]);
					counter++;
					break;
				case 6:
					display();
					break;
				case 9:
					System.out.println("End of commands. Exiting the program.");
					System.exit(0);
				default:
					System.out.println("Invalid command.");
			}
	}

	private static void penUp()
	{
		penPosition = PenPosition.UP;
	}

	private static void penDown()
	{
		penPosition = PenPosition.DOWN;
	}

	private static void turnRight()
	{
		myDirection = (myDirection + (1.5 * Math.PI)) % (2 * Math.PI);
		/*
		if (myDirection != 0)
			myDirection -= Math.PI / 2;
		else
			myDirection = 3 * Math.PI / 2;
		 */
	}

	private static void turnLeft()
	{
		myDirection = (myDirection + (2.5 * Math.PI)) % (2 * Math.PI);
		/*
		if (myDirection != 1.5 * Math.PI)
			myDirection += Math.PI / 2;
		else
			myDirection = 0;
		 */
	}

	private static void moveForward(int length)
	{
		int positionXTemp = positionX;
		int positionYTemp = positionY;

		for (int counter = 0; counter < length; counter++)
		{
			positionXTemp += Math.cos(myDirection);
			positionYTemp -= Math.sin(myDirection); /* We need to go to the row below
			when the direction is 270. The row below is the n+1 th row. That's why 
			we use -= for positionY. When we want to go down, we need to increase 
			rowNumber not decrease. */

			if (positionXTemp >= 0 && positionXTemp <= 19
				&& positionYTemp >= 0 && positionYTemp <= 19)
			{
				floor[positionY][positionX] = 1;
				positionX += Math.cos(myDirection);
				positionY -= Math.sin(myDirection);
			}
		}
	}

	private static void display()
	{
		for (int[] row : floor)
		{
			for (int column : row)
				System.out.printf("%d ", column);

			System.out.println();
		}
	}
}

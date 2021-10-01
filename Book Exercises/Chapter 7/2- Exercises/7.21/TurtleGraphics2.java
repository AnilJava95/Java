/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Takes commands from user via command line arguments. 
 *  Draws what those commands would draw.
 * Latest version: 4:10 PM 3/20/2020. Updated display method to use enhanced for
 *  instead of for.
 * Older versions: 6:36 PM, 9/4/2019. Changed turnLeft and turnRight methods.
 *  Also changed how i define direction(now with constant byte variables instead
 *  of enum). Also, myDirection is now a byte instead of Direction type enum.
 *		3:56 PM, 2/21/2019. Changed if else structure in turnLeft, turnRight and 
 *	 moveForward methods to switch structure.
 *		12:43 AM, 2/19/2019
 */

public class TurtleGraphics2
{
	static enum PenPosition { 	UP, DOWN };
	static final byte UP = 0;
	static final byte RIGHT = 64;
	static final byte DOWN = -128;
	static final byte LEFT = -64;
	static int[][] floor = new int[20][20];
	static int[] commands = { 	2, 5, 12, 3, 5, 12, 3, 5, 12, 3, 5, 12, 1, 6, 9 };
	//static int[] commands = new int[50]; // This is used when we want to enter 
	// commands from main method argument
	static int positionX;
	static int positionY;
	static PenPosition penPosition = PenPosition.UP;
	static byte myDirection = 64;

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
		myDirection += 64;
	}

	private static void turnLeft()
	{
		myDirection -= 64;
	}

	private static void moveForward(int length)
	{
		switch (myDirection)
		{
			case UP:
				for (int counter = 0; counter < length; counter++)
					if (positionY == 0)
						break;
					else
					{
						floor[positionY][positionX] = 1;
						positionY -= 1;
					}
				break;
			case RIGHT:
				for (int counter = 0; counter < length; counter++)
					if (positionX == 19)
						break;
					else
					{
						floor[positionY][positionX] = 1;
						positionX += 1;
					}
				break;
			case DOWN:
				for (int counter = 0; counter < length; counter++)
					if (positionY == 19)
						break;
					else
					{
						floor[positionY][positionX] = 1;
						positionY += 1;
					}
				break;
			case LEFT:
				for (int counter = 0; counter < length; counter++)
					if (positionX == 0)
						break;
					else
					{
						floor[positionY][positionX] = 1;
						positionX -= 1;
					}
				break;
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

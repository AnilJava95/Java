/*
 * Author's name and email: Michael
 * Program description: Takes commands from user via command line arguments. 
 *  Draws what those commands would draw.
 * Latest version: 1:40 PM, 9/4/2019. Changed turnLeft and turnRight methods.
 *  Also changed how i define direction(now with constant byte variables instead
 *  of enum). Also, myDirection is not a byte instead of Direction type enum.
 * Older versions: 15:56 21/02/2019. Changed if else structure in turnLeft, turnRight 
 *  and moveForward methods to switch structure.
 *		00:43 19/02/2019.
 */

public class TurtleGraphics
{
	static enum PenPosition { UP, DOWN };
	//static enum Direction { UP, RIGHT, DOWN, LEFT };
	static final byte UP = 0;
	static final byte RIGHT = 64;
	static final byte DOWN = -128;
	static final byte LEFT = -64;
	
	static int[][] floor = new int[20][20];
	static int[] commands = { 2, 5, 12, 3, 5, 12, 3, 5, 12, 3, 5, 12, 1, 6, 9 };
	//static int[] commands = new int[50]; // This is used when we want to enter 
	 // commands from main method argument
	static int positionX;
	static int positionY;
	static PenPosition penPosition = PenPosition.UP;
	//static Direction myDirection = Direction.RIGHT;
	static byte myDirection = 64;
	
   public static void main(String[] args)
   {
		// Taking users commands from args and converting them to integers.
		for (int counter = 0; counter < args.length; counter++)
		{
			commands[counter] = Integer.parseInt(args[counter]);
		}
		
		//for (int counter = 0; counter < args.length; counter++)
		for (int counter = 0; counter < commands.length; counter++)
		{
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
			/*if (commands[counter] == 5)
			{
				counter++; // Skipping the command after 5 because 5 tells us to move 
				// forward and the number after 5 tells us how much to move.
			}*/
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
	
	/*private static void turnRight()
	{
		switch (myDirection)
		{
			case UP:
				myDirection = Direction.RIGHT;
				break;
			case RIGHT:
				myDirection = Direction.DOWN;
				break;
			case DOWN:
				myDirection = Direction.LEFT;
				break;
			case LEFT:
				myDirection = Direction.UP;
				break;
		}
	}*/
	
	private static void turnRight()
	{
		myDirection += 64;
	}
	
	/*private static void turnLeft()
	{
		switch (myDirection)
		{
			case UP:
				myDirection = Direction.LEFT;
				break;
			case RIGHT:
				myDirection = Direction.UP;
				break;
			case DOWN:
				myDirection = Direction.RIGHT;
				break;
			case LEFT:
				myDirection = Direction.DOWN;
				break;
		}
	}*/
	
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
				{
					if (positionY == 0)
					{
						break;
					}
					else
					{
						floor[positionY][positionX] = 1;
						positionY -= 1;
					}
				}
				break;
			case RIGHT:
				for (int counter = 0; counter < length; counter++)
				{
					if (positionX == 19)
					{
						break;
					}
					else
					{
						floor[positionY][positionX] = 1;
						positionX += 1;
					}
				}
				break;
			case DOWN:
				for (int counter = 0; counter < length; counter++)
				{
					if (positionY == 19)
					{
						break;
					}
					else
					{
						floor[positionY][positionX] = 1;
						positionY += 1;
					}
				}
				break;
			case LEFT:
				for (int counter = 0; counter < length; counter++)
				{
					if (positionX == 0)
					{
						break;
					}
					else
					{
						floor[positionY][positionX] = 1;
						positionX -= 1;
					}
				}
				break;
		}
	}
	
	private static void display()
	{
		for (int row = 0; row < floor.length; row++)
		{
			for (int column = 0; column < floor[row].length; column++)
			{
				System.out.printf("%d ", floor[row][column]);
			}
			
			System.out.println();
		}
	}
}
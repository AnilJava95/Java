/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Contains the class and main method to play tic tac toe.
 *  checkGameStatus method determines whether the game is over or not by looking 
 *  at rows, columns and diagonals one by one.
 * Latest version: 3:59 PM, 9/10/2019
 * Older versions: 
 */

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeA
{
	private enum Value {	O, X, EMPTY };

	private final byte PLAYER1WIN = 1;
	private final byte PLAYER2WIN = 2;
	private final byte DRAW = 3;
	private final byte CONTINUE = 4;

	private Value[][] table = new Value[3][3];

	public TicTacToeA()
	{
		for (byte counter = 0; counter < table.length; counter++)
			Arrays.fill(table[counter], Value.EMPTY);
	}

	public static void main(String[] args)
	{
		TicTacToeA tic = new TicTacToeA();
		Scanner input = new Scanner(System.in);
		byte row;
		byte column;
		byte playerTurn = 0;
		byte gameResult;

		while (true)
		{
			System.out.printf("Player %s choose a row and a column: ",
				(playerTurn % 2) == 0 ? "1" : "2");
			row = input.nextByte();
			column = input.nextByte();

			if (tic.table[row][column] != Value.EMPTY)
			{
				System.out.println("Cell is already used.");
				continue;
			}

			tic.table[row][column] = (playerTurn % 2) == 0 ? Value.O : Value.X;
			playerTurn++;

			gameResult = tic.checkGameStatus();
			switch (gameResult)
			{
				case 1:
					System.out.println("Player1 won.");
					break;
				case 2:
					System.out.println("Player2 won.");
					break;
				case 3:
					System.out.println("It's a tie.");
					break;
				case 4:
					System.out.println("Game continues.");
					break;
			}
		}
	}

	private byte checkGameStatus()
	{
		boolean draw = true;
		boolean player1Win = true;
		boolean player2Win = true;

		// Checking rows
		for (byte row = 0; row <= 2; row++)
		{
			for (byte column = 0; column <= 2; column++)
			{
				if (table[row][column] == Value.EMPTY)
				{
					draw = false;
					player1Win = false;
					player2Win = false;
					break;
				}
				else if (table[row][column] == Value.O)
					player2Win = false;
				else if (table[row][column] == Value.X)
					player1Win = false;
			}
			
			if (player1Win)
				return PLAYER1WIN;
			else if (player2Win)
				return PLAYER2WIN;

			// Resetting variables
			player1Win = true;
			player2Win = true;
		}
		
		if (draw == true)
			return DRAW;

		// Checking columns
		for (byte column = 0; column <= 2; column++)
		{
			for (byte row = 0; row <= 2; row++)
			{
				if (table[row][column] == Value.EMPTY)
				{
					player1Win = false;
					player2Win = false;
					break;
				}
				else if (table[row][column] == Value.O)
					player2Win = false;
				else if (table[row][column] == Value.X)
					player1Win = false;
			}
			
			if (player1Win)
				return PLAYER1WIN;
			else if (player2Win)
				return PLAYER2WIN;

			// Resetting variables
			player1Win = true;
			player2Win = true;
		}

		// Checking first diagonal
		for (byte counter = 0; counter <= 2; counter++)
		{
			if (table[counter][counter] == Value.EMPTY)
			{
				player1Win = false;
				player2Win = false;
				break;
			}
			else if (table[counter][counter] == Value.O)
				player2Win = false;
			else if (table[counter][counter] == Value.X)
				player1Win = false;
		}
		
		if (player1Win)
			return PLAYER1WIN;
		else if (player2Win)
			return PLAYER2WIN;

		// Resetting variables
		player1Win = true;
		player2Win = true;

		// Checking second diagonal
		for (byte column = 0, row = 2; column <= 2 && row >= 0; column++, row--)
		{
			if (table[row][column] == Value.EMPTY)
			{
				player1Win = false;
				player2Win = false;
				break;
			}
			else if (table[row][column] == Value.O)
				player2Win = false;
			else if (table[row][column] == Value.X)
				player1Win = false;
		}
		
		if (player1Win)
			return PLAYER1WIN;
		else if (player2Win)
			return PLAYER2WIN;
		else
			return CONTINUE;
	}
}

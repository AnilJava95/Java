/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Adding two integers with GUI.
 * Latest version: 4:03 PM, 4/28/2017. Comments changed.
 * Older versions: 6:32 PM, 7/5/2016
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Addition
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int number1;
		int number2;
		int sum;

		String string1 = JOptionPane.showInputDialog("Enter first integer: ");
		String string2 = JOptionPane.showInputDialog("Enter second integer: ");

		number1 = Integer.parseInt(string1);
		number2 = Integer.parseInt(string2);
		sum = number1 + number2;

		String message = String.format("Sum is %d%n", sum);
		JOptionPane.showMessageDialog(null, message);
	}
}

/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Adding two integers with Gui.
 * Latest version: 16:03 28/04/2017. Comments changed.
 * Older versions: 18:32 05/07/2016
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
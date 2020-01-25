/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Prints a static table.
 * Latest version: 13:28 29/1/2019. Changed "   %d   %d" to " to "%6d%10d".
 * Older versions: 08:21 18/04/2017. Changed comments.
 *		02:47 20/06/2016
 */

public class Table_of_Squares_and_cubes
{
   public static void main(String[] args)
   {
      // printing static table
      System.out.println("number    square    cube");
      System.out.printf("%6d%10d%8d%n", 0, 0 * 0, 0 * 0 * 0);
      System.out.printf("%6d%10d%8d%n", 1, 1 * 1, 1 * 1 * 1);
      System.out.printf("%6d%10d%8d%n", 2, 2 * 2, 2 * 2 * 2);
      System.out.printf("%6d%10d%8d%n", 3, 3 * 3, 3 * 3 * 3);
      System.out.printf("%6d%10d%8d%n", 4, 4 * 4, 4 * 4 * 4);
      System.out.printf("%6d%10d%8d%n", 5, 5 * 5, 5 * 5 * 5);
      System.out.printf("%6d%10d%8d%n", 6, 6 * 6, 6 * 6 * 6);
      System.out.printf("%6d%10d%8d%n", 7, 7 * 7, 7 * 7 * 7);
      System.out.printf("%6d%10d%8d%n", 8, 8 * 8, 8 * 8 * 8);
      System.out.printf("%6d%10d%8d%n", 9, 9 * 9, 9 * 9 * 9);
      System.out.printf("%6d%10d%8d%n", 10, 10 * 10, 10 * 10 * 10);
   }
}
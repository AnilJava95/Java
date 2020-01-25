/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Shows integer values of some characters
 * Latest version: 08:01 18/04/2017. Changed comments and added new line 
 *  character display.
 * Older versions: 22:51 19/06/2016
 */

public class Integer_Values_of_a_Character
{
   public static void main(String[] args)
   {
      System.out.printf("%c %d%n%c %d%n",'A', (int)'A', 'B', (int)'B');
      System.out.printf("%c %d%n%c %d%n",'C', (int)'C', 'a', (int)'a');
      System.out.printf("%c %d%n%c %d%n",'b', (int)'b', 'c', (int)'c');
      System.out.printf("%c %d%n%c %d%n",'0', (int)'0', '1', (int)'1');
      System.out.printf("%c %d%n%c %d%n",'2', (int)'2', '$', (int)'$');
      System.out.printf("%c %d%n%c %d%n",'*', (int)'*', '+', (int)'+');
      System.out.printf("%c %d%n%c %d%n",'/', (int)'/', ' ', (int)' ');
      System.out.printf("%s %d%n","\\n", (int)'\n');
   }
}
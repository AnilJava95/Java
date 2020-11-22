/*
 * Author's name and email: Michael
 * Program description: Tests the class SomeClass. Creates objects and catches
 *  the exception and prints it.
 * Latest version: 4:12 PM, 9/13/2019
 * Older versions: 
 */

public class SomeClassTest
{
   public static void main(String[] args)
   {
		try
		{
			SomeClass someClass1 = new SomeClass(1);
			SomeClass someClass2 = new SomeClass(-1);
		}
		catch (Exception e)
		{
			System.err.println(e);
		}
   }
}
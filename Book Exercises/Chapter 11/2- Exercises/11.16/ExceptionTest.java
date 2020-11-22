/*
 * Author's name and email: Michael
 * Program description: Demonstration that, catch block for type ExceptionA 
 *  catches exceptions of types ExceptionB and ExceptionC.
 * Latest version: 3:10 PM, 9/13/2019
 * Older versions: 
 */

public class ExceptionTest
{
	public static void main(String[] args)
	{
		for (byte counter = 1; counter <= 2; counter++)
		{
			try
			{
				switch (counter)
				{
					case 1:
						throw new ExceptionC();
					case 2:
						throw new ExceptionB();
				}
			}
			catch (ExceptionA a)
			{
				System.out.printf("%s%n%s%n%n", "Inside ExceptionA catch block", 
					a.getClass().getName());
			}
		}
	}
}

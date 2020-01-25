/*
 * Author's name and email: Michael
 * Program description: Demonstration that, catch block for type Exception 
 *  catches exceptions of types ExceptionA, ExceptionB, NullPointerException 
 *  and IOException.
 * Latest version: 3:30 PM, 9/13/2019.
 * Older versions: 
 */

import java.io.IOException;

public class ExceptionTest
{
	public static void main(String[] args)
	{
		for (byte counter = 1; counter <= 4; counter++)
		{
			try
			{
				switch (counter)
				{
					case 1:
						throw new ExceptionA();
					case 2:
						throw new ExceptionB();
					case 3:
						throw new NullPointerException();
					case 4:
						throw new IOException();
				}
			}
			catch (Exception e)
			{
				System.out.printf("%s%n%s%n%n", "Inside Exception catch block", 
					e.getClass().getName());
			}
		}
	}
}

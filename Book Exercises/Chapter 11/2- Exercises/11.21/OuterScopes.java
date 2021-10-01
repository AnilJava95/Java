/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: We purposely cause an exception  at divide method and 
 *  catch it at main method. We are displaying stack unwinding feature.
 * Latest version: 4:48 PM, 9/13/2019
 * Older versions: 
 */

public class OuterScopes
{
	public static void main(String[] args) throws InterruptedException
	{
		byte numerator = 5;
		byte denominator = 0;
		byte quotient = 0;

		try
		{
			quotient = divide(numerator, denominator);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		Thread.sleep(10);
		System.out.println("Quotient is: " + quotient);
	}

	public static byte divide(byte numerator, byte denominator)
	{
		byte quotient;

		quotient = (byte) (numerator / denominator);

		return quotient;
	}
}

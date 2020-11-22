/*
 * Author's name and email: Michael
 * Program description: We purposely cause an exception and catch it at 
 *  computeAverage method. Then we rethrow it and catch it again at main method.
 * Latest version: 4:35 PM, 9/13/2019
 * Older versions: 
 */

public class RethrowingExceptions
{
   public static void main(String[] args) throws InterruptedException
   {
		int[] array = { 132, 6574, 123, 1, 0 };
		double average = 0;
		
		try
		{
			average = computeAverage(array);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		//Thread.sleep(0, 1);
		System.out.println("Average of array is: " + average);
   }
	
	public static double computeAverage(int[] array)
	{
		double average = 0;
		
		try
		{
			for (byte counter = 0; counter <= 5; counter++) // Purposeful exception
				average += array[counter];
			average /= array.length;
		}
		catch (Exception e)
		{
			System.out.println("In catch block of computeAverage");
			throw e;
		}
		
		return average;
	}
}
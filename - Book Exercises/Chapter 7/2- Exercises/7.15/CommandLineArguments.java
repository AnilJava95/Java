/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Takes the main method arguments and finds minimum, 
 *  maximum, average of minimum and maximum. And then prints them all.
 * Latest version: 12:21 PM, 2/11/2019. 0 was initial value for min and max. I made 
 *  args[0] the initial value for min and max. Also changed calculateMinimum and 
 *  calculateMaximum methods to use normal for loop so we dont waste time comparing 
 *  args[0] with args[0].
 * Older versions: 11:05 PM, 7/16/2017
 */

public class CommandLineArguments
{
	public static void main(String[] args)
	{
		int minimum = calculateMinimum(args);
		int maximum = calculateMaximum(args);
		double average = calculateAverage(minimum, maximum);

		System.out.printf("Min: %d%nMax: %d%nAverage: %.2f%n", minimum, maximum,
			average);
	}

	public static int calculateMinimum(String[] args)
	{
		int minimum = Integer.parseInt(args[0]);
		int currentArgs;

		for (int counter = 1; counter < args.length; counter++)
		{
			currentArgs = Integer.parseInt(args[counter]);
			if (currentArgs < minimum)
				minimum = currentArgs;
		}

		return minimum;
	}

	public static int calculateMaximum(String[] args)
	{
		int maximum = Integer.parseInt(args[0]);
		int currentArgs;

		for (int counter = 1; counter < args.length; counter++)
		{
			currentArgs = Integer.parseInt(args[counter]);
			if (currentArgs > maximum)
				maximum = currentArgs;
		}

		return maximum;
	}

	public static double calculateAverage(int minimum, int maximum)
	{
		double average = (minimum + maximum) / 2.0;

		return average;
	}
}

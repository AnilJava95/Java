/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: If constructor parameters are not valid, constructor 
 *  throws an exception with the information about construction failure.
 * Latest version: 4:12 PM, 9/13/2019
 * Older versions: 
 */

public class SomeClass
{
	private int instanceVariable;

	public SomeClass(int instanceVariable) throws Exception
	{
		if (instanceVariable < 0)
			throw new Exception("instanceVariable can't be negative");

		this.instanceVariable = instanceVariable;
	}
}

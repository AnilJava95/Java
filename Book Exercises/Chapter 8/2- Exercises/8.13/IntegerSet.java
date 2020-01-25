/*
 * Author's name and email: Michael
 * Program description: Keeps a set of integers as a boolean array. Has methods 
 *  that lets you find union, intersect of two sets. Has a method to see if 
 *  two sets are equal. Has methods to add or remove elements from sets. And 
 *  has a method to display a set.
 * Latest version: 4:23 PM, 9/6/2019.
 * Older versions: 
 */

import java.util.Arrays;

public class IntegerSet
{
	boolean[] integerSet = new boolean[101];
	
	public IntegerSet()
	{
		Arrays.fill(integerSet, false);
	}
	
	public IntegerSet union(IntegerSet set2)
	{
		IntegerSet set3 = new IntegerSet();
		
		for (byte counter = 0; counter <= 100; counter++)
		{
			if (integerSet[counter] || set2.integerSet[counter])
				set3.integerSet[counter] = true;
		}
		return set3;
	}
	
	public IntegerSet intersection(IntegerSet set2)
	{
		IntegerSet set3 = new IntegerSet();
		
		for (byte counter = 0; counter <= 100; counter++)
		{
			if (integerSet[counter] && set2.integerSet[counter])
				set3.integerSet[counter] = true;
		}
		return set3;
	}
	
	public void insertElement(int element)
	{
		integerSet[element] = true;
	}
	
	public void deleteElement(int element)
	{
		integerSet[element] = false;
	}
	
	public String toString()
	{
		String setString = "";
		
		for (byte counter = 0; counter <= 100; counter++)
			if (integerSet[counter] == true)
				setString += counter + " ";
			else
				setString += "--- ";
		return setString;
	}
	
	public boolean isEqualTo(IntegerSet set2)
	{
		for (byte counter = 0; counter <= 100; counter++)
			if (integerSet[counter] != set2.integerSet[counter])
				return false;
		return true;
	}
}
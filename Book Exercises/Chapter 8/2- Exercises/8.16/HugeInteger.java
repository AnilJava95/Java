/*
 * Author's name and email: Michael
 * Program description: We have a 40 by 40 int array. Every row is a number that 
 *  consists of 40 digits. Every row is one of the digits of the number. 39th 
 *  index is the smallest digit and 0th index is the biggest digit. Parse 
 *  method sets a value to one of 40 numbers(rows). toString method represents 
 *  one of the numbers as a string. We have other methods that are used in 
 *  arithmetic and logic operations such as add, subtract, isEqualTo, 
 *  isNotEqualTo, isGreaterThan, isLessThan, isGreaterThanOrEqual, 
 *  isLessThenOrEqual, isZero, multiply, divide and remainder.
 * Latest version: 3:43 PM, 9/9/2019.
 * Older versions: 
 */

import java.util.Arrays;

public class HugeInteger
{
   int[][] hugeInteger1 = new int[40][40];
	
	void parse(String string1, int index)
	{
		Arrays.fill(hugeInteger1[index], 0); // Reset the number so old digits 
		 // dont stay in the number when they are not overwritten.
		for (byte counter = 39, counter2 = 1; counter > 39 - string1.length(); 
			counter--, counter2++)
		{
			hugeInteger1[index][counter] =  Character.getNumericValue(
				string1.charAt(string1.length() - counter2));
		}
	}
	
	String toString(int index)
	{
		String number = "";
		
		for (byte counter = 0; counter <= 39; counter++)
		{
			number += hugeInteger1[index][counter];
		}
		return number;
	}
   
	void add(int index1, int index2)
	{
		float number1 = Float.parseFloat(toString(index1));
		float number2 = Float.parseFloat(toString(index2));
		float number3 = number1 + number2;
		String result = String.valueOf(number3);
		parse(result.substring(0, result.length() - 2), index1);
	}
	
	void subtract(int index1, int index2)
	{
		float number1 = Float.parseFloat(toString(index1));
		float number2 = Float.parseFloat(toString(index2));
		float number3 = number1 - number2;
		String result = String.valueOf(number3);
		parse(result.substring(0, result.length() - 2), index1);
	}
	
	boolean isEqualTo(int index1, int index2)
	{
		float number1 = Float.parseFloat(toString(index1));
		float number2 = Float.parseFloat(toString(index2));
		if (number1 == number2)
			return true;
		else
			return false;
	}
	
	boolean isNotEqualTo(int index1, int index2)
	{
		float number1 = Float.parseFloat(toString(index1));
		float number2 = Float.parseFloat(toString(index2));
		if (number1 != number2)
			return true;
		else
			return false;
	}
	
	boolean isGreaterThan(int index1, int index2)
	{
		float number1 = Float.parseFloat(toString(index1));
		float number2 = Float.parseFloat(toString(index2));
		if (number1 > number2)
			return true;
		else
			return false;
	}
	
	boolean isLessThan(int index1, int index2)
	{
		float number1 = Float.parseFloat(toString(index1));
		float number2 = Float.parseFloat(toString(index2));
		if (number1 < number2)
			return true;
		else
			return false;
	}
	
	boolean isGreaterThanOrEqualTo(int index1, int index2)
	{
		float number1 = Float.parseFloat(toString(index1));
		float number2 = Float.parseFloat(toString(index2));
		if (number1 >= number2)
			return true;
		else
			return false;
	}
	
	boolean isLessThanOrEqualTo(int index1, int index2)
	{
		float number1 = Float.parseFloat(toString(index1));
		float number2 = Float.parseFloat(toString(index2));
		if (number1 <= number2)
			return true;
		else
			return false;
	}
	
	boolean isZero(int index)
	{
		for (byte counter = 0; counter <= 39; counter++)
			if (hugeInteger1[index][counter] != 0)
				return false;
		return true;
	}
   
	void multiply(int index1, int index2)
	{
		float number1 = Float.parseFloat(toString(index1));
		float number2 = Float.parseFloat(toString(index2));
		float number3 = number1 * number2;
		String result = String.valueOf(number3);
		parse(result.substring(0, result.length() - 2), index1);
	}
	
	void divide(int index1, int index2)
	{
		float number1 = Float.parseFloat(toString(index1));
		float number2 = Float.parseFloat(toString(index2));
		float number3 = number1 / number2;
		String result = String.valueOf(number3);
		parse(result.substring(0, result.length() - 7), index1);
	}
	
	void remainder(int index1, int index2)
	{
		float number1 = Float.parseFloat(toString(index1));
		float number2 = Float.parseFloat(toString(index2));
		float number3 = number1 % number2;
		String result = String.valueOf(number3);
		parse(result.substring(0, result.length() - 2), index1);
	}
	
	
}

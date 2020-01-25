/*
 * Author's name and email: Michael
 * Program description: Represents rational numbers and has the methods needed
 *  for rational number arithmetic. reducedForm divides the numerator and 
 *  denominator by their gcd as long as gcd exists. We have methods that find 
 *  the gcd, add, subtract, multiply, divide and get string representation
 *  (toString). toStringFloatingPoint gets the floating point representation
 *  of the rational number and has dynamic precision rounding.
 * Latest version: 2:17 PM, 9/7/2019.
 * Older versions: 
 */

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RationalNumbers
{
   private int numerator;
	private int denominator;
   
	public RationalNumbers(int numerator, int denominator)
	{
		reducedForm(numerator, denominator);
	}
	
	public RationalNumbers()
	{
		numerator = 1;
		denominator = 2;
	}
	
	public void reducedForm(int numerator, int denominator)
	{
		int gcd;
		
		while (denominator % numerator == 0)
		{
			gcd = greatestCommonDivisor(denominator, numerator);
			if (gcd == 1)
				break;
			numerator /= gcd;
			denominator /= gcd;
		}
		
		while (numerator % denominator == 0)
		{
			gcd = greatestCommonDivisor(numerator, denominator);
			if (gcd == 1)
				break;
			numerator /= gcd;
			denominator /= gcd;
		}
		
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public static int greatestCommonDivisor(int number1, int number2)
   {
		if (number2 == 0)
         return number1;
      else
         return greatestCommonDivisor(number2, number1 % number2);
   }
	
	public static void add(RationalNumbers rationalNumber1, RationalNumbers 
		rationalNumber2)
	{
		if(rationalNumber1.denominator != rationalNumber2.denominator)
		{
			int temp = rationalNumber1.denominator;
			rationalNumber1.numerator *= rationalNumber2.denominator;
			rationalNumber1.denominator *= rationalNumber2.denominator;
			rationalNumber2.numerator *= temp;
			rationalNumber2.denominator *= temp;
		}
		
		rationalNumber1.numerator += rationalNumber2.numerator;
		
		rationalNumber1.reducedForm(rationalNumber1.numerator, rationalNumber1.
			denominator);
	}
	
	public static void subtract(RationalNumbers rationalNumber1, RationalNumbers 
		rationalNumber2)
	{
		if(rationalNumber1.denominator != rationalNumber2.denominator)
		{
			int temp = rationalNumber1.denominator;
			rationalNumber1.numerator *= rationalNumber2.denominator;
			rationalNumber1.denominator *= rationalNumber2.denominator;
			rationalNumber2.numerator *= temp;
			rationalNumber2.denominator *= temp;
		}
		
		rationalNumber1.numerator -= rationalNumber2.numerator;
		
		rationalNumber1.reducedForm(rationalNumber1.numerator, rationalNumber1.
			denominator);
	}
	
	public static void multiply(RationalNumbers rationalNumber1, RationalNumbers 
		rationalNumber2)
	{
		rationalNumber1.numerator *= rationalNumber2.numerator;
		rationalNumber1.denominator *= rationalNumber2.denominator;
		
		rationalNumber1.reducedForm(rationalNumber1.numerator, rationalNumber1.
			denominator);
	}
	
	public static void divide(RationalNumbers rationalNumber1, RationalNumbers 
		rationalNumber2)
	{
		rationalNumber1.numerator *= rationalNumber2.denominator;
		rationalNumber1.denominator *= rationalNumber2.numerator;
		
		rationalNumber1.reducedForm(rationalNumber1.numerator, rationalNumber1.
			denominator);
	}
	
	public String toString()
	{
		return String.format("%d/%d", numerator, denominator);
	}
	
	public String toStringFloatingPoint(int precision)
	{
		double floatingPointNumber = (double) numerator / denominator;
		
		BigDecimal bd = new BigDecimal(floatingPointNumber).setScale(precision, 
			RoundingMode.HALF_EVEN);
		
		System.out.println(floatingPointNumber);
		System.out.println((float) floatingPointNumber);
		System.out.println(bd);
		
		return bd.toString();
	}
}
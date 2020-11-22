/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: A class that represents complex numbers and presents
 *  methods needed for complex number arithmetics (add, subtract, print).
 * Latest version: 2:32 PM, 9/6/2019
 * Older versions: 
 */

public class ComplexNumbers
{
	private int realPart;
	private int imaginaryPart;

	public ComplexNumbers(int realPart, int imaginaryPart)
	{
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}

	public static void add(ComplexNumbers complexNumber1,
		ComplexNumbers complexNumber2)
	{
		complexNumber1.realPart += complexNumber2.realPart;
		complexNumber1.imaginaryPart += complexNumber2.imaginaryPart;
	}

	public static void subtract(ComplexNumbers complexNumber1, ComplexNumbers complexNumber2)
	{
		complexNumber1.realPart -= complexNumber2.realPart;
		complexNumber1.imaginaryPart -= complexNumber2.imaginaryPart;
	}

	public static void print(ComplexNumbers complexNumber)
	{
		System.out.printf("Complex number: (%2d, %2d)%n", complexNumber.realPart,
			complexNumber.imaginaryPart);
	}
}

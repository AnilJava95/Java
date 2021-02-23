/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Tests class HugeInteger.
 * Latest version: 3:43 PM, 9/9/2019
 * Older versions: 
 */

public class HugeIntegerTest
{
	public static void main(String[] args)
	{
		HugeInteger hInteger = new HugeInteger();

		hInteger.parse("12040", 0);
		hInteger.parse("23456", 1);
		System.out.println(hInteger.toString(0));
		System.out.println(hInteger.toString(1));
		System.out.println("");

		hInteger.add(0, 1);
		System.out.println(hInteger.toString(0));
		System.out.println(hInteger.toString(1));
		System.out.println("");

		hInteger.subtract(0, 1);
		System.out.println(hInteger.toString(0));
		System.out.println(hInteger.toString(1));
		System.out.println("");

		System.out.println(hInteger.toString(0));
		System.out.println(hInteger.toString(1));
		System.out.println("Is equal? " + hInteger.isEqualTo(0, 1));
		hInteger.parse("12040", 1);
		System.out.println(hInteger.toString(0));
		System.out.println(hInteger.toString(1));
		System.out.println("Is equal? " + hInteger.isEqualTo(0, 1));
		System.out.println("");

		System.out.println(hInteger.toString(0));
		System.out.println(hInteger.toString(1));
		System.out.println("Is not equal? " + hInteger.isNotEqualTo(0, 1));
		hInteger.parse("23456", 1);
		System.out.println(hInteger.toString(0));
		System.out.println(hInteger.toString(1));
		System.out.println("Is not equal? " + hInteger.isNotEqualTo(0, 1));
		System.out.println("");

		System.out.println(hInteger.toString(0));
		System.out.println(hInteger.toString(1));
		System.out.println("Is greater than? " + hInteger.isGreaterThan(0, 1));
		System.out.println("");

		System.out.println(hInteger.toString(0));
		System.out.println(hInteger.toString(1));
		System.out.println("Is less than? " + hInteger.isLessThan(0, 1));
		System.out.println("");

		System.out.println(hInteger.toString(0));
		System.out.println(hInteger.toString(1));
		System.out.println("Is greater than or equal to? "
			+ hInteger.isGreaterThanOrEqualTo(0, 1));
		System.out.println("");

		System.out.println(hInteger.toString(0));
		System.out.println(hInteger.toString(1));
		System.out.println("Is less than or equal to? "
			+ hInteger.isLessThanOrEqualTo(0, 1));
		System.out.println("");

		System.out.println(hInteger.toString(0));
		System.out.println("Is zero? " + hInteger.isZero(0));
		hInteger.parse("00000", 0);
		System.out.println(hInteger.toString(0));
		System.out.println("Is zero? " + hInteger.isZero(0));
		System.out.println("");

		hInteger.parse("50", 0);
		hInteger.parse("3", 1);
		System.out.println(hInteger.toString(0));
		System.out.println(hInteger.toString(1));
		hInteger.multiply(0, 1);
		System.out.println(hInteger.toString(0));
		System.out.println(hInteger.toString(1));
		System.out.println("");

		hInteger.parse("50", 0);
		hInteger.parse("3", 1);
		System.out.println(hInteger.toString(0));
		System.out.println(hInteger.toString(1));
		hInteger.divide(0, 1);
		System.out.println(hInteger.toString(0));
		System.out.println(hInteger.toString(1));
		System.out.println("");

		hInteger.parse("50", 0);
		hInteger.parse("3", 1);
		System.out.println(hInteger.toString(0));
		System.out.println(hInteger.toString(1));
		hInteger.remainder(0, 1);
		System.out.println(hInteger.toString(0));
		System.out.println(hInteger.toString(1));
		System.out.println("");
	}
}

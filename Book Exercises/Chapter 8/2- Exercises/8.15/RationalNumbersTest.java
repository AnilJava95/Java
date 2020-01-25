/*
 * Author's name and email: Michael
 * Program description: Tests RationalNumbers class.
 * Latest version: 2:17 PM, 9/7/2019.
 * Older versions: 
 */

public class RationalNumbersTest
{
   public static void main(String[] args)
   {
		RationalNumbers rationalNumber1 = new RationalNumbers(2, 4);
		RationalNumbers rationalNumber2 = new RationalNumbers(4, 2);
		RationalNumbers rationalNumber3 = new RationalNumbers(3, 2);
		RationalNumbers rationalNumber4 = new RationalNumbers(2, 3);
		RationalNumbers rationalNumber5 = new RationalNumbers(5, 2);
		RationalNumbers rationalNumber6 = new RationalNumbers(2, 5);
		RationalNumbers rationalNumber7 = new RationalNumbers(6, 2);
		RationalNumbers rationalNumber8 = new RationalNumbers(2, 6);
		RationalNumbers rationalNumber9 = new RationalNumbers(8, 2);
		RationalNumbers rationalNumber10 = new RationalNumbers(1, 33);
		
		RationalNumbers.add(rationalNumber7, rationalNumber8);
		RationalNumbers.subtract(rationalNumber7, rationalNumber8);
		RationalNumbers.multiply(rationalNumber7, rationalNumber8);
		RationalNumbers.divide(rationalNumber9, rationalNumber10);
		System.out.println(rationalNumber9.toString());
		System.out.println(rationalNumber10.toStringFloatingPoint(3));
   }
}
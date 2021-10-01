/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Tests Math class.
 * Latest version: 12:07 AM, 6/30/2017
 * Older versions: 
 */

public class MathClass
{
	public static void main(String[] args)
	{
		System.out.printf("Math.abs(23.7) = %.2f%nMath.abs(0.0) = %.2f%n", Math.abs(23.7), Math.abs(0.0));
		System.out.printf("Math.abs(-23.7) = %.2f%nMath.ceil(9.2) = %.2f%n", Math.abs(-23.7), Math.ceil(9.2));
		System.out.printf("Math.ceil(-9.8) = %.2f%nMath.cos(0.0) = %.2f%n", Math.ceil(-9.8), Math.cos(0.0));
		System.out.printf("Math.exp(1.0) = %.2f%nMath.exp(2.0) = %.2f%n", Math.exp(1.0), Math.exp(2.0));
		System.out.printf("Math.floor(9.2) = %.2f%nMath.floor(-9.8) = %.2f%n", Math.floor(9.2), Math.floor(-9.8));
		System.out.printf("Math.log(Math.E) = %.2f%nMath.log(Math.E * Math.E) = %.2f%n", Math.log(Math.E), Math.log(Math.E * Math.E));
		System.out.printf("Math.max(2.3, 12.7) = %.2f%nMath.max(-2.3, -12.7) = %.2f%n", Math.max(2.3, 12.7), Math.max(-2.3, -12.7));
		System.out.printf("Math.min(2.3, 12.7) = %.2f%nMath.min(-2.3, -12.7) = %.2f%n", Math.min(2.3, 12.7), Math.min(-2.3, -12.7));
		System.out.printf("Math.pow(2.0, 7.0) = %.2f%nMath.pow(9.0, 0.5) = %.2f%n", Math.pow(2.0, 7.0), Math.pow(9.0, 0.5));
		System.out.printf("Math.sin(0.0) = %.2f%nMath.sqrt(900.0) = %.2f%n", Math.sin(0.0), Math.sqrt(900.0));
		System.out.printf("Math.tan(0.0) = %.2f%n", Math.tan(0.0));
	}
}

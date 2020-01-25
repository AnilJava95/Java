/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Rounding numbers to specific decimal places.
 * Latest version: 14:50 30/06/2017.
 * Older versions: 
 */

public class RoundingNumbers2
{
   public static void main(String[] args)
   {
      double number = 5.5294;
      
      double number2 = Math.floor(number + 0.5);  // Rounding to integer
		double number3 = Math.floor(number * 10 + 0.5) / 10;  // Rounding to tenths
		double number4 = Math.floor(number * 100 + 0.5) / 100;  // Rounding to hundredths
		double number5 = Math.floor(number * 1000 + 0.5) / 1000;  // Rounding to thousandths
		
      System.out.printf("Rounding to integer: \t\t%.3f%nRounding to tenths: \t\t%.3f%n"
			+ "Rounding to hundredths: \t%.3f%nRounding to thousandths: \t%.3f%n", 
			number2, number3, number4, number5);
   }
}
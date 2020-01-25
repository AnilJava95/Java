/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Enter number of hours a car parked to see their charge. 
 *  Also see total charge for today. Enter -1 to end today.
 * Latest version: 2:53 PM, 9/2/2019. Used the do while instead of header + while.
 * Older versions: 11:45 30/06/2017.
 */

import java.util.Scanner;

public class ParkingCharges
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      float hours;
      float charge;
      float totalCharge = 0;
      
      /*System.out.print("Enter hours parked for next customer or enter -1 to end the day: ");
      hours = input.nextFloat();
      
      while(hours != -1)
      {
         charge = calculateCharge(hours);
         System.out.printf("Your charge is %.2f%n", charge);
         totalCharge += charge;
         System.out.printf("Todays total = %.2f%n", totalCharge);
         System.out.printf("%nEnter hours parked for next customer or enter -1 to end the day: ");
         hours = input.nextFloat();
      }*/
		
		do
      {
			System.out.printf("%nEnter hours parked for next customer or enter -1 to end the day: ");
         hours = input.nextFloat();
			if ( hours == -1)
				break;
         charge = calculateCharge(hours);
         System.out.printf("Your charge is %.2f%n", charge);
         totalCharge += charge;
         System.out.printf("Todays total = %.2f%n", totalCharge);
      }while(true);
   }
   
   static float calculateCharge(float hours)
   {
      if (hours <= 3)
         return 2;
      else if ((hours > 3) && (hours < 19))
         return 2 + ((hours - 3) / 2.0F);
      else // if ((hours >= 19) && (hours <= 24))
         return 10;
   }
}
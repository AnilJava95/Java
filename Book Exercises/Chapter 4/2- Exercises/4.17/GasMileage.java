/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Takes miles you drove and gas you used this trip and 
 *  calculates trip miles per gallon. At the end it calculates total miles per 
 *  gallon.
 * Latest version: 17:24 20/05/2017. Changed comments. Added units to prompts.
 * Older versions: 23:12 24/07/2016
 */

import java.util.Scanner;

public class GasMileage
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int tripGasLose;
      int totalGasLose = 0;
      int tripMiles;
      int totalMiles = 0;
      float tripMilesPerGallon;
      float totalMilesPerGallon = 0;
      
      System.out.print("Enter gallons of gas you used this trip or enter -1 to leave: ");
		tripGasLose = input.nextInt();
      while (tripGasLose != -1)
      {	
         System.out.print("Enter miles you drove last trip: ");
         tripMiles = input.nextInt();
         tripMilesPerGallon = (float) tripMiles / tripGasLose;
         System.out.printf("Trip miles per gallon: %.2f%n%n", tripMilesPerGallon);
         totalMiles += tripMiles;
         totalGasLose += tripGasLose;
			System.out.print("Enter gallons of gas you used this trip or enter -1 to leave: ");
			tripGasLose = input.nextInt();
      }
      
      totalMilesPerGallon = (float) totalMiles / totalGasLose;
      System.out.printf("%nTotal miles per gallon: %.2f%n", totalMilesPerGallon);
   }
}
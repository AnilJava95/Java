/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Takes names and earnings of 3 people and calculates taxes.
 * Latest version: 17:56 20/05/2017. Changed comments.
 * Older versions: 19:11 02/08/2016
 */

import java.util.Scanner;

public class TaxCalculator
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int counter = 1;
      String name;
      float earnings;
      float tax;
      
      while(counter <= 3)
      {
         System.out.print("Enter name: ");
         name = input.nextLine();
         System.out.print("Enter earnings: ");
         earnings = input.nextFloat();
         input.nextLine();
         
         if(earnings <= 30_000)
         {
            tax = earnings * 0.15F;
         }
         else
         {
            tax = earnings * 0.20F;
         }
         
         System.out.printf("Tax of %s is %,.2f%n%n", name, tax);
         
         counter++;
      }
   }
}

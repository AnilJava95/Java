/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: 
 * Latest version: 20:30 20/05/2017. Changed comments.
 * Older versions: 21:07 14/08/2016.
 */

import java.util.Scanner;

public class WaterScarcity
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int population = 91_812_566;
      double populationGrowth = 1.0225;
      long waterSource = 70_749_000_000L;
      float waterPerCapita;
      int year = 2014;
      
      System.out.printf("%s%15s%20s%n%n", "Year", "Population",
              "Water Per Capita");
      
      while (year <= 2030)
      {
         waterPerCapita = (float) waterSource / population;
         
         System.out.printf("%4d%,15d%20.2f%n", year, population, waterPerCapita);
         
         population *= populationGrowth;
         
         ++year;
         populationGrowth -= 0.0008;
		}
   }
}
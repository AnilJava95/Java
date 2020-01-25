/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Predict future population.
 * Latest version: 15:58 06/02/2019. Stopped using growthRate as counter. Old 
 *  version had to divide growthRate by 100 every single time it was used.
 * Older versions: 02:12 10/06/2017. Changed comments. Minor changes.
 *		16:35 11/09/2016.
 */

public class PopulationGrowth
{
   public static void main(String[] args)
   {
      long population = 1_350_000_000;
      float growthRate = 0.01F;
      
      for (int counter = 1; counter <= 7; counter++)
      {
         System.out.printf("Growth rate: %,d%n%n", counter);
         
         for (int counter2 = 1; counter2 <= 10; counter2++)
         {
            System.out.printf("Year: %d   Population: %,d%n", counter2, population);
            population *= Math.pow(Math.E, growthRate * growthRate);
            //population += population * growthRate;
         }
         
			growthRate += 0.01F;
         population = 1_350_000_000;
         System.out.println();
      }
   }
}
// Modified fig 5,6 to use only integers to calculate the compound interest.

// Fig. 5.6: Interest.java
// Compound-interest calculations with for.

public class ModifiedCompoundInterest
{
   public static void main(String args[])
   {
      int amount; // amount on deposit at end of each year
      int principal = 100_000; // initial amount before interest
      double rate = 0.05; // interest rate

      // display headers
      System.out.printf("%s%33s%n%n", "Year", "Amount on deposit");

      // calculate amount on deposit for each of ten years
      for (int year = 1; year <= 10; year++) 
      {
         // calculate new amount for specified year
         amount = (int) (principal * Math.pow(1 + rate, year));

         // display the year and the amount
         System.out.printf("%4d%,15d dollar %2d pennies%n",
                 year, amount / 100, amount % 100);
      }
   }
} // end class Interest


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/

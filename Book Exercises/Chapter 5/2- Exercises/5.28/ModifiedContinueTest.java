// Modified fig 5.14 to show we can turn a program with a continue statement into 
// a program without a continue statement.

// We changed the condition of if statement from "if (x = 5)" to 
// "if (x != 5)" in order to not use continue statement.

// Fig. 5.14: ContinueTest.java
// changing condition of if statement instead of using continue statement.
public class ModifiedContinueTest
{
   public static void main(String[] args)
   {
      for (int count = 1; count <= 10; count++) // loop 10 times
      {
         if (count != 5)
            System.out.printf("%d ", count);
      }
		
      System.out.printf("%nUsed continue to skip printing 5%n");
   }
} // end class ContinueTest


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

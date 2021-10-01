/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Edited figures 9.9, 9.10, 9.11 to use composition instead 
 *  of inheritance.
 * Latest version: 11:14 PM, 8/22/2020. Changed the CommisionEmployee type member 
 *  of BasePlusCommissionEmployee from private to packager private so we can 
 *  access its methods when we only have a reference to the 
 *  BasePlusCommissionEmployee object.
 * Older versions: 8:32 PM, 7/22/2017
 */

// BasePlusCommissionEmployeeTest.java
// Testing class BasePlusCommissionEmployee.

public class BasePlusCommissionEmployeeTest
{
   public static void main(String[] args) 
   {
      CommissionEmployee cEmployee1 = new CommissionEmployee("Bob", "Lewis", 
			"333-33-3333", 5000, .04);
      
      // instantiate BasePlusCommissionEmployee object
      BasePlusCommissionEmployee bEmployee1 = new BasePlusCommissionEmployee
			(cEmployee1, 300);
      
      // get base-salaried commission employee data
      System.out.println(
         "Employee information obtained by get methods:");
      System.out.printf("%n%s %s%n", "First name is",
         bEmployee1.employee.getFirstName());
      System.out.printf("%s %s%n", "Last name is", 
         bEmployee1.employee.getLastName());
      System.out.printf("%s %s%n", "Social security number is", 
         bEmployee1.employee.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Gross sales is", 
         bEmployee1.employee.getGrossSales());
      System.out.printf("%s %.2f%n", "Commission rate is",
         bEmployee1.employee.getCommissionRate());
      System.out.printf("%s %.2f%n", "Base salary is",
         bEmployee1.getBaseSalary());

      bEmployee1.setBaseSalary(1000); 
      
      System.out.printf("%n%s:%n%n%s%n", 
         "Updated employee information obtained by toString", 
         bEmployee1.toString());
   } // end main
} // end class BasePlusCommissionEmployeeTest


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

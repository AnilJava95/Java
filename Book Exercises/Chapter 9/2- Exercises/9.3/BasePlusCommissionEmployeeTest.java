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
         cEmployee1.getFirstName());
      System.out.printf("%s %s%n", "Last name is", 
         cEmployee1.getLastName());
      System.out.printf("%s %s%n", "Social security number is", 
         cEmployee1.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Gross sales is", 
         cEmployee1.getGrossSales());
      System.out.printf("%s %.2f%n", "Commission rate is",
         cEmployee1.getCommissionRate());
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

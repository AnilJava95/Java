/* Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Modified the payroll system of Figs. 10.4-10.9 to include 
 *  private instance variable birthDate(class Date from Fig. 8.7) in class Employee. 
 *  Added get methods to class Date for month, day and year. Added get method to 
 *  class Employee for birthDay. In class PayrollSystemTest we create an array of 
 *  Employee variables to store references to store the various employee objects.
 *  In a loop, calculate the payroll for each Employee polymorphically, and add 
 *  $100 bonus to the person's payroll if it's Employee's birth month.
 * Latest version: 5:03 PM, 11/15/2020. month, day, and year were in wrong places 
 *  in constructor calls and constructor parameter lists. Also, toString method of 
 *  Employee class used to call get methods of its birthdate. Now it just calls 
 *  getBirthdate to invoke toString method of its birthDate.
 * Older versions: 5:38 PM, 5/2/2019
 */

import java.time.LocalDate;

// Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.

public class PayrollSystemTest 
{
   public static void main(String[] args) 
   {
      // create subclass objects
      SalariedEmployee salariedEmployee = 
			new SalariedEmployee("Sir Sidney", "Smith", "111-11-1111", 800.00, 11, 28, 1995);
      HourlyEmployee hourlyEmployee = 
         new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40, 2, 12, 1990);
      CommissionEmployee commissionEmployee = 
         new CommissionEmployee(
         "Sue", "Jones", "333-33-3333", 10000, .06, 1, 31, 2000);
      BasePlusCommissionEmployee basePlusCommissionEmployee = 
         new BasePlusCommissionEmployee(
         "Bob", "Lewis", "444-44-4444", 5000, .04, 300, 5, 31, 1985);

		/*
      System.out.println("Employees processed individually:");
      
      System.out.printf("%n%s%n%s: $%,.2f%n%n", 
         salariedEmployee, "earned", salariedEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         hourlyEmployee, "earned", hourlyEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         commissionEmployee, "earned", commissionEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n", 
         basePlusCommissionEmployee, 
         "earned", basePlusCommissionEmployee.earnings());
		*/
		
      // create four-element Employee array
      Employee[] employees = new Employee[4]; 

      // initialize array with Employees
      employees[0] = salariedEmployee;
      employees[1] = hourlyEmployee;
      employees[2] = commissionEmployee; 
      employees[3] = basePlusCommissionEmployee;

      System.out.printf("%nEmployees processed polymorphically:%n%n");
      
		LocalDate today = LocalDate.now();
		
      // generically process each element in array employees
      for (Employee currentEmployee : employees) 
      {
         System.out.println(currentEmployee); // invokes toString
			
         // determine whether element is a BasePlusCommissionEmployee
         if (currentEmployee.getBirthDate().getBirthMonth() == today.getMonthValue())
         {
            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings() + 100);
         }
			else
			{
				System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
			}
      }

      // get type name of each object in employees array
      for (int j = 0; j < employees.length; j++)
         System.out.printf("Employee %d is a %s%n", j, 
            employees[j].getClass().getName()); 
   } // end main
} // end class PayrollSystemTest

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

/*
 * Author's name and email: Michael
 * Program description: I took figures 10, 11. I also took the two test 
 *  classes for these classes. Then i created a new class called Employee and 
 *  i rewrote CommissionEmployee class to extend Employee.
 * Latest version: 3:33 PM, 4/16/2019.
 * Older versions: 
 */

public class Employee
{
   private final String firstName;                              
   private final String lastName;                               
   private final String socialSecurityNumber;

   // three-argument constructor
   public Employee(String firstName, String lastName, 
		String socialSecurityNumber)
   {
      this.firstName = firstName;                                    
      this.lastName = lastName;                                    
      this.socialSecurityNumber = socialSecurityNumber;
   } // end constructor 

   // return first name
   public String getFirstName()
   {
      return firstName;
   }

   // return last name
   public String getLastName()
   {
      return lastName;
   }

   // return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   }

   // return String representation of CommissionEmployee object
   @Override 
   public String toString()
   {
      return String.format("%s: %s %s%n%s: %s", 
         "commission employee", getFirstName(), getLastName(), 
         "social security number", getSocialSecurityNumber());
   } 
}

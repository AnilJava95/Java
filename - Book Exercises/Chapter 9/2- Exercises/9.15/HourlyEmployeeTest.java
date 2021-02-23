/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: HourlyEmployee is a subclass of Employee. Uses hours 
 *  worked in a week and wage per hour to determine earnings.
 * Latest version: 5:32 PM, 4/16/2019
 * Older versions: 
 */

public class HourlyEmployeeTest
{
	public static void main(String[] args)
	{
		// instantiate hourlyEmployee object
		HourlyEmployee employee = new HourlyEmployee(
			"Sue", "Jones", "222-22-2222", 50.0, 40);

		// get commission employee data
		System.out.println(
			"Employee information obtained by get methods:");
		System.out.printf("%n%s %s%n", "First name is",
			employee.getFirstName());
		System.out.printf("%s %s%n", "Last name is",
			employee.getLastName());
		System.out.printf("%s %s%n", "Social security number is",
			employee.getSocialSecurityNumber());
		System.out.printf("%s %s%n", "Hours is",
			employee.getHours());
		System.out.printf("%s %s%n", "Wage is",
			employee.getWage());
		System.out.printf("%s %s%n", "Earnings is",
			employee.earnings());

		employee.setHours(45);
		employee.setWage(25);

		System.out.printf("%n%s:%n%n%s%n",
			"Updated employee information obtained by toString", employee);
	} // end main
} // end class CommissionEmployeeTest

/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Added HourlyEmploye, CommissionEmployee, and BasePlus
 *  to Fig 10.11-15. The we edited these three classes so they implement Payable 
 *  (Method earning became method getPaymentAmount). Then we edited 
 *  getPaymentAmount of BasePlus to call super.getPaymentAmount instead of 
 *  super.Earnings. We process two invoice objects and one object of each of four 
 *  Employee subclasses. We first output the toString method of the object. If 
 *  the object currently being processed is a BasePlus, increase base salary by 
 *  10%. FInally output the payment amount for each Payable object.
 * Latest version: 6:12 AM, 11/16/2020.
 * Older versions: 
 */

// Fig. 10.15: PayableInterfaceTest.java
// Payable interface test program processing Invoices and 
// Employees polymorphically.

public class PayableInterfaceTest
{
	public static void main(String[] args)
	{
		// create four-element Payable array
		Payable[] payableObjects = new Payable[6];

		// populate array with objects that implement Payable
		payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
		payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
		payableObjects[2] = new CommissionEmployee("John", "Smith",
			"111-11-1111", 4000.00, 0.06);
		payableObjects[3] = new BasePlusCommissionEmployee("John", "Smith",
			"111-11-1112", 600.00, 0.04, 200);
		payableObjects[4] = new HourlyEmployee("John", "Smith",
			"111-11-1113", 40, 10);
		payableObjects[5] = new SalariedEmployee("Lisa", "Barnes",
			"111-11-1114", 1200.00);

		System.out.printf("Invoices and Employees processed polymorphically:%n%n");

		// generically process each element in array payableObjects
		for (Payable currentPayable : payableObjects)
		{
			System.out.println(currentPayable);

			// determine whether element is a BasePlusCommissionEmployee
			if (currentPayable instanceof BasePlusCommissionEmployee)
			{
				// downcast Employee reference to basePlusCommissionEmployee reference
				BasePlusCommissionEmployee employee
					= (BasePlusCommissionEmployee) currentPayable;

				employee.setBaseSalary(1.10 * employee.getBaseSalary());

				System.out.printf(
					"new base salary with 10%% increase is: $%,.2f%n",
					employee.getBaseSalary());
			}

			// output currentPayable and its appropriate payment amount
			System.out.printf("%s: $%,.2f%n%n",	"payment due", 
				currentPayable.getPaymentAmount());
		}
	} // end main
} // end class PayableInterfaceTest

/**
 * ************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and * Pearson Education,
 * Inc. All Rights Reserved. * * DISCLAIMER: The authors and publisher of this
 * book have used their * best efforts in preparing the book. These efforts
 * include the * development, research, and testing of the theories and programs
 * * to determine their effectiveness. The authors and publisher make * no
 * warranty of any kind, expressed or implied, with regard to these * programs
 * or to the documentation contained in these books. The authors * and publisher
 * shall not be liable in any event for incidental or * consequential damages in
 * connection with, or arising out of, the * furnishing, performance, or use of
 * these programs. *
 ************************************************************************
 */

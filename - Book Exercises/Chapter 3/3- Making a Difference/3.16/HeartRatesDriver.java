/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Drives class HeartRates. Takes data from user
 *  before initializing an object. Then does calculating and prints results.
 * Latest version: 5:38 PM, 2/1/2019. calculateAge method now doesnt request an 
 *  argument.
 * Older versions: 3:35 PM, 4/28/2017. Comments changed. Read name and last name 
 *  method is now nextLine, not next.
 *		9:11 PM, 7/5/2016
 */

import java.util.Scanner;

public class HeartRatesDriver
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		String firstName;
		String lastName;
		int birthDay;
		int birthMonth;
		int birthYear;

		float age;
		int maxHeartRate;
		//int minTargetHeartRate;
		//int maxTargetHeartRate;

		System.out.print("Enter first name: ");
		firstName = input.nextLine();

		System.out.print("Enter last name: ");
		lastName = input.nextLine();

		System.out.print("Enter day of birth: ");
		birthDay = input.nextInt();

		System.out.print("Enter month of birth: ");
		birthMonth = input.nextInt();

		System.out.print("Enter year of birth: ");
		birthYear = input.nextInt();

		System.out.println("");

		HeartRates patient1 = new HeartRates(firstName, lastName, birthDay,
			birthMonth, birthYear);

		// printing data of patient1
		System.out.println("First name: " + patient1.getFirstName());
		System.out.println("Last name: " + patient1.getLastName());
		System.out.printf("Birth date: %d/%d/%d\n\n", patient1.getBirthDay(),
			patient1.getBirthMonth(), patient1.getBirthYear());

		// calculating data about patient1
		age = patient1.calculateAge();
		maxHeartRate = patient1.calculateMaxHeartRate(age);
		patient1.calculateTargetHeartRate(maxHeartRate);

		// printing data we calculated about patient1
		System.out.printf("Age: %.2f%n", age);
		System.out.printf("Max heart rate: %d%n", maxHeartRate);
		System.out.printf("Target hart rate: %d-%d%n", patient1.
			getMinTargetHeartRate(), patient1.getMaxTargetHeartRate());
	}
}

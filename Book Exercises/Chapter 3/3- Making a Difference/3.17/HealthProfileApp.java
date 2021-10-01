/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Drivers the class HealthProfile. Takes data from patient, 
 *  initializes an object, calculates and prints data about patient.
 * Latest version: 3:53 PM, 4/28/2017. Changed comments.
 * Older versions: 12:12 AM, 7/6/2016
 */

import java.util.Scanner;

public class HealthProfileApp
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		String firstName;
		String lastName;
		String gender;
		int birthDay;
		int birthMonth;
		int birthYear;
		float height;
		float weight;

		float age;
		int maxHeartRate;
		//int minTargetHeartRate;
		//int maxTargetHeartRate;
		float bodyMassIndex;

		System.out.print("Enter first name: ");
		firstName = input.nextLine();

		System.out.print("Enter last name: ");
		lastName = input.nextLine();

		System.out.print("Enter gender: ");
		gender = input.nextLine();

		System.out.print("Enter day of birth: ");
		birthDay = input.nextInt();

		System.out.print("Enter month of birth: ");
		birthMonth = input.nextInt();

		System.out.print("Enter year of birth: ");
		birthYear = input.nextInt();

		System.out.print("Enter height in meters(e.g. 1.72): ");
		height = input.nextFloat();

		System.out.print("Enter weight in kilograms(e.g. 65): ");
		weight = input.nextFloat();

		System.out.println("");

		HealthProfile patient1 = new HealthProfile(firstName, lastName, gender,
			birthDay, birthMonth, birthYear, height, weight);
		
		// printing data of patient1
		System.out.println("First name: " + patient1.getFirstName());
		System.out.println("Last name: " + patient1.getLastName());
		System.out.println("Gender: " + patient1.getGender());
		System.out.printf("Birth date: %d/%d/%d\n\n", patient1.getBirthDay(),
			patient1.getBirthMonth(), patient1.getBirthYear());

		// calculating data about patient1
		age = patient1.calculateAge();
		maxHeartRate = patient1.calculateMaxHeartRate(age);
		patient1.calculateTargetHeartRate(maxHeartRate);
		bodyMassIndex = patient1.bodyMassIndex(height, weight);

		// printing data we calculated about patient1
		System.out.printf("Age: %.2f%n", age);
		System.out.printf("Max heart rate: %d%n", maxHeartRate);
		System.out.printf("Target heart rate: %d-%d%n", patient1.
			getMinTargetHeartRate(), patient1.getMaxTargetHeartRate());
		System.out.printf("Body mass index: %.2f%n ", bodyMassIndex);

		System.out.println(""); // blank line

		// print bmi table
		System.out.print("BMI VALUES\nUnderweight: less than 18.5\n");
		System.out.print("Normal:      between 18.5 and 24.9\n");
		System.out.print("Overweight:  between 25 and 29.9\n");
		System.out.print("Obese:       30 or greater\n");
	}
}

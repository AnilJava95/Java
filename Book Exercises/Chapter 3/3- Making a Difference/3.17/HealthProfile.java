/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Takes data about patient, calculate more data
 *  about patient.
 * Latest version: 3:50 PM, 4/28/2017. Changed comments.
 * Older versions: 11:52 PM, 7/5/2016
 */

import java.time.LocalDate;
import java.time.Period;
//import java.util.Calendar;

public class HealthProfile
{
	private String firstName;
	private String lastName;
	private String gender;
	private int birthDay;
	private int birthMonth;
	private int birthYear;
	private double height;
	private double weight;

	private int minTargetHeartRate;
	private int maxTargetHeartRate;

	// constructor for first 8 instance variables
	public HealthProfile(String firstName, String lastName, String gender,
		int birthDay, int birthMonth, int birthYear, double height, double weight)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDay = birthDay;
		this.birthMonth = birthMonth;
		this.birthYear = birthYear;
		this.height = height;
		this.weight = weight;
	}

	public void setFirstName(String firstName) // set-get methods for first name
	{
		this.firstName = firstName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setLastName(String lastName) // set-get methods for last name
	{
		this.lastName = lastName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setGender(String gender) // set-get methods for gender
	{
		this.gender = gender;
	}

	public String getGender()
	{
		return gender;
	}

	public void setBirthDay(int birthDay) // set-get methods for birth day
	{
		this.birthDay = birthDay;
	}

	public int getBirthDay()
	{
		return birthDay;
	}

	public void setBirthMonth(int birthmonth) // set-get methods for birth month
	{
		this.birthMonth = birthmonth;
	}

	public int getBirthMonth()
	{
		return birthMonth;
	}

	public void setBirthYear(int birthYear) // set-get methods for birth year
	{
		this.birthYear = birthYear;
	}

	public int getBirthYear()
	{
		return birthYear;
	}

	public void setheight(int height) // set-get methods for height
	{
		this.height = height;
	}

	public double getheight()
	{
		return height;
	}

	public void setweight(int weight) // set-get methods for weight
	{
		this.weight = weight;
	}

	public double getweight()
	{
		return weight;
	}

	public int getMinTargetHeartRate() // get method for min target heart rate
	{
		return minTargetHeartRate;
	}

	public int getMaxTargetHeartRate() // get method for max target heart rate
	{
		return maxTargetHeartRate;
	}

	public float calculateAge() // age calculating method
	{
		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
		if ((birthDate != null) && (today != null))
		{
			return Period.between(birthDate, today).getYears()
				+ (Period.between(birthDate, today).getMonths() / 12.0F)
				+ (Period.between(birthDate, today).getDays() / 365.0F);
		}
		else
		{
			return 0.0F;
		}

		//return Calendar.getInstance().get(Calendar.YEAR) - birthYear;
	}

	// max heart rate calculating method
	public int calculateMaxHeartRate(float age)
	{
		int maxHeartRate = 220 - (int) age;

		return maxHeartRate;
	}

	// target heart rate calculator
	public void calculateTargetHeartRate(int maxHeartRate)
	{
		int minTargetHeartRate = (int) (maxHeartRate * 0.5);
		this.minTargetHeartRate = minTargetHeartRate;

		int maxTargetHeartRate = (int) (maxHeartRate * 0.85);
		this.maxTargetHeartRate = maxTargetHeartRate;
	}

	// body mass index calculator
	public float bodyMassIndex(float height, float weight)
	{
		float bodyMassIndex = weight / (height * height);

		return bodyMassIndex;
	}
}

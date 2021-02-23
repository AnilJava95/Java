/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: A small health program that keeps and calculates
 *  data about patient.
 * Latest version: 5:38 PM, 2/1/2019. Changed calculateAge method from a simple 
 *  subtraction method to a method that finds float age.
 * Older versions: 3:32 PM, 4/28/2017. Comments changed.
 *		8:16 PM, 7/5/2016
 */

import java.time.LocalDate;
import java.time.Period;
//import java.util.Calendar;

public class HeartRates
{
	private String firstName;
	private String lastName;
	private int birthDay;
	private int birthMonth;
	private int birthYear;
	
	private int minTargetHeartRate;
	private int maxTargetHeartRate;

	// constructor for all five instance variables
	public HeartRates(String firstName, String lastName, int birthDay, 
		int birthMonth, int birthYear)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
		this.birthMonth = birthMonth;
		this.birthYear = birthYear;
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

	public int getMinTargetHeartRate() // get method for min target heart rate
	{
		return minTargetHeartRate;
	}

	public int getMaxTargetHeartRate() // get method for max target heart rate
	{
		return maxTargetHeartRate;
	}

	public float calculateAge()
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

	public int calculateMaxHeartRate(float age)
	{
		return 220 - (int) age;
	}

	public void calculateTargetHeartRate(float maxHeartRate)
	{
		minTargetHeartRate = (int) (maxHeartRate * 0.5);
		maxTargetHeartRate = (int) (maxHeartRate * 0.85);
	}
}

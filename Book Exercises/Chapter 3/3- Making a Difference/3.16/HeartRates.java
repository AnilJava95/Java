/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: A small health program that keeps, calculates
 *  data about patient.
 * Latest version: 17:38 01/02/2019. Changed calculateAge method from a simple 
 *  subtraction method to a method that finds float age.
 * Older versions: 15:32 28/04/2017. Comments changed.
 *		20:16 05/07/2016
*/

// we use Calendar to get current year to calculate age
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
   public HeartRates(String firstName, String lastName, int birthDay, int 
		birthMonth, int birthYear)
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
   
   public int getMinTargetHeartRate()
   {
      return minTargetHeartRate;
   }
   
   public int getMaxTargetHeartRate()
   {
      return maxTargetHeartRate;
   }
   
   public float calculateAge()
   {
		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthMonth);
		if ((birthDate != null) && (today != null))
		{
			return Period.between(birthDate, today).getYears() + 
				(Period.between(birthDate, today).getMonths() / 12.0F); //+
				//(Period.between(birthDate, today).getDays()/ 365.0F);
				// I didnt add days because it didnt get calculated right.
      }
		else
		{
			return 0.0F;
      }
		
      //return Calendar.getInstance().get(Calendar.YEAR) - birthYear;
   }
   
   public int calculateMaxHeartRate(float age)
   {
      return 220 - (int)age;
   }
   
   public void calculateTargetHeartRate(float maxHeartRate)
   {
      minTargetHeartRate = (int)(maxHeartRate * 0.5);
      maxTargetHeartRate = (int)(maxHeartRate * 0.85);
   }
}
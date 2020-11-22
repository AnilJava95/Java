//

public class HourlyEmployee extends Employee
{
	private double hours; // Hours worked per week
	private double wage; // Wage per hour

	public HourlyEmployee(String firstName, String lastName, String 
		socialSecurityNumber, double wage, double hours)
	{
		super(firstName, lastName, socialSecurityNumber);

		if (wage < 0)
			throw new IllegalArgumentException("Wage cannot be negative.");
		
		if (hours < 0 && hours > 168)
			throw new IllegalArgumentException("Hours must be between 0 and 168.");

		this.hours = hours;
		this.wage = wage;
	}

	public double getHours()
	{
		return hours;
	}

	public void setHours(double hours)
	{
		if (hours < 0 && hours > 168)
			throw new IllegalArgumentException("Hours must be between 0 and 168.");

		this.hours = hours;
	}

	public double getWage()
	{
		return wage;
	}

	public void setWage(double wage)
	{
		if (wage < 0)
			throw new IllegalArgumentException("Wage cannot be negative.");

		this.wage = wage;
	}

	public double earnings()
	{
		if (getHours() <= 40)
			return getHours() * getWage();
		else
			return (40 * getWage()) + ((getHours() - 40) * (getWage() * 1.5));
	}

	@Override
	public String toString()
	{
		return String.format("%s %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
			"hourly", super.toString(),
			"hours", getHours(),
			"wage", getWage(),
			"earnings", earnings());
	}
}

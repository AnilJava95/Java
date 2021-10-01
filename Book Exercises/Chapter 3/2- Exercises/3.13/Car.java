/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Class CarApplication is driver class of this class.
 * Latest version: 4:16 PM, 1/31/2019. Changed "if if" statements  to "if else" 
 *  in method setPrice.
 * Older versions: 2:39 PM, 4/28/2017. Changed comments.
 *		12:19 AM, 7/4/2016
 */

public class Car
{
	private String modelName;
	private String year;
	private double price;

	// constructor for all instance variables
	public Car(String modelName, String year, double price)
	{
		this.modelName = modelName;
		this.year = year;
		
		if (price < 0)
			System.out.print("price can't be a negative value.");
		else
			this.price = price;
	}

	// set and get methods for modelName
	public void setModelName(String modelName)
	{
		this.modelName = modelName;
	}

	public String getModelName()
	{
		return modelName;
	}

	// set and get methods for year
	public void setyear(String year)
	{
		this.year = year;
	}

	public String getyear()
	{
		return year;
	}

	// set and get methods for price
	public void setPrice(int price)
	{
		if (price < 0)
			System.out.print("price can't be a negative value.");
		else
			this.price = price;
	}

	public double getPrice()
	{
		return price;
	}

	// method to calculate discounted price
	public void discount(double discountAmount)
	{
		price = price * ((100 - discountAmount) / 100);
	}
}

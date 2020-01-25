/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: Class CarApplication is driver class of this class.
 * Latest version: 16:16 31/01/2019. Change "if if" to "if else" in method 
 *  setPrice.
 * Older versions: 14:39 28/04/2017. Changed comments.
 *		00:19 04/07/2016
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
		{
         System.out.print("You cant enter a negative value.");
      }
      else
		{
         this.price = price;
      }
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
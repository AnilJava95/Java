/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: PetrolPurchase can be used to create objects(petrol 
 *  stations) to track purchases etc.
 * Latest version: 15:31 31/01/2019. Changed setPurchaseInLiters, setLiterPrice, 
 *  setDiscountPercentege methods to use "if else" instead of "if if".
 * Older versions: 13:43 28/04/2017. Changed comments.
 *		19:04 01/07/2016
 */

public class PetrolPurchase
{
	private String locationOfStation;
	private String petrolType;
	private int purchaseInLiters;
	private double literPrice;
	private double discountPercentege;
	
	// Constructor that initializes all instance variables.
	public PetrolPurchase(String locationOfStation, String petrolType,
		int purchaseInLiters, double literPrice, double discountPercentege)
	{
		this.locationOfStation = locationOfStation;
		this.petrolType = petrolType;
		this.purchaseInLiters = purchaseInLiters;
		this.literPrice = literPrice;
		this.discountPercentege = discountPercentege;
	}
	
	// Set and get methods for locationOfStation.
	public void setLocationOfStation(String locationOfStation)
	{
		this.locationOfStation = locationOfStation;
	}
	
	public String getLocationOfStation()
	{
		return locationOfStation;
	}
	
	// Set and get methods for petrolType.
	public void setPetrolType(String petrolType)
	{
		this.petrolType = petrolType;
	}
	
	public String getPetrolType()
	{
		return petrolType;
	}
	
	// Set and get methods for purchaseInLiters.
	public void setPurchaseInLiters(int purchaseInLiters)
	{
		if (purchaseInLiters < 0)
		{
			System.out.print("You cant enter a negative amount.");
		}
		else
		{
			this.purchaseInLiters = purchaseInLiters;
		}
	}
	
	public int getPurchaseInLiters()
	{
		return purchaseInLiters;
	}
	
	// Set and get methods for literPrice.
	public void setLiterPrice(double literPrice)
	{
		if (literPrice < 0)
		{
			System.out.print("You cant enter a negative amount.");
		}
		else
		{
			this.literPrice = literPrice;
		}
	}
	
	public double getLiterPrice()
	{
		return literPrice;
	}
	
	// Set and get methods for discountPercentege.
	public void setDiscountPercentege(double discountPercentege)
	{
		if (discountPercentege < 0 || discountPercentege > 100)
		{
			System.out.print("You have to enter a value between 0 and 100.");
		}
		else
		{
			this.discountPercentege = discountPercentege;
		}
	}
	
	public double getDiscountPercentege()
	{
		return discountPercentege;
	}
	
	// Calculates net amount you have to pay.
	public double getPurchaseAmount(int purchaseInLiters, double literPrice, 
		double discountPercent)
	{
		double purchaseAmount = (purchaseInLiters * literPrice) * ((100 -	
			discountPercent) / 100);
		
		return purchaseAmount;
	}
}

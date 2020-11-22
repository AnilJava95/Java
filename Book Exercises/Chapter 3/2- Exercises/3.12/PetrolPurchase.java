/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: PetrolPurchase can be used to create objects(petrol 
 *  stations) to track purchases etc.
 * Latest version: 6:47 PM, 4/3/2020. Copied the checks in set methods to constructor.
 *  Changed the "getPurchaseAmount" method so it doesnt take three arguments anymore. 
 *  Changed "Percentege" to "Percentage".
 * Older versions: 3:31 PM, 1/31/2019. Changed setPurchaseInLiters, setLiterPrice, 
 *  setDiscount` methods to use "if else" instead of "if if".
 *		1:43 PM, 4/28/2017. Changed comments.
 *		7:04 PM, 7/1/2016
 */

public class PetrolPurchase
{
	private String locationOfStation;
	private String petrolType;
	private int purchaseInLiters;
	private double literPrice;
	private double discountPercentage;

	// Constructor that initializes all instance variables.
	public PetrolPurchase(String locationOfStation, String petrolType,
		int purchaseInLiters, double literPrice, double discountPercentage)
	{
		this.locationOfStation = locationOfStation;
		this.petrolType = petrolType;
		
		if (purchaseInLiters < 0)
			System.out.print("purchaseInLiters can't be a negative amount.");
		else
			this.purchaseInLiters = purchaseInLiters;
		
		if (literPrice < 0)
			System.out.print("literPrice can't be a negative amount.");
		else
			this.literPrice = literPrice;
		
		if (discountPercentage < 0 || discountPercentage > 100)
			System.out.print("discountPercentage has to be between 0 and 100.");
		else
			this.discountPercentage = discountPercentage;
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
			System.out.print("purchaseInLiters can't be a negative amount.");
		else
			this.purchaseInLiters = purchaseInLiters;
	}

	public int getPurchaseInLiters()
	{
		return purchaseInLiters;
	}

	// Set and get methods for literPrice.
	public void setLiterPrice(double literPrice)
	{
		if (literPrice < 0)
			System.out.print("literPrice can't be a negative amount.");
		else
			this.literPrice = literPrice;
	}

	public double getLiterPrice()
	{
		return literPrice;
	}

	// Set and get methods for discountPercentage.
	public void setDiscountPercentage(double discountPercentage)
	{
		if (discountPercentage < 0 || discountPercentage > 100)
			System.out.print("literPrice can't be a negative amount.");
		else
			this.discountPercentage = discountPercentage;
	}

	public double getDiscountPercentage()
	{
		return discountPercentage;
	}

	// Calculates net amount you have to pay.
	public double getPurchaseAmount()
	{
		double purchaseAmount = (purchaseInLiters * literPrice) * ((100
			- discountPercentage) / 100);

		return purchaseAmount;
	}
}

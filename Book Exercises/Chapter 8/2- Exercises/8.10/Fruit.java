/*
 * Author's name and email: Michael
 * Program description: Fruit enum type.
 * Latest version: 1:39 PM, 9/6/2019.
 * Older versions: 
 */

public enum Fruit
{
	APPPLE("FRUIT", "95"),
	BANANA("FRUIT", "105"),
	CARROT("VEGETABLE", "41");
	
	private final String type;
	private final String calories;
	
	Fruit(String type, String calories)
	{
		this.type = type;
		this.calories = calories;
	}
	
	public String getType()
	{
		return type;
	}
	
	public String getCalories()
	{
		return calories;
	}
	
	
}
/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Food enum type.
 * Latest version: 1:39 PM, 9/6/2019
 * Older versions: 
 */

public enum Food
{
	APPLE("FRUIT", "95"),
	BANANA("FRUIT", "105"),
	CARROT("VEGETABLE", "41");

	private final String type;
	private final String calories;

	Food(String type, String calories)
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

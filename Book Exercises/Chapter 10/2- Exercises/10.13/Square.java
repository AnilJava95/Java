/*
 * Author's name and email: Michael
 * Program description: Class that represents a square.
 * Latest version: 6:11 PM, 9/12/2019.
 * Older versions: 
 */

public class Square extends TwoDimensionalShape
{
   private double side;
	
	public Square(double side)
	{
		if (side > 0)
			this.side = side;
	}
	
	@Override
	public double getArea()
	{
		double area = side * side;
		return area;
	}
}
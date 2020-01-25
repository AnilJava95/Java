/*
 * Author's name and email: Michael
 * Program description: Class that represents a circle.
 * Latest version: 6:11 PM, 9/12/2019.
 * Older versions: 
 */

public class Circle extends TwoDimensionalShape
{
	private double radius;
	
	public Circle(double radius)
	{
		if (radius > 0)
			this.radius = radius;
	}
	
	@Override
   public double getArea()
	{
		double area = Math.PI * radius * radius;
		return area;
	}
}
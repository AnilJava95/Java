/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Class that represents a triangle.
 * Latest version: 6:12 PM, 9/12/2019
 * Older versions: 
 */

public class Triangle extends TwoDimensionalShape
{
	double base;
	double height;

	public Triangle(double base, double height)
	{
		if (base > 0 && height > 0)
		{
			this.base = base;
			this.height = height;
		}
	}

	public double getArea()
	{
		double area = base * height / 2;
		return area;
	}
}

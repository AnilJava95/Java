/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Class that represents a sphere.
 * Latest version: 6:12 PM, 9/12/2019
 * Older versions: 
 */

public class Sphere extends ThreeDimensionalShape
{
	private double radius;

	public Sphere(double radius)
	{
		if (radius > 0)
			this.radius = radius;
	}

	@Override
	public double getArea()
	{
		double area = 4 * Math.PI * radius * radius;
		return area;
	}

	@Override
	public double getVolume()
	{
		double volume = (4 / 3) * Math.PI * radius * radius * radius;
		return volume;
	}
}

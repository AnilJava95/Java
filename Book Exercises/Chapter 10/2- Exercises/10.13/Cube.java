/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Class that represents a cube.
 * Latest version: 6:12 PM, 9/12/2019
 * Older versions: 
 */

public class Cube extends ThreeDimensionalShape
{
	private double edge;

	public Cube(double edge)
	{
		if (edge > 0)
			this.edge = edge;
	}

	@Override
	public double getArea()
	{
		double area = edge * edge * 6;
		return area;
	}

	@Override
	public double getVolume()
	{
		double volume = edge * edge * edge;
		return volume;
	}
}

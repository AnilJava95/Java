/*
 * Author's name and email: Michael
 * Program description: Class that represents a tetrahedron.
 * Latest version: 6:12 PM, 9/12/2019.
 * Older versions: 
 */

public class Tetrahedron extends ThreeDimensionalShape
{
   private double edge;
	
	public Tetrahedron(double edge)
	{
		if (edge > 0)
			this.edge = edge;
	}
	
	@Override
	public double getArea()
	{
		double area = Math.sqrt(3) * edge * edge;
		return area;
	}
	
	@Override
	public double getVolume()
	{
		double volume = (edge * edge * edge) / (6 * Math.sqrt(2));
		return volume;
	}
}
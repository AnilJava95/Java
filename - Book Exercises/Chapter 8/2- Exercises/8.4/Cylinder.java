/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: A cylinder class that has radius and height variables, 
 *  get, set, and calculate volume methods.
 * Latest version: 1:51 PM, 3/8/2019. calculateVolume now doesnt have arguments.
 * Older versions: 2:27 AM, 7/22/2017
 */

public class Cylinder
{
	private int radius = 1;
	private int height = 1;

	public static void main(String[] args)
	{
		Cylinder cylinder = new Cylinder();

		System.out.printf("Cylinder radius: %d%nCylinder height: %d%nCylinder volume: "
			+ "%f%n", cylinder.radius, cylinder.height, cylinder.calculateVolume());

		cylinder.setHeight(2);
		cylinder.setRadius(2);

		System.out.printf("Cylinder radius: %d%nCylinder height: %d%nCylinder volume: "
			+ "%f%n", cylinder.radius, cylinder.height, cylinder.calculateVolume());
	}

	public void setRadius(int radius)
	{
		if (radius > 0)
			this.radius = radius;
		else
			System.out.println("Radius cant be a negative value.");
	}

	public void setHeight(int height)
	{
		if (height > 0)
			this.height = height;
		else
			System.out.println("Height cant be a negative value.");
	}

	public int getRadius()
	{
		return this.radius;
	}

	public int getHeight()
	{
		return this.height;
	}

	public double calculateVolume()
	{
		double volume = Math.PI * Math.pow(radius, 2) * height;

		return volume;
	}
}

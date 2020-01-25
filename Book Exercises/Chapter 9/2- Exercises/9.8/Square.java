/*
 * Author's name and email: Michael
 * Program description: Subclass of Rectangle. Overrides calculateArea method.
 * Latest version: 3:21 AM, 3/31/2019.
 * Older versions: 
 */

public class Square extends Rectangle
{
	public Square(Point point1, Point point2, Point point3, Point point4)
	{
		super(point1, point2, point3, point4);
	}
	
	@Override
	public float calculateArea()
	{
		if (getPoint1().getyPosition() == getPoint2().getyPosition())
		{
			float sideLength = Math.abs(getPoint1().getxPosition() - getPoint2().getxPosition());
			return sideLength * sideLength;
		}
		else if (getPoint1().getyPosition() == getPoint3().getyPosition())
		{
			float sideLength = Math.abs(getPoint1().getxPosition() - getPoint3().getxPosition());
			return sideLength * sideLength;
		}
		else
		{
			float sideLength = Math.abs(getPoint1().getxPosition() - getPoint4().getxPosition());
			return sideLength * sideLength;
		}
	}
}

/*
 * Author's name and email: Michael
 * Program description: Subclass of Quadrilateral. Defines a calculateArea method.
 * Latest version: 3:19 AM, 3/31/2019.
 * Older versions: 
 */

public class Parallelogram extends Quadrilateral
{
	public Parallelogram(Point point1, Point point2, Point point3, Point point4)
	{
		super(point1, point2, point3, point4);
	}
	
	public float calculateArea()
	{
		if (getPoint1().getyPosition() == getPoint2().getyPosition())
		{
			float height = Math.abs(getPoint1().getyPosition() - getPoint3().getyPosition());
			float width = Math.abs(getPoint1().getxPosition() - getPoint2().getxPosition());
			return width * height;
		}
		else if (getPoint1().getyPosition() == getPoint3().getyPosition())
		{
			float height = Math.abs(getPoint1().getyPosition() - getPoint2().getyPosition());
			float width = Math.abs(getPoint1().getxPosition() - getPoint3().getxPosition());
			return width * height;
		}
		else
		{
			float height = Math.abs(getPoint1().getyPosition() - getPoint2().getyPosition());
			float width = Math.abs(getPoint1().getxPosition() - getPoint4().getxPosition());
			return width * height;
		}
	}
}

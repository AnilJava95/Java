/*
 * Author's name and email: Michael
 * Program description: Subclass of Quadrilateral. Defines a calculateArea method.
 * Latest version: 3:18 AM, 3/31/2019.
 * Older versions: 
 */

public class Tropezoid extends Quadrilateral
{
	public Tropezoid(Point point1, Point point2, Point point3, Point point4)
	{
		super(point1, point2, point3, point4);
	}
	
	public float calculateArea()
	{
		if (getPoint1().getyPosition() == getPoint2().getyPosition())
		{
			float height = Math.abs(getPoint1().getyPosition() - getPoint3().getyPosition());
			float width1 = Math.abs(getPoint1().getxPosition() - getPoint2().getxPosition());
			float width2 = Math.abs(getPoint3().getxPosition() - getPoint4().getxPosition());
			return 0.5F * (width1 + width2) * height;
		}
		else if (getPoint1().getyPosition() == getPoint3().getyPosition())
		{
			float height = Math.abs(getPoint1().getyPosition() - getPoint2().getyPosition());
			float width1 = Math.abs(getPoint1().getxPosition() - getPoint3().getxPosition());
			float width2 = Math.abs(getPoint2().getxPosition() - getPoint4().getxPosition());
			return 0.5F * (width1 + width2) * height;
		}
		else
		{
			float height = Math.abs(getPoint1().getyPosition() - getPoint2().getyPosition());
			float width1 = Math.abs(getPoint1().getxPosition() - getPoint4().getxPosition());
			float width2 = Math.abs(getPoint2().getxPosition() - getPoint3().getxPosition());
			return 0.5F * (width1 + width2) * height;
		}
	}
}

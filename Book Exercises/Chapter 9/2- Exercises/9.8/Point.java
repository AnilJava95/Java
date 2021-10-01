/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Holds x and y positions.
 * Latest version: 3:16 AM, 3/31/2019
 * Older versions: 
 */

public class Point
{
	private float xPosition;
	private float yPosition;

	public Point(float xPosition, float yPosition)
	{
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}

	public float getxPosition()
	{
		return xPosition;
	}

	public float getyPosition()
	{
		return yPosition;
	}

	public void setxPosition(float xPosition)
	{
		this.xPosition = xPosition;
	}

	public void setyPosition(float yPosition)
	{
		this.yPosition = yPosition;
	}
}

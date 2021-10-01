/*
 * Author's name and email: Michael, michaeljava95@gmail.com
 * Program description: Test class for Point, Quadrilateral, Tropezoid, 
 *  Parallelogram, Rectangle and Square classes.
 * Latest version: 3:22 AM, 3/31/2019
 * Older versions: 
 */

public class TestClass
{
	public static void main(String[] args)
	{
		// Test Tropezoid
		Point p1 = new Point(12, 28);
		Point p2 = new Point(34, 28);
		Point p3 = new Point(6, 7);
		Point p4 = new Point(53, 7);
		
		Tropezoid t1 = new Tropezoid(p1, p2, p3, p4);
		System.out.println("Tropezoid area: " + t1.calculateArea());

		// Test Parallelogram
		Point p5 = new Point(0, 0);
		Point p6 = new Point(8, 0);
		Point p7 = new Point(1, 5);
		Point p8 = new Point(9, 5);
		
		Parallelogram pa1 = new Parallelogram(p5, p6, p7, p8);
		System.out.println("Parallelogram area: " + pa1.calculateArea());
		
		// Test Rectangle
		Point p10 = new Point(0, 0);
		Point p11 = new Point(8, 0);
		Point p12 = new Point(0, 7);
		Point p13 = new Point(8, 7);
		
		Rectangle r1 = new Rectangle(p10, p11, p12, p13);
		System.out.println("Rectangle area: " + r1.calculateArea());
		
		// Test Square
		Point p14 = new Point(0, 0);
		Point p15 = new Point(0, 5);
		Point p16 = new Point(5, 0);
		Point p17 = new Point(5, 5);

		Square s1 = new Square(p14, p15, p16, p17);
		System.out.println("Square area: " + s1.calculateArea());
	}
}

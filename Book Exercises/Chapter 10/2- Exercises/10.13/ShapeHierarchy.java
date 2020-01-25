/*
 * Author's name and email: Michael
 * Program description: Main class for ShapeHierarchy application.
 * Latest version: 6:10 PM, 9/12/2019.
 * Older versions: 
 */

public class ShapeHierarchy
{
   public static void main(String[] args)
   {
		Circle circle = new Circle(2.299);
		Square square = new Square(3.0);
		Triangle triangle = new Triangle(4.123, 5.84);
		Sphere sphere = new Sphere(6.154);
		Cube cube = new Cube(9.991);
		Tetrahedron tetrahedron = new Tetrahedron(1.002);
		
		Shape[] shapeArray = new Shape[6];
		shapeArray[0] = circle;
		shapeArray[1] = square;
		shapeArray[2] = triangle;
		shapeArray[3] = sphere;
		shapeArray[4] = cube;
		shapeArray[5] = tetrahedron;
		
		String className;
		for (Shape shape : shapeArray)
		{
			className = shape.getClass().getName();
			System.out.print("Next object in array: " + className + ". ");
			
			switch (className)
			{
				case "Circle": case "Square": case "Triangle":
					System.out.printf("%s%n%s %f%n%n", "It is a 2D shape.", "It's area "
						+ "is:", shape.getArea());
					break;
				case "Sphere": case "Cube": case "Tetrahedron":
					ThreeDimensionalShape ThreeDShape = (ThreeDimensionalShape) shape;
					System.out.printf("%s%n%s %f%n%s %f%n%n", "It is a 3D shape.", "It's area "
						+ "is:", shape.getArea(), "It's volume is:", ThreeDShape.getVolume());
					break;
			}	
		}
   }
}
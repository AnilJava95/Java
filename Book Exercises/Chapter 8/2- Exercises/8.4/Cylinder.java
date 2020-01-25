/*
 * Author's name and email: Anil Erturk, anilerturk1@gmail.com
 * Program description: A cylinder class that has radius, height, get set 
 *  methods and a calculate volume method.
 * Latest version: 13:51 08/03/2019. calculateVolume now doesnt have arguments.
 * Older versions: 02:27 22/07/2017.
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
      {
         this.radius = radius;
      }
      else
      {
         System.out.println("Radius cant be a negative value.");
      }
   }
	
   public void setHeight(int height)
	{
      
      if (height > 0)
      {
         this.height = height;
      }
      else
      {
         System.out.println("Height cant be a negative value.");
      }
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
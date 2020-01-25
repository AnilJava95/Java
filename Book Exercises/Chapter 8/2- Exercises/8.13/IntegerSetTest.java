/*
 * Author's name and email: Michael
 * Program description: Tests class IntegerSet.
 * Latest version: 4:23 PM, 9/6/2019.
 * Older versions: 
 */

public class IntegerSetTest
{
   public static void main(String[] args)
   {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		
		set1.insertElement(0);
		set1.insertElement(1);
		set1.insertElement(2);
		
		set2.insertElement(0);
		set2.insertElement(1);
		set2.insertElement(2);
		
		set3 = set1.union(set2);
		System.out.println(set3.toString());
		System.out.println("");
		
		set3 = set1.intersection(set2);
		System.out.println(set3.toString());
		System.out.println("");
		
		set1.deleteElement(0);
		System.out.println(set1.toString());
		System.out.println("");
		
		System.out.println(set1.isEqualTo(set2));
		System.out.println("");
   }
}
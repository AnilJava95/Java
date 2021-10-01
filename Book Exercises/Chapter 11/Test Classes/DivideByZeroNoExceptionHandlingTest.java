// This is a test class for Fig. 11.2

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michael
 */
public class DivideByZeroNoExceptionHandlingTest
{
	
	public DivideByZeroNoExceptionHandlingTest()
	{
	}
	
	@BeforeClass
	public static void setUpClass()
	{
	}
	
	@AfterClass
	public static void tearDownClass()
	{
	}
	
	@Before
	public void setUp()
	{
	}
	
	@After
	public void tearDown()
	{
	}

	/**
	 * 5 / 2 = 2
	 */
	@Test
	public void testQuotient()
	{
		System.out.println("quotient");
		int numerator = 5;
		int denominator = 2;
		int expResult = 2;
		
		int result = DivideByZeroNoExceptionHandling.quotient(numerator, denominator);
		
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		//fail("The test case is a prototype.");
	}
	
	/**
	 * 10 / 6 = 1
	 */
	@Test
	public void testQuotient2()
	{
		System.out.println("quotient2");
		int numerator = 10;
		int denominator = 6;
		int expResult = 1;
		
		int result = DivideByZeroNoExceptionHandling.quotient(numerator, denominator);
		
		assertEquals(expResult, result);
	}

	/**
	 * 5 / 1 = 5
	 */
	@Test
	public void testQuotient3()
	{
		System.out.println("quotient3");
		int numerator = 5;
		int denominator = 1;
		int expResult = 5;
		
		int result = DivideByZeroNoExceptionHandling.quotient(5, 1);
		
		assertEquals(expResult, result);
	}
}

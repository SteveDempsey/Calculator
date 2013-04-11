/**
 * 
 */
package tests;

import static org.junit.Assert.*;
import ie.gcd.Maths.Calc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Stephen
 *
 */
public class CalcTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link ie.gcd.Maths.Calc#add(int, int)}.
	 */
	@Test
	public void testAdd() {
		Calc c = new Calc();
		assertEquals(5,c.add(2, 3));
		
	}

}

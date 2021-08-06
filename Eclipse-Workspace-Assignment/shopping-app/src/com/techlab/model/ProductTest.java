/**
 * 
 */
package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author nairn
 *
 */
class ProductTest {

	/**
	 * Test method for {@link com.techlab.model.Product#Product(int, java.lang.String, float)}.
	 */
	@Test
	void testProduct() {
		//arrange
		int expectedPid = 1;
		String expectedPname = "Apple";
		double expectedCost = 4000;
		//act 
		Product p = new Product(1,"Apple",4000);
		
		//assert
		
		assertEquals(expectedPid,p.getPid());
		assertEquals(expectedPname,p.getPname());
		assertEquals(expectedCost,p.getCost());
	}

}

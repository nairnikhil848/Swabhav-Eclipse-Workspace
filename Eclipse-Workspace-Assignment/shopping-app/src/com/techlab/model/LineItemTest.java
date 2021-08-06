package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LineItemTest {

	@Test
	void testLineItem() {
		//arrange
		int expectedlid = 1;
		double expectedqty = 200;

		
		//act
		LineItem item = new LineItem(1,200,new Product(1,"Apple",4000));
	
		
		//assert
		assertEquals(expectedlid,item.getLid());
		assertEquals(expectedqty,item.getQty());

		
	}

	@Test
	void testSetQty() {

		//arrange
		double expectedqty = 1000;
		
		//act
		LineItem item = new LineItem(1,200,new Product(1,"Apple",4000));
		item.setQty(1000);
		
		//assert
		assertEquals(expectedqty,item.getQty());
	}

}

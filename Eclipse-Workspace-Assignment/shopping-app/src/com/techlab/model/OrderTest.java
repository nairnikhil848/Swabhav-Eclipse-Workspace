package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class OrderTest {

	@Test
	void testOrder() {
		//arrange
		int expectedid =1 ;
		String expectedDate = "30/2/1999";
		
		//act 
		Order order1 = new Order(1,"30/2/1999");
		
		//assert
		assertEquals(expectedid,order1.getId());
		assertEquals(expectedDate,order1.getDate());
		
		
	}

	@Test
	void testAddItem() {
		//arrange
		List<LineItem> listItems = new ArrayList<LineItem>();
		listItems.add(new LineItem(1,200,new Product(1,"Apple",4000)));
	
		//act
		Order order1 = new Order(1,"30/2/1999");
		order1.addItem(new LineItem(1,200,new Product(1,"Apple",4000)));
		//assert
		assertEquals(listItems,order1.getListItem());
		
		
		
	}

}

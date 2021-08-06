package com.techlab.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CustomerTest {

	@Test
	void testCustomer() {
		//arrange
		int expectedcid = 1;
		String expectedname = "Nikhil";
		
		//act
		Customer cust = new Customer(1,"Nikhil");
		//assert
		assertEquals(expectedcid,cust.getcid());
		assertEquals(expectedname,cust.getName());
	}

	@Test
	void testAddOrder() {
		//arrange
		Order order1 = new Order(1,"30/2/1999");
		order1.addItem(new LineItem(1,200,new Product(1,"Apple",4000)));
		order1.addItem(new LineItem(2,600,new Product(1,"Apple",4000))); //duplicate
		List<Order> ords = new ArrayList<Order>();
		
		List expectedOrderList = ords;
		

		//act
		Customer cust = new Customer(1,"Nikhil");
		ords.add(order1);
		cust.addOrder(ords);
		
		//assert
		assertEquals(expectedOrderList,cust.orders);
		
	}

}

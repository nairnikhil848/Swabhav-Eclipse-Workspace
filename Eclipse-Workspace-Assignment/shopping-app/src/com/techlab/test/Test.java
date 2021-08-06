package com.techlab.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.techlab.model.Customer;
import com.techlab.model.LineItem;
import com.techlab.model.Order;
import com.techlab.model.Product;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Order order1 = new Order(1,"30/2/1999");
		order1.addItem(new LineItem(1,200,new Product(1,"Apple",4000)));
		order1.addItem(new LineItem(2,600,new Product(1,"Apple",4000))); //duplicate
		
		Order order2 = new Order(2,"31/2/1999");
		order2.addItem(new LineItem(1,200,new Product(1,"Apple",4000)));
		order2.addItem(new LineItem(2,430,new Product(2,"Orange",5000)));
		order2.addItem(new LineItem(2,570,new Product(2,"Orange",5000))); //duplicate
		
		List<Order> ords = new ArrayList<Order>();
		ords.add(order1);
		ords.add(order2);
		

		Customer cust = new Customer(1,"Nikhil");
		cust.addOrder(ords);
		
		System.out.println(cust);


	}

}

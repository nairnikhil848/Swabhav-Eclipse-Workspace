package com.techlab.test;

import java.util.ArrayList;

import com.techlab.model.LineItem;

public class LIneItemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList cart = new ArrayList();
		LineItem item1 = new LineItem(1,"Item1",100,10);
		LineItem item2 = new LineItem(1,"Item2",200,20);
		LineItem item3 = new LineItem(1,"Item3",300,30);
		cart.add(item1);
		cart.add(item2);
		cart.add(item3);
		cart.add("ABC");
		printCart(cart);
	}

	private static void printCart(ArrayList cart) {
		// TODO Auto-generated method stub
		double totalCost = 0;
		for(Object item:cart) {
			try {
			LineItem downcasteditem = (LineItem)item;
			downcasteditem.CalculateTotalItemPrice();
			totalCost += downcasteditem.getTotalPrice();
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
			
		}
		System.out.println(totalCost);
	}

}

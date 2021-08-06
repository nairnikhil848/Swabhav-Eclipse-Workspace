package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Item> items;
	
	public ShoppingCart() {
		items = new ArrayList<Item>();
	}
	public void addItem(Item item) {
		items.add(item);
	}
	public void removeItem(Item item) {
		items.remove(item);
	}
	public double totalPrice() {
		double sum = 0;
		for(Item item:items) {
			sum += item.itemPrice();
		}
		
		return sum;
	}
	public List<Item> getList(){
		return items;
	}
	
}	

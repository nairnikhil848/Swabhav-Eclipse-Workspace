package com.techlab.test;

import com.techlab.model.Item;
import com.techlab.model.ShoppingCart;

import ExternalLibraries.Hat;
import ExternalLibraries.HatAdapter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingCart cart = new ShoppingCart();
		
		HatAdapter hadapter = new HatAdapter( new Hat("Marks","Suspenser",1000));
		
		cart.addItem(hadapter);
		printDetails(cart);
	}

	private static void printDetails(ShoppingCart cart) {
		// TODO Auto-generated method stub
		for(Item item:cart.getList()) {
			System.out.println(item.itemName());
			System.out.println(item.itemPrice());
		}
		System.out.println("-----------------------------");
		System.out.println("TotalPrice: "+ cart.totalPrice());
	}
	

}

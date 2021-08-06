package com.techlab.model;

import java.util.ArrayList;
import java.util.List;



public class Order {
	private int oid;
	private String date;
	
	List<LineItem> listItems = new ArrayList<LineItem>();
	
	public Order(int oid,String date) {
		this.oid = oid;
		this.date = date;

	}
	public int getId() {
		return oid;
	}
	public String getDate() {
		return date;
	}
	public void addItem(LineItem Item) {
		for(LineItem list: listItems) {
			if(list.Product.getPid() ==  Item.Product.getPid()){
				list.setQty(list.getQty() + Item.getQty());
				return ;
			}
			
		}
		listItems.add(Item);
	}
	public List getListItem() {
		return listItems;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Order : ");
		str.append(this.oid);
		str.append("\t");
		str.append(this.date);
		str.append("\n");
		str.append(this.listItems);
		str.append("\n");
		return str.toString();
	}
	
}

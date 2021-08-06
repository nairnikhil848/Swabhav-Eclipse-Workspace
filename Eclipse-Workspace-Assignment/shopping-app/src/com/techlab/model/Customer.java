package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private int cid;
	private String cname;
	
	List<Order> orders = new ArrayList<Order>();
	
	public Customer(int cid,String cname) {
		this.cid = cid;
		this.cname = cname;
	}
	public void addOrder(List<Order> orders) {
		this.orders = orders;
	}
	public int getcid() {
		return cid;
	}
	
	public String getName() {
		return cname;
	}
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Customer : ");
		str.append(this.cid);
		str.append("\t");
		str.append(this.cname);
		str.append("\n");
		str.append(this.orders);
		return str.toString();
	}
	
}

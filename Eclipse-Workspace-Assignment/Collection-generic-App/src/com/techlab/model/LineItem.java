package com.techlab.model;

public class LineItem {
	private int id;
	private String name;
	private double unitPrice;
	private int quantity;
	private double totalItemCost;
	
	public LineItem(int id,String name,double unitPrice,int quantity) {
		this.id =id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	public void CalculateTotalItemPrice() {
		this.totalItemCost = this.quantity * this.unitPrice;
	}
	public double getTotalPrice() {
		return this.totalItemCost;
	}
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(this.id);
		str.append("\t");
		str.append(this.name);
		str.append("\t");
		str.append(this.totalItemCost);
		str.append("\t");
		return str.toString();
	}
	
}

package com.techlab.model;

public class Invoice {
	private int no;
	private String name;
	private double amount;
	private double discountPercentage;
	private float GST;
	
	public Invoice(int id,String name,double amount,double discountPercentage) {
		this.no = id;
		this.name = name;
		this.amount = amount;
		this.discountPercentage = discountPercentage;
				
	}
	public int getId() {
		return this.no;
	}
	public String getName() {
		return this.name;
	}
	public double getAmount() {
		return this.amount;
	}
	public double getDiscountPercentage() {
		return this.discountPercentage;
	}
	public double calculateDiscount() {
		return amount*(discountPercentage/100);
		
	}
	public double calculateGST() {
		return (this.amount * 5)/100;
	}
	public double calculateTotalCost() {
		return amount - this.calculateDiscount() + this.calculateGST();
	}
}

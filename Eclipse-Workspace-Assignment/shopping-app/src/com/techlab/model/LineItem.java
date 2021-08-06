package com.techlab.model;

public class LineItem  {
	private int lid;
	private double qty;
	Product Product;
	
	
	public LineItem(int lid,double qty,Product Product) {
		this.lid = lid;
		this.qty = qty;
		this.Product = Product;
	}
	public void setQty(double qty) {
		this.qty = qty;
	}
	public int getLid() {
		return this.lid;
	}
	public double getQty() {
		return this.qty;
	}
	public Product getProduct() {
		return this.Product;
	}
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("LINEITEM: ");
		str.append(this.lid);
		str.append("\t");
		str.append(this.qty);
		str.append("\t");
		str.append("PRODUCT: ");
		str.append(this.Product);
		str.append("\t");
		return str.toString();
	}
	
}

package com.techlab.model;

public class Product {
	private int pid;
	private String pname;
	private float cost;
	
	public Product(int pid,String pname,float cost) {
		this.pid = pid;
		this.pname = pname;
		this.cost = cost;
	}	
	public int getPid() {
		return this.pid;
	}
	public String getPname() {
		return this.pname;
	}
	public float getCost() {
		return this.cost;
	}
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(this.pid);
		str.append("\t");
		str.append(this.pname);
		str.append("\t");
		str.append(this.cost);
		return str.toString();
	}
}

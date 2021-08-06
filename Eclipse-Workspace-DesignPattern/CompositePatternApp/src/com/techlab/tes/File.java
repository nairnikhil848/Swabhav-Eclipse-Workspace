package com.techlab.tes;

public class File implements StorageItem {
	private String name;
	private int size;
	private String type;
	
	public File(String name,int size,String type) {
		this.name = name;
		this.size = size;
		this.type = type;
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("File Name : " +this.name +"\t");
		System.out.print("Size : " +this.size + "\t");
		System.out.println("Type : "+this.type + "\t");
	}
}

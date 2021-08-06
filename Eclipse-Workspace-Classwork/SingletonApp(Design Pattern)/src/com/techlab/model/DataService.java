package com.techlab.model;

public class DataService {
	
	private static DataService bucket = null;
	public DataService() {
		System.out.println("Object is created "+this.hashCode());
	}
	
	public static DataService getInstance() {
		if(bucket == null) {
			bucket =  new DataService();
		}
		return bucket;
	}
	public void doSomething() {
		System.out.println("Work done by "+this.hashCode());
	}
}

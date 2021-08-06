package com.techlab.model;
import java.util.concurrent.locks.ReentrantLock;
public class DataService {
	private static DataService bucket = null;
	private static ReentrantLock key = new ReentrantLock();;

	public DataService() {
		System.out.println("Object is created "+this.hashCode());
	}

	public static DataService getInstance() {
		key.lock();
			if(bucket == null) {
				
				bucket =  new DataService();
				
			}
			key.unlock();
		
		return bucket;

	}
	public void doSomething() {
		System.out.println("Work done by "+this.hashCode());
	}
}

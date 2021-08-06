package com.techlab.test;
import java.util.concurrent.locks.ReentrantLock;

import com.techlab.model.DataService;

public class Test {
	public static void main(String args[]) {
		
		ReentrantLock key = new ReentrantLock();
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				DataService ds1 = DataService.getInstance();
				System.out.println("Thread 1 hashcode "+ds1.hashCode());
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				DataService ds2 = DataService.getInstance();
				System.out.println("Thread 2 hashcode " + ds2.hashCode());
			}
		});

		t1.start();
		t2.start();
	}
}

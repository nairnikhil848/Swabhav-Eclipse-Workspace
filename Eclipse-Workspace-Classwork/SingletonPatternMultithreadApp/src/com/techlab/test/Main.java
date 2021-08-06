package com.techlab.test;

import com.techlab.model.DataService;

public class Main {
	public static void main(String args[]) {
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				DataService ds1 = DataService.getInstance();
				System.out.println(ds1.hashCode());
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				DataService ds2 = DataService.getInstance();
				System.out.println(ds2.hashCode());
			}
		});

		t1.start();
		t2.start();
		
	}
}

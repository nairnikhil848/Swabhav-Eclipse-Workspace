package com.techlab.test;

import com.techlab.mode.Customer;
import com.techlab.mode.INotifier;
import com.techlab.mode.SmsNotifier;
import com.techlab.mode.wrappers.EmailNotifier;
import com.techlab.mode.wrappers.FaceBookNotifier;
import com.techlab.mode.wrappers.WhatsAppNotifier;

public class Test {

	public static void main(String[] args) {

		
		Customer cust = new Customer("Nikhil",12345,"a@gmail.com","b@facebook.com","HI");
		INotifier notifier = new FaceBookNotifier(new EmailNotifier(new WhatsAppNotifier(new SmsNotifier(cust))));
		System.out.println(notifier.sendMessage());
	}

}

package com.techlab.mode.wrappers;

import com.techlab.mode.Customer;
import com.techlab.mode.INotifier;

public class EmailNotifier implements INotifier {

	private INotifier notifier;

	public EmailNotifier(INotifier notifier) {
		this.notifier = notifier;
	}

	@Override
	public String sendMessage() {
		
		return " New Email Notification from "+ notifier.getDetails().getemail() +notifier.getDetails().getMessage() +".\n" + notifier.sendMessage();

	}

	@Override
	public Customer getDetails() {
		return notifier.getDetails();
	}
	
}

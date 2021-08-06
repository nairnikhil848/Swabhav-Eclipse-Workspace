package com.techlab.mode.wrappers;

import com.techlab.mode.Customer;
import com.techlab.mode.INotifier;

public class WhatsAppNotifier implements INotifier {
	private INotifier notifier;

	public WhatsAppNotifier(INotifier notifier) {
		this.notifier = notifier;
	}

	@Override
	public String sendMessage() {
		return " New Whatsapp Notification from "+ notifier.getDetails().getNumber() +notifier.getDetails().getMessage() +".\n" + notifier.sendMessage();


	}
	@Override
	public Customer getDetails() {
		return notifier.getDetails();
	}
}

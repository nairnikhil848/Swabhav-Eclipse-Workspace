package com.techlab.mode.wrappers;

import com.techlab.mode.Customer;
import com.techlab.mode.INotifier;

public class FaceBookNotifier implements INotifier {

	private INotifier notifier;

	public FaceBookNotifier(INotifier notifier) {
		this.notifier = notifier;
	}

	@Override
	public String sendMessage() {
		return " New Facebook Notification from "+ notifier.getDetails().getFacebookId() +notifier.getDetails().getMessage() +".\n" + notifier.sendMessage();


	}
	@Override
	public Customer getDetails() {
		return notifier.getDetails();
	}

}

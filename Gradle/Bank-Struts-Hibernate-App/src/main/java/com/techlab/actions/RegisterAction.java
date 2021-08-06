package com.techlab.actions;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.models.Account;
import com.techlab.services.AccountService;

public class RegisterAction extends ActionSupport implements ModelDriven<Account> {

	@Autowired
	AccountService service;

	private Account acc = new Account();
	private String confirmpassword;

	@Override
	public String execute() throws Exception {
		return this.SUCCESS;
	}

	public String doregister() {
		System.out.println("Confirm Password" + getConfirmpassword());
		System.out.println(acc.getId());
		System.out.println(acc.getName());
		System.out.println(acc.getBalance());
		System.out.println(acc.getPassword());

		if (!validateAccount()) {
			System.out.println("Here");
			return this.ERROR;
		}
		System.out.println("here12");

		if (service.createAccount(acc)) {
			System.out.println("Account Cannot be Created");
			return this.SUCCESS;
		}

		return this.ERROR;
	}

	public boolean validateAccount() {
		if ("".equals(acc.getName())) {
			return false;
		}
		if ("".equals(acc.getPassword())) {
			return false;
		}
		if (acc.getBalance() <= 0) {
			return false;
		}
		if (!(acc.getPassword().equals(this.getConfirmpassword()))) {
			return false;
		}
		return true;

	}

	@Override
	public Account getModel() {
		return acc;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

}

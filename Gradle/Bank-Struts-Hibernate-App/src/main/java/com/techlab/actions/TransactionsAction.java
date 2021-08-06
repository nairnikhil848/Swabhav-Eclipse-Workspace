package com.techlab.actions;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.models.Account;
import com.techlab.models.BankTransaction;
import com.techlab.services.AccountService;
import com.techlab.services.TransactionService;

public class TransactionsAction extends ActionSupport implements SessionAware, ModelDriven<BankTransaction> {

	@Autowired
	AccountService accservice;

	@Autowired
	TransactionService service;
	private BankTransaction transaction = new BankTransaction();
	private SessionMap<String, Object> session;

	@Override
	public String execute() throws Exception {
		System.out.println("Welcome to home");
		Account acc = accservice.getAccount((String) this.getSession().get("id"));
		System.out.println(acc.getName());
		transaction.setAcc(accservice.getAccount((String) this.getSession().get("id")));
		System.out.println((String) this.getSession().get("id"));
		System.out.println(transaction.getAcc().getId());
		return this.SUCCESS;
	}

	public String dotransaction() {
		transaction.setAcc(accservice.getAccount((String) this.getSession().get("id")));
		System.out.println(transaction.getAcc().getId());
		System.out.println(transaction.getAmount());
		System.out.println(transaction.getType());
		System.out.println(transaction.getDate());

		if (service.isTransactionSuccessfull(transaction)) {
			this.getSession().put("balance", accservice.getBalance((String) this.getSession().get("id")));
			return this.SUCCESS;
		}

		return this.ERROR;

	}

	public SessionMap<String, Object> getSession() {
		return session;
	}

	@Override
	public BankTransaction getModel() {
		return getTransaction();
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>) session;
	}

	public BankTransaction getTransaction() {
		return transaction;
	}

	public void setTransaction(BankTransaction transaction) {
		this.transaction = transaction;
	}

}

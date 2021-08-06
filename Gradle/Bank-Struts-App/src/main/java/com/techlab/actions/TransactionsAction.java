package com.techlab.actions;

import java.time.LocalDateTime;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.modelView.AccountHolderView;
import com.techlab.modelView.BankTransactionView;
import com.techlab.services.AccountService;
import com.techlab.services.TransactionService;

public class TransactionsAction extends ActionSupport implements SessionAware, ModelDriven<BankTransactionView> {

	private BankTransactionView transaction = new BankTransactionView();
	private SessionMap<String, Object> session;

	@Override
	public String execute() throws Exception {
		System.out.println("Welcome to home");
		transaction.setId((String) this.getSession().get("id"));
//		System.out.println("Name " + name);
		return this.SUCCESS;
	}

	public String dotransaction() {

		System.out.println(transaction.getId());
		System.out.println(transaction.getAmount());
		System.out.println(transaction.getType());
		transaction.setDate(LocalDateTime.now());
		System.out.println(transaction.getDate());
		TransactionService service = TransactionService.getInstance();

		if (service.isTransactionSuccessfull(transaction)) {
			AccountService accService = AccountService.getInstance();
			this.getSession().put("balance", accService.getBalance(transaction.getId()));
			return this.SUCCESS;
		}

		return this.ERROR;

	}

	public BankTransactionView getTransaction() {
		return transaction;
	}

	public void setTransaction(BankTransactionView transaction) {
		this.transaction = transaction;
	}

	public SessionMap<String, Object> getSession() {
		return session;
	}

	@Override
	public BankTransactionView getModel() {
		return transaction;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>) session;
	}

}

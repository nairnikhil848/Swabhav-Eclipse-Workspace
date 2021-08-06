package com.techlab.actions;

import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.techlab.modelView.BankTransactionView;
import com.techlab.models.BankTransaction;
import com.techlab.services.TransactionService;

public class PassbookAction extends ActionSupport implements SessionAware {

	private SessionMap<String, Object> session;
	private List<BankTransactionView> transactionList;

	@Override
	public String execute() throws Exception {
		TransactionService service = TransactionService.getInstance();

		System.out.println(this.getSession().get("id"));
		String id = (String) this.getSession().get("id");
		setTransactionList(service.getTransactionsList(id));

		this.getSession().put("transactionList", transactionList);
		return this.SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = (SessionMap<String, Object>) session;
	}

	public SessionMap<String, Object> getSession() {
		return session;
	}

	public List<BankTransactionView> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(List<BankTransactionView> transactionList) {
		this.transactionList = transactionList;
	}

}

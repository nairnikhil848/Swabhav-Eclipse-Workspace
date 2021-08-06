package com.techlab.services;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.techlab.modelView.BankTransactionView;
import com.techlab.models.BankTransaction;
import com.techlab.repositories.TransactionRepository;

public class TransactionService {
	private static TransactionService serviceInstance = null;
	private TransactionRepository transactionRepository;

	public static TransactionService getInstance() {
		if (serviceInstance == null) {
			System.out.print("inside new AuthenticationService");
			serviceInstance = new TransactionService();
		}
		return serviceInstance;
	}

	public TransactionService() {
		transactionRepository = new TransactionRepository();
	}

	public List<BankTransactionView> getTransactionsList(String id) {
		List<BankTransactionView> transactionList = new ArrayList<BankTransactionView>();

		List<BankTransaction> list = this.transactionRepository.getTransactionsList(id);
		for (BankTransaction t : list) {
			BankTransactionView trans = new BankTransactionView();
			trans.setId(t.getId());
			trans.setAmount(t.getAmount());
			trans.setDate(t.getDate());
			trans.setType(t.getType());
			transactionList.add(trans);

		}

		return transactionList;
	}

	public boolean isTransactionSuccessfull(BankTransactionView transaction) {
		BankTransaction trans = new BankTransaction(transaction.getId(), transaction.getAmount(), transaction.getType(),
				transaction.getDate());
		return transactionRepository.isTransactionSuccessfull(trans);
	}

}

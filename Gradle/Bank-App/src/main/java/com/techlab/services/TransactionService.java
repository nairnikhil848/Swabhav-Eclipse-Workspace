package com.techlab.services;

import java.util.List;

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

	public List<BankTransaction> getTransactionsList(String id) {
		return this.transactionRepository.getTransactionsList(id);
	}

	public boolean isTransactionSuccessfull(BankTransaction transaction) {
		return transactionRepository.isTransactionSuccessfull(transaction);
	}

}

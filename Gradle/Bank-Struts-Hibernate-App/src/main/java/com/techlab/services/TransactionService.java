package com.techlab.services;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlab.models.BankTransaction;
import com.techlab.repositories.TransactionRepository;

@Service("TransactionService")
public class TransactionService {

	@Autowired
	private TransactionRepository transactionRepository;

	public TransactionService() {
		System.out.println("New TransactionService Created");
	}

	public List<BankTransaction> getTransactionsList(String id) {

		return this.transactionRepository.getTransactionsList(id);
	}

	public boolean isTransactionSuccessfull(BankTransaction transaction) {

		return transactionRepository.isTransactionSuccessfull(transaction);
	}

}

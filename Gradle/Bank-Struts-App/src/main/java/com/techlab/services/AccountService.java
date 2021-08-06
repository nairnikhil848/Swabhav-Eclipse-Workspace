package com.techlab.services;

import com.techlab.modelView.AccountHolderView;
import com.techlab.models.AccountHolder;
import com.techlab.repositories.AccountRepository;

public class AccountService {
	private static AccountService serviceInstance = null;
	private AccountRepository accountRepository;

	public static AccountService getInstance() {
		if (serviceInstance == null) {
			System.out.print("inside new BankMasterService");
			serviceInstance = new AccountService();
		}
		return serviceInstance;
	}

	public AccountService() {
		accountRepository = new AccountRepository();
	}
	
	public boolean createAccount(AccountHolderView account) {
		
		AccountHolder acc = new AccountHolder(account.getName(),account.getBalance(),account.getPassword());
		
		HashPasswordService service = HashPasswordService.getInstance();
		String hashedPassword = service.createHashedPassword(acc.getPassword());
		acc.setPassword(hashedPassword);
		return this.accountRepository.createAccount(acc);
	}
	
	public double getBalance(String id) {
		return accountRepository.getBalance(id);
	}
}

package com.techlab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlab.models.Account;
import com.techlab.repositories.AccountRepository;

@Service("AccountService")
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	public AccountService() {
		System.out.println("New AccountService Created");
	}

	public boolean createAccount(Account account) {

		HashPasswordService service = HashPasswordService.getInstance();
		String hashedPassword = service.createHashedPassword(account.getPassword());
		account.setPassword(hashedPassword);
		return this.accountRepository.createAccount(account);

	}

	public double getBalance(String id) {
		return accountRepository.getBalance(id);
	}

	public Account getAccount(String id) {
		return this.accountRepository.getAccount(id);
	}
}

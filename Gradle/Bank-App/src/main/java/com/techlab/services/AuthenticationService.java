package com.techlab.services;

import com.techlab.models.AccountHolder;
import com.techlab.repositories.AuthenticationRepository;

public class AuthenticationService {
	private static AuthenticationService serviceInstance = null;
	private AuthenticationRepository autenticationRepository;

	public static AuthenticationService getInstance() {
		if (serviceInstance == null) {
			System.out.println("inside new AuthenticationService");
			serviceInstance = new AuthenticationService();
		}
		return serviceInstance;
	}

	public AuthenticationService() {
		autenticationRepository = new AuthenticationRepository();
	}

	public AccountHolder authenticateUser(String name, String password) {

		AccountHolder acc = autenticationRepository.searchUserWithName(name);

		HashPasswordService service = HashPasswordService.getInstance();
		if (service.checkPassword(password, acc.getPassword())) {
			System.out.println("Successful login");
			return acc;
		}
		System.out.println("Password Not Same");
		return null;
	}

}

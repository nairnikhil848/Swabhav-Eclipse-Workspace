package com.techlab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlab.models.Account;
import com.techlab.repositories.AuthenticationRepository;

@Service("AuthenticationService")
public class AuthenticationService {

	@Autowired
	private AuthenticationRepository autenticationRepository;

	public AuthenticationService() {
		System.out.println("New AutenticationService Created");
	}

	public Account authenticateUser(String name, String password) {

		Account acc = autenticationRepository.searchUserWithName(name);

		HashPasswordService service = HashPasswordService.getInstance();
		if (service.checkPassword(password, acc.getPassword())) {
			System.out.println("Successful login");
			return acc;
		}
		System.out.println("Password Not Same");
		return null;
	}

}

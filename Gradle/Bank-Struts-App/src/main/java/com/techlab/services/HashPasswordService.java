package com.techlab.services;

import org.mindrot.jbcrypt.BCrypt;

public class HashPasswordService {

	private static HashPasswordService serviceInstance = null;

	public static HashPasswordService getInstance() {
		if (serviceInstance == null) {
			System.out.println("inside new HashPasswordService");
			serviceInstance = new HashPasswordService();
		}
		return serviceInstance;
	}

	public String createHashedPassword(String password) {
		return BCrypt.hashpw(password, BCrypt.gensalt()).toString();
	}

	public boolean checkPassword(String passwordToCheck, String HashedPassword) {
		return BCrypt.checkpw(passwordToCheck, HashedPassword);
	}
}

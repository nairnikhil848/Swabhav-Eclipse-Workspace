package com.techlab.services;

public class AuthenticationService {
	
	private String username = "admin";
	private String password = "admin";
	
	public boolean isAuthenticated(String username,String password) {
		if(this.username.equals(username) & this.password.equals(password)) {
			return true;
		}
		return false;
	}
}

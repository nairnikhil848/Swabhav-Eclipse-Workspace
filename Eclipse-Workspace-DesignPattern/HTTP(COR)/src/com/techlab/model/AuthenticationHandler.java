package com.techlab.model;

public class AuthenticationHandler extends Handler {

	@Override
	public void check(HttpRequestDto dto) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Authorizing");
		if (!dto.username.equals("admin")) {
			throw new Exception("Username does not match");
		}
		if(!dto.password.equals("admin")) {
			throw new Exception("Password is incorrect");
		}
		this.checkNext(dto);
	}

}

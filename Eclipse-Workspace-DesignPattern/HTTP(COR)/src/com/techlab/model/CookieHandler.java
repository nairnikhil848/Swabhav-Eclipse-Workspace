package com.techlab.model;

public class CookieHandler extends Handler{

	@Override
	public void check(HttpRequestDto dto) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Checking Cookies");
		this.checkNext(dto);
	}

}

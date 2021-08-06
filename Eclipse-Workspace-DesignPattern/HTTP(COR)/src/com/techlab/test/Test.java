package com.techlab.test;

import java.util.ArrayList;
import java.util.List;

import com.techlab.model.AuthenticationHandler;
import com.techlab.model.CompressionHandler;
import com.techlab.model.CookieHandler;
import com.techlab.model.HttpRequestDto;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AuthenticationHandler auth = new AuthenticationHandler();
		CompressionHandler cmp = new CompressionHandler();
		CookieHandler cookie = new CookieHandler();
		
		cookie.setNext(auth);
		auth.setNext(cmp);
		
		List list = new ArrayList();
		list.add("Anything");
		HttpRequestDto dto = new HttpRequestDto();
		dto.username= "admin";
		dto.password = "12345";
		dto.cookies = list;
		
		try {
			cookie.check(dto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getLocalizedMessage());
		}
		
	}

}

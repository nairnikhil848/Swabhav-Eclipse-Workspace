package com.techlab.services;

import org.junit.Test;
import org.mindrot.jbcrypt.BCrypt;

public class HashPasswordServiceTest {

	@Test
	public void test() {
		HashPasswordService service = HashPasswordService.getInstance();
		String pass1 = service.createHashedPassword("1234");
		System.out.println(pass1);

		String pass2 = "123";
		System.out.println(service.createHashedPassword(pass2));
		System.out.println(pass1.equals(pass2));

		System.out.println(BCrypt.checkpw(pass2, pass1));

	}

}

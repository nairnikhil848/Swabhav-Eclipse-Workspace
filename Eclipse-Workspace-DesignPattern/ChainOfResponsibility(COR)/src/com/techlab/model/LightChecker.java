package com.techlab.model;

public class LightChecker extends HomeSecurityChecker {

	@Override
	public void check(HomeStatusDto dto) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Checking Lights");
		if(!dto.lightsoff) {
			throw new Exception("Lights are ON");
		}
		this.checkNext(dto);
	}
	
}

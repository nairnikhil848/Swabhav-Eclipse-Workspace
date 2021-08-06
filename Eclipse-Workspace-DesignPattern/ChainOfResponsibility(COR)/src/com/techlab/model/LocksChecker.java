package com.techlab.model;

public class LocksChecker extends HomeSecurityChecker {
	@Override
	public void check(HomeStatusDto dto) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Checking Locks");
		if(!dto.LocksOn) {
			throw new Exception("Locks are OFF");
		}
		this.checkNext(dto);
	}
}

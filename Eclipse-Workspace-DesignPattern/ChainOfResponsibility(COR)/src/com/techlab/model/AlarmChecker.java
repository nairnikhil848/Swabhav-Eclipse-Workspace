package com.techlab.model;

public class AlarmChecker extends HomeSecurityChecker {
	@Override
	public void check(HomeStatusDto dto) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Checking Lights");
		if(!dto.alarmOn) {
			throw new Exception("Lights are OFF");
		}
		this.checkNext(dto);
	}
}

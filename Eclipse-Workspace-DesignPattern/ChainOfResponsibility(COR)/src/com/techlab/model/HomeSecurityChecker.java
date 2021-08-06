package com.techlab.model;

public abstract class HomeSecurityChecker {
	private HomeSecurityChecker next;
	
	public void setNext(HomeSecurityChecker next) {
		this.next = next;
	}
	public  abstract  void check(HomeStatusDto dto) throws Exception;
	
	protected void checkNext(HomeStatusDto dto) throws Exception {
		if(next!=null) {
			next.check(dto);
		}
	}
}

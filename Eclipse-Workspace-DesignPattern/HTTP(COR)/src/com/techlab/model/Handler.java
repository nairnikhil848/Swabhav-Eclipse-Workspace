package com.techlab.model;

public abstract class Handler {
	private Handler next;
	
	public void setNext(Handler next) {
		this.next = next;
	}
	public  abstract  void check(HttpRequestDto dto) throws Exception;
	
	protected void checkNext(HttpRequestDto dto) throws Exception {
		if(next!=null) {
			next.check(dto);
		}
	}
}

package com.techlab.model;

public class CompressionHandler extends Handler{

	@Override
	public void check(HttpRequestDto dto) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Checking Compression");
		this.checkNext(dto);
	}

}

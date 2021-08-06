package com.techlab.model.individuals;

import com.techlab.model.IDisplay;

public class PTag implements IDisplay{
	private String name;
	private String content;
	
	public PTag(String name,String content) {
		this.name = name;
		
		this.content = content;
	}
	
	
	@Override
	public String display(int count) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		for(int i=0;i<count;i++) {
			str.append("\t");
		}
		str.append("<p class=" +this.name +">"+this.content+"</p>" +"\n");
		return str.toString();
	}
}

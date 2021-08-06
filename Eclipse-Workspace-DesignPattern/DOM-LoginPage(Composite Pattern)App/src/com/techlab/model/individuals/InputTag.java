package com.techlab.model.individuals;

import com.techlab.model.IDisplay;

public class InputTag implements IDisplay{
	private String name;
	private String content;
	
	public InputTag(String name,String content) {
		this.name = name;
		
		this.content = content;
	}
	
	public String display(int count) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		for(int i=0;i<count;i++) {
			str.append("\t");
		}
		str.append("<input class=" +this.name +">"+this.content+"</input>" +"\n");
		return str.toString();
	}
	
}

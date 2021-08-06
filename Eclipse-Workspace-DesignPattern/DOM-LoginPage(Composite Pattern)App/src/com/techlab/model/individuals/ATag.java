package com.techlab.model.individuals;

import com.techlab.model.IDisplay;

public class ATag implements IDisplay {
	private String name;
	private String href;
	private String content;
	
	public ATag(String name,String href,String content) {
		this.name = name;
		this.href = href;
		this.content = content;
	}
	
	@Override
	public String display(int count) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		for(int i=0;i<count;i++) {
			str.append("\t");
		}
		
		str.append("<a class=" +this.name +" href=\""+this.href + "\">"+this.content+"</a>" +"\n");
		return str.toString();
	}

}

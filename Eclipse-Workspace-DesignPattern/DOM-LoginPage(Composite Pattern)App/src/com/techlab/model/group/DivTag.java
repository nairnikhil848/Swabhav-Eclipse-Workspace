package com.techlab.model.group;

import java.util.ArrayList;
import java.util.List;

import com.techlab.model.IDisplay;

public class DivTag implements IDisplay,IGroup{

	
	private List<IDisplay> subTags; 
	
	
	public DivTag() {
	
		subTags = new ArrayList<IDisplay>();
	}
	
	public void addChild(IDisplay item) {
		subTags.add(item);
	}
	
	public String display() {
		return display(0);
	}
	
	@Override
	public String display(int count) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		for(int i=0;i<count;i++) {
			str.append("\t");
		}
		str.append("<div>"+"\n");
		
		for(IDisplay child:subTags) {
			str.append(child.display(count+1));
		}
		for(int i=0;i<count;i++) {
			str.append("\t");
		}
		str.append("</div>"+"\n");
		
	
		return str.toString();
	}
	
	
	
}

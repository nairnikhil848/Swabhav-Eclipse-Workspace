package com.techlab.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.techlab.model.group.DivTag;
import com.techlab.model.group.FormTag;
import com.techlab.model.individuals.ATag;
import com.techlab.model.individuals.Button;
import com.techlab.model.individuals.InputTag;
import com.techlab.model.individuals.LabelTag;
import com.techlab.model.individuals.PTag;

public class Test {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\nairn\\OneDrive\\Desktop\\EMP.html");
		
		FileWriter writer = new FileWriter(file);
		
		FormTag form = new FormTag();
		form.addChild(new PTag("p1","Welcome"));
		
		DivTag div = new DivTag();
		div.addChild(new InputTag("i1","Username"));
		div.addChild(new LabelTag("l1","Username"));
		div.addChild(new InputTag("i2","Password"));
		div.addChild(new LabelTag("l2","Password"));
		div.addChild(new InputTag("i3","Remember Me?"));
		
		div.addChild(new Button("b1","Submit"));
		
		div.addChild(new PTag("p2","Error"));
		div.addChild(new ATag("a1","#","Forgot Password?"));
		
		form.addChild(div);
		
		System.out.println(form.display());
		
		writer.append(form.display());
		writer.close();
		
	}
}

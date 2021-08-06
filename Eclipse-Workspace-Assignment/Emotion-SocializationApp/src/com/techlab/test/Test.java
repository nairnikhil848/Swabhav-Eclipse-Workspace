package com.techlab.test;

import com.techlab.model.IEmotionable;
import com.techlab.model.ISocialization;
import com.techlab.model.Infant;
import com.techlab.model.Man;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man m1 = new Man();
		printInfoEmo(m1);
		printInfoSoc(m1);
		
		Infant i1 = new Infant();
		printInfoEmo(i1);
	}

	private static void printInfoEmo(IEmotionable emotion) {
		// TODO Auto-generated method stub
		emotion.cry();
		emotion.laugh();
	}
	private static void printInfoSoc(ISocialization social) {
		social.depart();
		social.wish();
	}
	
}

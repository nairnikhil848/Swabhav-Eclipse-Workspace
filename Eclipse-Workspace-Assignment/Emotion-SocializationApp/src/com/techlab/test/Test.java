package com.techlab.test;

import com.techlab.model.IEmotionable;
import com.techlab.model.ISocialization;
import com.techlab.model.Infant;
import com.techlab.model.Man;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man m1 = new Man();
		printInfo(m1,m1);
		Infant i1 = new Infant();
		printInfo(i1,i1);
	}

	private static void printInfo(IEmotionable emotion,ISocialization social) {
		// TODO Auto-generated method stub
		emotion.cry();
		social.depart();
		social.wish();
		emotion.laugh();
	}
	
}

package com.techlab.test;

import java.awt.Image;

import com.techlab.model.ImageProxy;
import com.techlab.model.RealImage;

public class Test {
	public static void main(String args[]) {
		
		ImageProxy img = new ImageProxy("IMAGE1");
		img.display();
		
		
		RealImage rimg = new RealImage("IMAGE1");
		rimg.display();
	}
}	

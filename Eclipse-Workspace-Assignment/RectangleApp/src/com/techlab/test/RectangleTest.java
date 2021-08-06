package com.techlab.test;


import com.techlab.model.Rectangle;
import com.techlab.model.RectangleConstructor;
import com.tehlab.thicknessenum.Thickness;


public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleConstructor rect1 = new RectangleConstructor(15,20,Thickness.HIGH);
		RectangleConstructor rect2 = new RectangleConstructor(26,21);
		RectangleConstructor[] rectArr = new RectangleConstructor[3];
//		printInfo(rect1);
//		printInfo(rect2);
		rectArr[0] = rect1;
		rectArr[1] = rect2;
		rectArr[2] = new RectangleConstructor(27,30,Thickness.MEDIUM);
		printRectInfo(rectArr);
//		rect.setHeight(-2);
//		rect.setWidth(106);
//		printInfo(rect);
		

		
	}
	private static void printRectInfo(RectangleConstructor[] rect) {
//		for(int i=0; i<rect.length; i++) {
//			 printInfo(rect[i]);
//	         System.out.println("Object created at "+rect[i].hashCode());
//	      }
		for (RectangleConstructor rectangle: rect) 
		{ 
		    printInfo(rectangle);
		    System.out.println("Object created at "+rectangle.hashCode());
		}
	}

	private static void printInfo(RectangleConstructor rect) {
		// TODO Auto-generated method stub
		System.out.println("Width of the Rectangle is "+rect.getWidth());
		System.out.println("Height of the Rectangle is "+rect.getHeight());
		System.out.println("Area of the Rectangle is "+rect.calculateArea());
		System.out.println("Thickness of the Rectangle is "+rect.getThickness());
	}


}

package com.techlab.test;

import com.techlab.model.IShape;
import com.techlab.model.Rectangle;
import com.techlab.model.Square;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle(200, 100);
		shouldNotChangeWidthIfHeightIsModified(rect);
		Square square = new Square(100);
		//int beforeWidth = square.getWidth();
		//square.setWidth(square.getWidth()+100);
		shouldNotChangeWidthIfHeightIsModified(square);
	}

	private static void shouldNotChangeWidthIfHeightIsModified(IShape shape) {
		System.out.println("Area: " + shape.calculateArea());

}
}

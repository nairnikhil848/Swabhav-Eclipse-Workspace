package com.techlab;

public abstract class Shape {
	   abstract void drawShape();
	   abstract void addVertices();
	   abstract void deleteShape();

	   //template method
	   public final void play(){

		   drawShape();

		   addVertices();

		   deleteShape();
	   }
	      
}

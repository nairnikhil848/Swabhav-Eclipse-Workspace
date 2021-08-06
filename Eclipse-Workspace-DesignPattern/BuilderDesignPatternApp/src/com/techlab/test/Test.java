package com.techlab.test;

import com.techlab.model.Meal;
import com.techlab.model.MealBuilder;

public class Test {
	   public static void main(String[] args) {
		   
		      MealBuilder mealBuilder = new MealBuilder();

		      Meal vegMeal = mealBuilder.prepareVegMeal();
		      System.out.println("Veg Meal");
		      vegMeal.showItems();
		      System.out.println("Total Cost: " + vegMeal.getCost());

		      Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		      System.out.println("\n\nNon-Veg Meal");
		      nonVegMeal.showItems();
		      System.out.println("Total Cost: " + nonVegMeal.getCost());
		   }
}

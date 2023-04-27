package com.app.Fruits;

public class Apple extends Fruit {

	
	public Apple(String name, double weight, String color) {
		super(name, weight, color);
		// TODO Auto-generated constructor stub
	}

	public String test() {
		
		return  "sweet n sour";
	}
	
	public void jam() {
		
		System.out.println(getName()+" "+"Making jam!");
	
	}
	
}

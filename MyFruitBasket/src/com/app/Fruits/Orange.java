package com.app.Fruits;

public class Orange extends Fruit {

	public Orange(String name, double weight, String color) {
		super(name, weight, color);
		// TODO Auto-generated constructor stub
	}
	
	
	public String test() {
		
		return  "sour";

	}
	
	public void juice() {
		
		System.out.println(getName()+" "+getWeight()+" "+"Extracting juice!");
	}

}

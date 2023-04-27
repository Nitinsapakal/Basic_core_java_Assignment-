package com.app.Fruits;

public class Mango extends Fruit {

	public Mango(String name, double weight, String color) {
		super(name, weight, color);
		// TODO Auto-generated constructor stub
	}

	public String test() {
		
		return  "sweet";

	}
	
	public void pulp() {
		
		
		System.out.println(getName()+" "+getColor()+" "+"Creating pulp!");
		
	}

}

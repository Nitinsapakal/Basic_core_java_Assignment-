package com.app.Fruits;

public abstract class Fruit {
	
	private String name;
	private double Weight;
	private String color;
	
	private boolean fresh;
	
	
	public Fruit(String name, double weight, String color) {
		super();
		this.name = name;
		Weight = weight;
		this.color = color;
		this.fresh=true;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getWeight() {
		return Weight;
	}

	public void setWeight(double weight) {
		Weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFresh() {
		return fresh;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}
	
	public abstract String test();

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", Weight=" + Weight + ", color=" + color + "]";
	}
	
	
	
}

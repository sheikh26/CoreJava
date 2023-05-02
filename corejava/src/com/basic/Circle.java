package com.basic;

public class Circle extends Shape {
	int radius;

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double area() {
		
		return 3.14* radius* radius;
	}
	
	
	

}

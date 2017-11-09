package org.itstep.model.impl;

import org.itstep.model.Shape;

public class Square implements Shape{

	private int radius;
	
	@Override
	public void printArea() {
		System.out.println(Math.PI*radius*radius);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	
}

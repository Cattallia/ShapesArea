package org.itstep;

import org.itstep.model.impl.Circle;

public class AppRunner {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(20);
		circle.printArea();

		Circle circle2 = new Circle();
		circle2.setRadius(15);
		circle2.printArea();
	}

}
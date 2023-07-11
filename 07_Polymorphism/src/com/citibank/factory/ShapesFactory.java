package com.citibank.factory;

import com.citibank.domain.Circle;
import com.citibank.domain.Line;
import com.citibank.domain.Shapes;
import com.citibank.domain.Triangle;

public class ShapesFactory {
	public Shapes createShape(int shapeChoice) {
		switch (shapeChoice) {
		case 1:
			return new Circle();
		case 2:
			return new Triangle();
		case 3:
			return new Line();
		default:
			//return new Shapes();
			return null;
		}
	}
}

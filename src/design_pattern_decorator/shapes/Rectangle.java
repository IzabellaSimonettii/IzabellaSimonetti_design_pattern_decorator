package design_pattern_decorator.shapes;

import design_pattern_decorator.interfaces.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Shape: Retangulo");
	}
}

package design_pattern_decorator.decotators;

import design_pattern_decorator.interfaces.Shape;

public abstract class ShapeDecorator implements Shape {

	protected Shape decoratedShape;

	public ShapeDecorator(Shape decoratedShape) {
		super();
		this.decoratedShape = decoratedShape;
	}

}

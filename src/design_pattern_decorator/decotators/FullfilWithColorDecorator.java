package design_pattern_decorator.decotators;

import design_pattern_decorator.enums.FullfilColors;
import design_pattern_decorator.interfaces.Shape;

public class FullfilWithColorDecorator extends ShapeDecorator {

	protected FullfilColors color;

	public FullfilWithColorDecorator(Shape decoratedShape) {
		super(decoratedShape);
		int index = (int) (Math.random() * (3 - 0));
		this.color = FullfilColors.values()[index];
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.println("A cor de preenchimento é " + color.getDescriptionFullfilColors());
	}
}

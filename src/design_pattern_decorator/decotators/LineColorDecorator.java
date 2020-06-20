package design_pattern_decorator.decotators;

import design_pattern_decorator.enums.LineColors;
import design_pattern_decorator.interfaces.Shape;

public class LineColorDecorator extends ShapeDecorator {
	protected LineColors color;

	public LineColorDecorator(Shape decoratedShape) {
		super(decoratedShape);
		int index = (int) (Math.random() * (3 - 0));
		this.color = LineColors.values()[index];
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.println("A cor da linha é " + color.getDescriptionLineColors());
	}

}

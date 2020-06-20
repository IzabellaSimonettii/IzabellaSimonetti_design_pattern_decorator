package design_pattern_decorator;

import design_pattern_decorator.decotators.FullfilWithColorDecorator;
import design_pattern_decorator.decotators.LineColorDecorator;
import design_pattern_decorator.interfaces.Shape;
import design_pattern_decorator.shapes.Circle;
import design_pattern_decorator.shapes.Rectangle;
import design_pattern_decorator.shapes.Square;

public class DecoratorPatternMain {

	public static void main(String[] args) {

		Shape circle = new LineColorDecorator(new FullfilWithColorDecorator(new Circle()));

		Shape rectangle = new LineColorDecorator(new FullfilWithColorDecorator(new Rectangle()));
		
		Shape square = new LineColorDecorator(new FullfilWithColorDecorator(new Square()));

		
		circle.draw();
		System.out.println("=============================================");
		rectangle.draw();
		System.out.println("=============================================");
		square.draw();

	}
}

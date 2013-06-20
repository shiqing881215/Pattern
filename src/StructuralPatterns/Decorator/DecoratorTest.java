package StructuralPatterns.Decorator;

public class DecoratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Window window = new VerticalDecorator(new HorizontalDecorator(new SimpleWindow()));
		System.out.print(window.getDescription());
	}

}

package CreationalPatterns.AbstractFactory;

public class Circle extends Shape {

	public Circle(String name) {
		super(name);
	}

	@Override
	public void draw() {
		System.out.println("I'm drawing a circle.");
	}

	@Override
	public void erase() {
		System.out.println("I'm erasing a circle.");
	}

}

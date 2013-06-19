package CreationalPatterns.AbstractFactory;

public class Square extends Shape {

	public Square(String name) {
		super(name);
	}

	@Override
	public void draw() {
		System.out.println("I'm drawing a square.");
	}

	@Override
	public void erase() {
		System.out.println("I'm erasing a square.");
	}

}

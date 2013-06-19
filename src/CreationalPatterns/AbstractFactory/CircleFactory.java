package CreationalPatterns.AbstractFactory;

public class CircleFactory extends AbstractFactory {

	@Override
	public Shape createShape() {
		return new Circle("circle");
	}

}

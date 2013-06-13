package AbstractFactory;

public class SquareFactory extends AbstractFactory {

	@Override
	public Shape createShape() {
		return new Square("square");
	}

}

package BehaviorPatterns.Visitor;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car = new Car();
		car.accept(new CarElementPrintVisitor());
		car.accept(new CarElementDoVisitor());
	}

}

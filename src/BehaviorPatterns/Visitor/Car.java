package BehaviorPatterns.Visitor;

public class Car implements CarElement {
	CarElement[] elements;

	public Car() {
		this.elements = new CarElement[] {new Wheel("Front left"), new Wheel("Front right"), new Wheel("Back left"), new Wheel("Back right"), new Engine(), new Body()};
	}
	
	@Override
	public void accept(CarElementVisitor carElementVisitor) {
		for (CarElement ele : elements) {
			ele.accept(carElementVisitor);
		}
		carElementVisitor.visit(this);
	}

}

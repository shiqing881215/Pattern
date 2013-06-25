package BehaviorPatterns.Visitor;

/**
 * Concrete visitor, do different things on each part of system.
 * This is the advantage of visitor pattern, when we want to add a new virtual function.
 * We don't need to change the struture of the system.
 * We can still add all kinds of concrete visitor for this car element
 * 
 * @author shiqing
 *
 */
public class CarElementPrintVisitor implements CarElementVisitor {

	@Override
	public void visit(Wheel wheel) {
		System.out.println("Visiting " + wheel.getName() + " wheel");
	}

	@Override
	public void visit(Engine engine) {
		System.out.println("Visiting engine");
	}

	@Override
	public void visit(Body body) {
		System.out.println("Visiting body");
	}

	@Override
	public void visit(Car car) {
		System.out.println("Visiting car");
	}

}

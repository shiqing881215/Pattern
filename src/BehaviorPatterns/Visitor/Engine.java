package BehaviorPatterns.Visitor;

public class Engine implements CarElement {

	@Override
	public void accept(CarElementVisitor carElementVisitor) {
		carElementVisitor.visit(this);
	}

}

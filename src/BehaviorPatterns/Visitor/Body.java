package BehaviorPatterns.Visitor;

public class Body implements CarElement {

	@Override
	public void accept(CarElementVisitor carElementVisitor) {
		carElementVisitor.visit(this);
	}

}

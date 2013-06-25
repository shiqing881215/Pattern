package BehaviorPatterns.Visitor;

public class Wheel implements CarElement {

	private String name;
	
	public Wheel(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public void accept(CarElementVisitor carElementVisitor) {
		carElementVisitor.visit(this);
	}

}

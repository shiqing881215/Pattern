package CreationalPatterns.AbstractFactory;

public abstract class Shape {
	private String name;
	
	protected String getName() {
		return name;
	}
	
	public Shape(String name) {
		this.name = name;
	}
	
	public abstract void draw();
	public abstract void erase();
	
}

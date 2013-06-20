package StructuralPatterns.Decorator;

/**
 * Java Design Patterns suggest that Decorators should be 
 * abstract classes and the concrete implementation should be derived from them.
 * 
 * http://www.allapplabs.com/java_design_patterns/decorator_pattern.htm
 * 
 * Implements window interface to indicate what class it should decorate
 * @author qshi
 *
 */
public abstract class Decorator implements Window{
	protected Window decoratedWindow;
	public Decorator(Window decoratedwWindow) {
		this.decoratedWindow = decoratedwWindow;
	}
	

	public void draw() {
		decoratedWindow.draw();
	}
	
	public String getDescription() {
		return decoratedWindow.getDescription();
	}
}

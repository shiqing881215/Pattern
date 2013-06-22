package StructuralPatterns.Decorator;

/**
 * For the overridden methods are all decorated methods
 * @author qshi
 *
 */
public class VerticalDecorator extends Decorator{

	public VerticalDecorator(Window decoratedwWindow) {
		super(decoratedwWindow);
	}

	@Override
	public void draw() {
		super.draw();
		drawVertical();
	}

	@Override
	public String getDescription() {
		return super.getDescription() + "including vertical scroller";
	}
	
	public void drawVertical() {
		// draw some vertical things
	}

}

package StructuralPatterns.Decorator;

public class HorizontalDecorator extends Decorator {

	public HorizontalDecorator(Window decoratedwWindow) {
		super(decoratedwWindow);
	}

	@Override
	public void draw() {
		super.draw();
		drawHorizontal();
	}

	@Override
	public String getDescription() {
		return super.getDescription() + "including horizontal scroller";
	}
	
	public void drawHorizontal() {
		// draw some horizontal things
	}
}

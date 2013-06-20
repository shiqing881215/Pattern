package StructuralPatterns.Decorator;

/**
 * This is the base class needed to be decorated
 * @author qshi
 *
 */
public class SimpleWindow implements Window {

	@Override
	public void draw() {
		// Draw something here
	}

	@Override
	public String getDescription() {
		return "Simple window";
	}

}

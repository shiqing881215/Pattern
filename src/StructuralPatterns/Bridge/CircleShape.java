package StructuralPatterns.Bridge;


public class CircleShape extends Shape {
	private double x,y,radius;
	
	public CircleShape(DrawingAPI drawingAPI, double x, double y, double radius) {
		super(drawingAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		drawingAPI.drawCircle(x, y, radius);
	}

	@Override
	public void resize(double percentage) {
		radius *= percentage;
	}

}

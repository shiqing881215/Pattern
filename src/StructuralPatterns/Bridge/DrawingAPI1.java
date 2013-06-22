package StructuralPatterns.Bridge;

public class DrawingAPI1 implements DrawingAPI {

	@Override
	public void drawCircle(double x, double y, double radius) {
		System.out.println("API1: x=" +x+ " y=" +y+ " r=" +radius);
	}
}

package StructuralPatterns.Bridge;

public class DrawingAPI2 implements DrawingAPI {

	@Override
	public void drawCircle(double x, double y, double radius) {
		System.out.println("API2: x=" +x+ " y=" +y+ " r=" +radius);
	}

}

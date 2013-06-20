package StructuralPatterns.Bridge;

/**
 * The Bridge Pattern is used to separate out the interface from its implementation. 
 * Doing this gives the flexibility so that both can vary independently.
 * 
 * Core idea :  interface, abstraction, implementation
 * 
 * decouple an abstraction from its implementation so that the two can vary independently
 * 
 * http://www.allapplabs.com/java_design_patterns/bridge_pattern.htm
 * @author qshi
 *
 */
public class BridgePattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape shape1 = new CircleShape(new DrawingAPI1(),1,2,3);
		Shape shape2 = new CircleShape(new DrawingAPI2(),5,6,7);
		
		shape1.resize(2);
		shape1.draw();
		
		shape2.resize(2);
		shape2.draw();
	}

}

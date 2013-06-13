package AbstractFactory;

/**
 * 
 * @author qshi
 *
 * Abstract factory method
 * include the abstract create method, return the abstract product class
 * In the concrete classes extending this class will override this method
 * and return the concrete product class 
 *  
 */
public abstract class AbstractFactory {
	public abstract Shape createShape();
	
	protected void saySomething() {
		Shape shape = createShape();
		System.out.println(shape.getName());
		shape.draw();
		shape.erase();
	}
}

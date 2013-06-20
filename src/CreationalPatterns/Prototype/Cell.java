package CreationalPatterns.Prototype;

/**
 * Create the new one by using Object.clone method
 * If the cost of creating a new object is large 
 * and creation is resource intensive, we clone the object.
 * 
 * http://www.allapplabs.com/java_design_patterns/prototype_pattern.htm
 * @author qshi
 *
 */
public class Cell implements Cloneable {
	private String message;
	
	public Cell(String message) {
		this.message = message;
	}
	
	public void say() {
		System.out.println(message);
	}
	
	public Object split() {
		try {
			return super.clone();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

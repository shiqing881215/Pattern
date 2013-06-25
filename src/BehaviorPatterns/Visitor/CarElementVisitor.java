package BehaviorPatterns.Visitor;

/**
 * Provide the interface for each part in the system
 * 
 * Visitor design pattern is a way of separating an algorithm from an object structure on which it operates. 
 * A practical result of this separation is the ability to add new operations to existing object structures without modifying those structures.
 * 
 * http://en.wikipedia.org/wiki/Visitor_pattern
 * 
 * @author shiqing
 *
 */
public interface CarElementVisitor {
	public void visit(Wheel wheel);
	public void visit(Engine engine);
	public void visit(Body body);
	public void visit(Car car);
}

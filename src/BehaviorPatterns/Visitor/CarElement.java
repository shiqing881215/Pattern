package BehaviorPatterns.Visitor;

/**
 * Provide the interface to visitor, through this we can call the method in interface on each part in system
 * @author shiqing
 *
 */
public interface CarElement {
	public void accept(CarElementVisitor carElementVisitor);
}

package BehaviorPatterns.Strategy;

/**
 * Strategy interface with execute method.
 * Different algorithm class implements this execute method in their own ways.
 * 
 * http://en.wikipedia.org/wiki/Strategy_pattern
 * 
 * @author shiqing
 *
 */
public interface Strategy {
	public int execute(int x, int y);
}

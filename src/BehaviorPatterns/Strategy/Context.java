package BehaviorPatterns.Strategy;

/**
 * Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable
 * System choose which algorithm to use during the runtime.
 * @author shiqing
 *
 */
public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int execute(int x, int y) {
		return this.strategy.execute(x, y);
	}
}

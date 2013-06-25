package BehaviorPatterns.Strategy;

public class Multiply implements Strategy {

	@Override
	public int execute(int x, int y) {
		return x*y;
	}

}

package BehaviorPatterns.Strategy;

public class Add implements Strategy {

	@Override
	public int execute(int x, int y) {
		return x+y;
	}

}

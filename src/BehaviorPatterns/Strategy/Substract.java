package BehaviorPatterns.Strategy;

public class Substract implements Strategy {

	@Override
	public int execute(int x, int y) {
		return x-y;
	}

}

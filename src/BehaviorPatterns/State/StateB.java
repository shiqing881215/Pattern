package BehaviorPatterns.State;

public class StateB implements State {
	private int count = 0;
	
	@Override
	public void writeName(StateContext STATE_CONTEXT, String NAME) {
		System.out.println(NAME.toUpperCase());
		// This line changes the state
		if (++count > 1) {
			STATE_CONTEXT.setState(new StateA());
		}
	}
	
}

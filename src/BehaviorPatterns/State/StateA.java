package BehaviorPatterns.State;

public class StateA implements State {

	@Override
	public void writeName(StateContext STATE_CONTEXT, String NAME) {
		System.out.println(NAME.toLowerCase());
		// This line changes the state
		STATE_CONTEXT.setState(new StateB());
	}

}

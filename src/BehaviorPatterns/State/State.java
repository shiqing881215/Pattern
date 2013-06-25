package BehaviorPatterns.State;

/**
 * State interface
 * StateContext changes its behavior based on this one
 * @author shiqing
 *
 */
public interface State {
	public void writeName(StateContext STATE_CONTEXT, String NAME);
}

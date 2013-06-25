package BehaviorPatterns.State;

/**
 * Allow an object to alter its behavior when its internal state changes.
 * StateContext class has a state inside object.
 * When this state object changes, this StateObject writeName method also changes.
 * 
 * http://en.wikipedia.org/wiki/State_pattern
 * 
 * The State pattern allows an object to change its behavior when its internal state changes. 
 * This pattern can be observed in a vending machine. 
 * Vending machines have states based on the inventory, amount of currency deposited, the ability to make change, the item selected, etc. 
 * When currency is deposited and a selection is made, 
 * a vending machine will either deliver a product and no change, deliver a product and change, deliver no product due to insufficient currency on deposit, or deliver no product due to inventory depletion.
 * 
 * 
 * @author shiqing
 *
 */
public class StateContext {
	private State state;
	
	public StateContext() {
		state = new StateA();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void writeName(String name) {
		state.writeName(this, name);
	}
}

package BehaviorPatterns.Memento;

/**
 * This pattern is used to restore an object to its previous state (undo via rollback).
 * 
 * This pattern is implemented by two classes --- Originator and Caretaker
 * Caretaker asks Originator for Memento object which store the previous information of Originator
 * 
 * If originator changes other object, this pattern doesn't work. This pattern is suitable for single object change and rollback
 * 
 * http://en.wikipedia.org/wiki/Memento_pattern
 * 
 * @author shiqing
 *
 */
public class Originator {
	private String state;
	// Addtion to state, this originator should also have some other information which is not included in the state
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		System.out.println("Originator: setting state to:" + state);
		this.state = state;
	}
	
	public Memento saveToMemento(){
		System.out.println("Saving state to memento.");
		return new Memento(state);
	}
	
	public void restoreFromMemento(Memento memento) {
		System.out.println("Restoring state from memento:" + memento.state);
		this.state = memento.getStoredState();
	}
	
	/**
	 * This class is used to restore previous information
	 * @author shiqing
	 *
	 */
	public static class Memento {
		private final String state;
		
		public Memento(String state){
			this.state = state;
		}
		
		public String getStoredState() {
			return state;
		}
	}
}

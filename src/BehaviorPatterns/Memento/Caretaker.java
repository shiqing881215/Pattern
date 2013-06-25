package BehaviorPatterns.Memento;

import java.util.ArrayList;

import BehaviorPatterns.Memento.Originator.Memento;

public class Caretaker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Memento> historyStates = new ArrayList<Memento>();
		
		Originator originator = new Originator();
		originator.setState("1");
		originator.setState("2");
		historyStates.add(originator.saveToMemento());
		originator.setState("3");
		historyStates.add(originator.saveToMemento());
		originator.setState("4");
		historyStates.add(originator.saveToMemento());
		
		originator.restoreFromMemento(historyStates.get(0));
		System.out.println(originator.getState());
	}

}

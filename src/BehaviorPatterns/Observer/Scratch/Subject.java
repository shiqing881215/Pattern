package BehaviorPatterns.Observer.Scratch;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<MyObserver> observers;
	
	public Subject() {
		observers = new ArrayList<MyObserver>();
	}
	
	public void notifyObservers() {
		for (MyObserver observer : observers) {
			observer.update();
		}
	}
	
	public void addObserver(MyObserver observer) {
		observers.add(observer);
	}
	
	public void removeObserver(MyObserver observer) {
		observers.remove(observer);
	}
}

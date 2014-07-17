package BehaviorPatterns.Observer.Scratch;

public class Test {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		MyObserver o1 = new ConcreteObserver1();
		MyObserver o2 = new ConcreteObserver2();
		
		subject.addObserver(o1);
		subject.addObserver(o2);
		
		subject.notifyObservers();
	}
}

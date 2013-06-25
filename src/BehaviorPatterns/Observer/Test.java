package BehaviorPatterns.Observer;


/**
 * Observe pattern is widly used.
 * Here we have the eventSource to define what and when kind of event to be observed.
 * Then we add the observer.
 * When such kind of event happens, we notify the observer, and observer call itself update method to handle it.
 * 
 * @author shiqing
 *
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("Enter text...");
		
		// Create an eventsource to hear system stdin
		final EventSource eventSource = new EventSource();
		
		// Create an observer to handler this stdin
		final ResponseHanlder responseHandler = new ResponseHanlder();
		
		// Add the observer to the eventsource
		eventSource.addObserver(responseHandler);
		
		Thread thread = new Thread(eventSource);
		
		thread.start();
	}
}

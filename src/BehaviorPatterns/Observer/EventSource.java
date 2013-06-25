package BehaviorPatterns.Observer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Observable;

/**
 * Extends observable, so that can add observer to this class
 * @author shiqing
 *
 */
public class EventSource extends Observable implements Runnable {

	@Override
	public void run() {
		try {
			final InputStreamReader isr = new InputStreamReader(System.in);
			final BufferedReader br = new BufferedReader(isr);
			while (true) {
				String response = br.readLine();
				// This will invoke the update method in observer!!!!
				notifyObservers(response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package BehaviorPatterns.Observer;

import java.util.Observable;
import java.util.Observer;

public class ResponseHanlder implements Observer {
	private String response;
	
	/**
	 * Obj is the object which is being observerd.
	 * arg is the argument with it.
	 */
	@Override
	public void update(Observable obj, Object arg) {
		if (arg instanceof String) {
			response = (String) arg;
			System.out.println("Receive response : " + response);
		}
	}

}

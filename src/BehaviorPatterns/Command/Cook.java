package BehaviorPatterns.Command;

import java.util.ArrayList;

public class Cook {
	ArrayList<Waiter> waiters;
	
	public Cook() {
		waiters = new ArrayList<Waiter>();
	}
	
	/**
	 * Cook the food based on the order, and the cook also needs to know which waiter to deliver the finished food
	 * We should do something about the waiter --- to identify which waiter should this ready food be delivered.
	 * But it's not the command pattern part, so just ignore it.
	 * 
	 * Also food is really made here, in the real program we can change the logic here based on the different order, which is command
	 * and in this way, we decouple the client and implementation.
	 * 
	 * @param order
	 * @param waiter
	 * @return
	 */
	public Food makeFood(Order order, Waiter waiter) {
		Food food = new Food(order);
		return food;
	}
}

package BehaviorPatterns.Command;

import java.util.ArrayList;

/**
 * A waiter is associated with multiple customers and multiple orders
 * Also waiter also need to server ready food from cook.
 * @author shiqing
 *
 */
public class Waiter {
	ArrayList<Order> orders;
	
	public Waiter() {
		orders = new ArrayList<Order>();
	}
	
	/**
	 * Get food from cook.
	 * @param order
	 * @return
	 */
	public Food takeOrder(Order order) {
		Cook cook = new Cook();
		Food food = cook.makeFood(order, this);
		return food;
	}
	
	/*
	 * Here we just ignore the server food to customer part.
	 * Because this is not the part of command pattern.
	 */
}

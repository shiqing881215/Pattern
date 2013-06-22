package BehaviorPatterns.Command;

/**
 * This is the command which comes from the client(customer)
 * 
 * This is another of the data-driven pattern. 
 * The client invokes a particular module using a command. 
 * The client passes a request, this request gets propagated as a command. 
 * The command request maps to particular modules. According to the command, a module is invoked. 
 * 
 * http://www.allapplabs.com/java_design_patterns/command_pattern.htm
 * 
 * 
 * Another good example is 
 * Light and switch --- we can have the command to turn on/off the light, And light to receive such kind of command from switch to do the real action
 * 
 * Core idea : 
 * client ---->  receiver  ------>  implementation     LOOSE COUPLING!
 * 
 * @author shiqing
 *
 */
public class Order {
	private String command; // what the customer wants
	private Customer customer; // which customer does this order
	
	public Order(String command, Customer customer) {
		super();
		this.command = command;
		this.customer = customer;
	}
}

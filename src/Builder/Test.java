package Builder;

public class Test {
	public static void main(String[] args) {
		// If you add a new field to pizza, it's very easy to add something here.
		Pizza pizza = (new Pizza.Builder(12))
							    .cheeze(true)
							    .pepperoni(true)
							    .bacon(true)
							    .build();
		pizza.saySomething();
	}
}

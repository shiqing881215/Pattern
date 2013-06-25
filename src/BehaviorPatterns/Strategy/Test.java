package BehaviorPatterns.Strategy;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Context context1 = new Context(new Add());
		System.out.println(context1.execute(2, 3));
		
		Context context2 = new Context(new Substract());
		System.out.println(context2.execute(2, 3));
		
		Context context3 = new Context(new Multiply());
		System.out.println(context3.execute(2, 3));
	}

}

package AbstractFactory;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SquareFactory sf = new SquareFactory();
		sf.saySomething();
		CircleFactory cf = new CircleFactory();
		cf.saySomething();
	}

}

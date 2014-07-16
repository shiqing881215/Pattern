package CreationalPatterns.Singleton;

public class DoubleCheckedThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t1 = new TestThread();
		Thread t2 = new TestThread();
		Thread t3 = new TestThread();
		Thread t4 = new TestThread();
		Thread t5 = new TestThread();
		Thread t6 = new TestThread();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}

}

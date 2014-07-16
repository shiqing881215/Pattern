package CreationalPatterns.Singleton;

/**
 * Test thread to get the single instance
 * 
 * @author shiqing
 *
 */
public class TestThread extends Thread {
	@Override
	public void start() {
		DoubleCheckedLocking dcl = DoubleCheckedLocking.getInstance();
		System.out.println(dcl.hashCode());
	}
}

package CreationalPatterns.Singleton;

/**
 * Double checked locking
 * This is only used for the multithread singleton.
 * 
 * @author shiqing
 *
 */
public class DoubleCheckedLocking {
	private static DoubleCheckedLocking dcl;
	private String name;
	
	private DoubleCheckedLocking() {};
	
	public static DoubleCheckedLocking getInstance() {
		if (dcl == null) {
			doSync();
		}
		return dcl; 
	}
	
	private synchronized static void doSync() {
		// Need to do the double check here also, because multiple thread may already
		// wait outside this method
		// So we need to make sure when the very first thread finish the instantiation
		// the following thread will NOT make any new object
		if (dcl == null) {
			dcl = new DoubleCheckedLocking();
		}
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

package BehaviorPatterns.ChainResponsibility;

/**
 * This is the base one, we can imagine it as the last element on the chain
 * 
 * So, in short, the request rises in hierarchy till some object takes responsibility to handle this request. 
 * A good example is Exception in java, if this one cannot handle, it will give to the parent to handle, 
 * that's the reason why you cannot have some catch statement after your super exception
 * 
 * http://www.allapplabs.com/java_design_patterns/chain_of_responsibility_pattern.htm
 * 
 * 
 * @author shiqing
 *
 */
public class Sill {
	private int size;
	
	public int getSize() {
		return size;
	}
	
	public void collect(Matters matters) {
		// Do nothing here, everything can not pass this level which means will keep in this level
	}
}

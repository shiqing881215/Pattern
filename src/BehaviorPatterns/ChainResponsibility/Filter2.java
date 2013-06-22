package BehaviorPatterns.ChainResponsibility;

public class Filter2 extends Filter1 {
	private int size;
	
	// Override this method and when call the collect method it will use this filter's size instead of the super one
	@Override
	public int getSize() {
		return size;
	}
}

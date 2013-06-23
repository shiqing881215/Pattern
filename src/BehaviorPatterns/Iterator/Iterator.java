package BehaviorPatterns.Iterator;

/**
* Iterator interface has method declarations for iterating through
* TV channels. All remote controls implement Iterator.
* 
* The Iterator pattern is one, which allows you to navigate through a collection of data using a common interface without knowing about the underlying implementation.
* Iterator should be implemented as an interface. This allows the user to implement it anyway its easier for him/her to return data.
* 
* http://www.allapplabs.com/java_design_patterns/iterator_pattern.htm
*/
public interface Iterator {
	public Channel nextChannel(int currentChannel);
	public Channel prevChannel(int currentChannel);
}

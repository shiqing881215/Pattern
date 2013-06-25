package BehaviorPatterns.Template;

/**
 * 
 * In object-oriented programming, first a class is created that provides the basic steps of an algorithm design. 
 * These steps are implemented using abstract methods. Later on, subclasses change the abstract methods to implement real actions. 
 * Thus the general algorithm is saved in one place but the concrete steps may be changed by the subclasses.
 * 
 * Core idea : abstract class, abstract methods, final concrete method
 * 
 * http://en.wikipedia.org/wiki/Template_pattern
 * @author shiqing
 *
 */
public abstract class Game {
	private int playersNum;
	
	abstract void initializeGame();
	abstract boolean endOfGame();
	abstract void printWinner();
	abstract void playOnce();
	
	/**
	 * Template method, cannot be overriden
	 * Design whole picture, detail is implemented by subclass
	 * @param playersNum
	 */
	public final void playGame(int playersNum) {
		this.playersNum = playersNum;
		initializeGame();
		while (!endOfGame()) {
			playOnce();
		}
		printWinner();
	}
}

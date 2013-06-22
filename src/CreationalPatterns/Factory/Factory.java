package CreationalPatterns.Factory;

public class Factory {

	// Return new here, create subclass
	private static Father getInstance() {
		return new Daughter();
		// return new Son();
	}
	
	// Never touch real instance(concrete class), just interface with father
	public static void main(String[] args) {
		Father father = Factory.getInstance();
		father.shout();
	}

}

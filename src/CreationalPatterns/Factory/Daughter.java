package CreationalPatterns.Factory;

public class Daughter extends Father{
	@Override
	protected void shout() {
		System.out.println("Shout from daughter.");
	}
}

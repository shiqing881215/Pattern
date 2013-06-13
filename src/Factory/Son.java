package Factory;

public class Son extends Father {
	@Override
	protected void shout() {
		System.out.println("Shout from son.");
	}
}

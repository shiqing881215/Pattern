package Singleton;

public class Singleton {
	private static Singleton single;
	private String name;
	
	private Singleton() {
		
	}
	
	public static Singleton getSingle() {
		if (single == null) {
			single = new Singleton();
		}
		return single;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

package Singleton;

public class SingletonDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Singleton single = Singleton.getSingle();
		single.setName("I'm singleton");
		System.out.println(single.getName());
		
		Singleton single2 = Singleton.getSingle();
		single2.setName("I'm the same instance.");
		System.out.println(single.getName());   // Using single here instead of single2
	}

}

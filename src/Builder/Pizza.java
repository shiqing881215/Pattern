package Builder;

/**
 * Builder pattern is suitable for when you have to set too many fields in the constructor.
 * 
 * @author qshi
 * See builder patter advantage over Telescope Constructor Pattern and JavaBean Pattern 
 * http://stackoverflow.com/questions/328496/when-would-you-use-the-builder-pattern
 */
public class Pizza {
	private int size;
	private boolean cheeze;
	private boolean pepperoni;
	private boolean bacon;
	
	public static class Builder {
		// Final and constructor to make it required
		private final int size;
		// Optional
		private boolean cheeze;
		private boolean pepperoni;
		private boolean bacon;
		
		public Builder(int value) {
			size = value;
		}
		
		/*
		 * Below three methods set one of builder attribute and then return the builder
		 */
		public Builder cheeze(boolean value) {
			cheeze = value;
			return this;
		}
		
		public Builder pepperoni(boolean value) {
			pepperoni = value;
			return this;
		}
		
		public Builder bacon(boolean value) {
			bacon = value;
			return this;
		}
		
		/*
		 * This method is used to 
		 * 1. Create a Pizza class
		 * 2. Transform the value back to pizza
		 * Call at last when all field is populated
		 */
		public Pizza build() {
			return new Pizza(this);
		}
	}
	
	/*
	 * Private constructor for real class to transform the value got from builder
	 */
	private Pizza(Builder builder) {
		size = builder.size;
		cheeze = builder.cheeze;
		pepperoni = builder.pepperoni;
		bacon = builder.bacon;
	}
	
	public void saySomething() {
		System.out.println("size:" + size);
		System.out.println("cheeze:" + cheeze);
		System.out.println("pepperoni:" + pepperoni);
		System.out.println("bacon:" + bacon);
	}
}

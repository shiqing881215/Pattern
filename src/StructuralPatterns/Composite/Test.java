package StructuralPatterns.Composite;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee CFO = new Employee("CFO",999999);
		
		Employee manager1 = new Employee("manager1", 10000);
		Employee manager2 = new Employee("manager2", 10000);
		
		Employee developer1 = new Employee("developer1", 2000);
		Employee developer2 = new Employee("developer2", 2000);
		Employee developer3 = new Employee("developer3", 2000);
		Employee developer4 = new Employee("developer4", 2000);
		
		CFO.addSubordinate(manager1);
		CFO.addSubordinate(manager2);
		
		manager1.addSubordinate(developer1);
		manager1.addSubordinate(developer2);
		manager2.addSubordinate(developer3);
		manager2.addSubordinate(developer4);
		
	}

}

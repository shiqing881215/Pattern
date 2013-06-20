package StructuralPatterns.Composite;

import java.util.Vector;

/**
 * http://www.allapplabs.com/java_design_patterns/composite_pattern.htm
 * 
 * Composite can be used when clients should ignore the 
 * difference between compositions of objects and individual objects.
 * 
 * The intent of a composite is to "compose" objects into tree structures to represent part-whole hierarchies. 
 * Implementing the composite pattern lets clients treat individual objects and compositions uniformly
 * 
 * The most indicator for this pattern is that you have a group of class A as the field in class A
 * 
 * @author qshi
 *
 */
public class Employee {
	private String name;
	private double salary;
	private Vector subordinates;
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Vector getSubordinates() {
		return subordinates;
	}
	public void setSubordinates(Vector subordinates) {
		this.subordinates = subordinates;
	}
	
	public void addSubordinate(Employee employee) {
		subordinates.add(employee);
	}
	
	public void removeSubordinate(Employee employee) {
		subordinates.remove(employee);
	}
}

package org.fi.employee;

public class Engineer extends Employee {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected float overTime;

	public Engineer(String name, String address, int age, boolean gender, float basicSalary, float overTime) {
		super(name, address, age, gender, basicSalary);
		this.overTime = overTime;
	}

	public float getOverTime() {
		return overTime;
	}

	public void setOverTime(float overTime) {
		this.overTime = overTime;
	}

	//JDK 1.4 ONWARD USED ANNOTATION IN JAVA
	//POLYMORPHISM
	
	@Override
	public float computeSalry() {
		return basicSalary * overTime;
	}

	@Override
	public float totalSalary() {
		
		return (basicSalary * overTime)+5000;
	}
}

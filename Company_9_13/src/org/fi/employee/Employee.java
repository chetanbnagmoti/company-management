package org.fi.employee;

import java.io.Serializable;

public abstract class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String name;
	protected String address;
	protected int age;
	protected boolean gender;
	protected float basicSalary;

	public Employee(String name, String address, int age, boolean gender, float basicSalary) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.basicSalary = basicSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean male) {
		this.gender = male;
	}

	public float getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	//Overiding 
	public float computeSalry(){
		System.out.println("Employee salary !!!");
		return basicSalary;
	}
	
	public abstract float totalSalary(); 
		
	

}

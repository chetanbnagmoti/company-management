package org.fi.employee;

public class SalePerson extends Employee {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected float commision;

	public SalePerson(String name, String address, int age, boolean gender, float basicSalary, float commision) {
		super(name, address, age, gender, basicSalary);
		this.commision = commision;
	}

	public float getCommision() {
		return commision;
	}

	public void setCommision(float commision) {
		this.commision = commision;
	}
	
	@Override
	public float computeSalry() {
		return basicSalary + (commision*10);
	}

	@Override
	public float totalSalary() {
		
		return basicSalary + (commision*10)+5000;
	}

}

package org.fi.employee;

import cdac.in.linkedlist.nodeinteface.TraversList;

public class Display {
	
	public void show(TraversList<Employee> objList) {
		Employee objEmployee = objList.getFirst();
		try {
			while (objEmployee != null) {
				System.out.println(objEmployee.getName());
				System.out.println(objEmployee.getAddress());
				System.out.println(objEmployee.getAge());
				if (objEmployee.isGender())
					System.out.println("Male");
				else
					System.out.println("Female");

				System.out.println(objEmployee.getBasicSalary());
				System.out.println(objEmployee.computeSalry());
				System.out.println(objEmployee.totalSalary());
				if (objEmployee instanceof Manager) {
					Manager objManager = (Manager) objEmployee;
					System.out.println(objManager.getHra());
				} else if (objEmployee instanceof Engineer) {
					Engineer objEngineer = (Engineer) objEmployee;
					System.out.println(objEngineer.getOverTime());

				} else if (objEmployee instanceof SalePerson) {
					SalePerson objSalePerson = (SalePerson) objEmployee;
					System.out.println(objSalePerson.getCommision());
				}
				System.out.println("-----------------------------------------");
				
				objEmployee =objList.getNext();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	



}

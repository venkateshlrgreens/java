package org.test1;

import org.test.EmployeeDetails;

public class EmployeeDetails2 {
	
	private void emp2id() {
	
		System.out.println("the employee 2 id is 123");

	}
	private void emp2Age() {

	System.out.println("the employee 2 age is 25");	
	}

	public static void main(String[] args) {
		EmployeeDetails2 e2 = new  EmployeeDetails2();
		e2.emp2id();
		e2.emp2Age();
		EmployeeDetails e = new EmployeeDetails();
		e.empId();
		e.empName();
	}
}

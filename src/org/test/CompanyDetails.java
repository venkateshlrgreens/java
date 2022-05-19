package org.test;

public class CompanyDetails {

	public void compId() {
		System.out.println("Company id is 1234");
	}
	
	public void compName() {
		System.out.println("Company name is TCS");
	}
	
	public static void main(String[] args) {
		CompanyDetails c=new CompanyDetails();
		c.compId();
		c.compName();
		EmployeeDetails e=new EmployeeDetails();
		e.empId();
		e.empName();
	}
	
}

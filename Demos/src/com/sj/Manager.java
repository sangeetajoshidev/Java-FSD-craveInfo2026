package com.sj;

public class Manager extends Employee {
	
	 private double allowance;
		/*
		 * public Manager() { //super(); // TODO Auto-generated constructor stub
		 * System.out.println("no arg of mgr"); }
		 */

	 public static void m1() {
			System.out.println("m1 in mgr");
		}
	 
	 
	 
	public Manager(int empId, String name, String dept, double b_salary , double a) {
	    super(empId, name, dept, b_salary);
		// TODO Auto-generated constructor stub
		this.allowance =a;
		System.out.println("Param of Mgr");
		
	}
	 
	@Override
	public void cal_salary() {
	 
		System.out.println("Manager's total salary is: "+(b_salary + allowance));
	
	}

}

package com.sj;

public class Employee implements Printable{
	
	private int empId;
	private String name;
	private String dept; 
	protected double b_salary;
		
	
	public void print() {
		System.out.println
		("EmpId"+empId+"name"+name+"b_salary"+b_salary);
	}
	
	
	public void cal_salary() {
		System.out.println("Totla salary is the basic salary for emp"+b_salary);
	}
	
	public void displayDetails(){
		System.out.println("ID:"+empId+"Name:"+name);
	}
	
	public String toString() {
		return ("The emp object has "+(empId + name+dept+b_salary));
	}
	
	
	
	
	  public Employee() { super(); // TODO Auto-generated constructor stub
	  System.out.println("no arg of emp"); }
	 
	public Employee(int empId, String name, String dept, double b_salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.dept = dept;
		this.b_salary = b_salary;
		System.out.println("param constr of emp");
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getB_salary() {
		return b_salary;
	}
	public void setB_salary(double b_salary) {
		this.b_salary = b_salary;
	}
	
	
	

}

package com.sj;

public class OrgUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   //  Employee e1 = new Employee(1,"abc","Hr",50000);
	  //   Employee e2 = new Manager(2,"xyz","Dev",80000,10000);
		
		     int x =10;
		     float y = 5.5f;
		
		     y =x;
		     
		     
		     x = (int) y;
		
		
	
		  Manager[]  mgrArray = new Manager[3];
		  
		  mgrArray[0]= (Manager)new Employee(1,"abc","Hr",50000);
	     
	     Employee[] empArray = new Employee[2];
	     empArray[0]=new Employee(1,"abc","Hr",50000);
	     empArray[1]= new Manager(2,"xyz","Dev",80000,10000);
	     
	    for  ( Employee e : empArray) {
		  e.cal_salary();
		  e.displayDetails();
	     }
	     
	     
	     
	     
	     
	
			/*
			 * e1.displayDetails(); e2.displayDetails();
			 * 
			 * e1.cal_salary(); e2.cal_salary();
			 */
	     
	 //    System.out.println(e1);
	 //    System.out.println(e2);
	     
	
	     
	
	}

}

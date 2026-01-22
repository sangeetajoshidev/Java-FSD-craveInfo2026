package com.sj;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  Printable[] p = new Printable[3];
		  
		  p[0]= new Date(21,1,2026); 
		  p[1]= new Employee(1,"someName","Hr",50000); 
		  p[2]= new Account(101,"actName",10000);
		  
		 Util.printAll(p);
	    	
	
	
	
	}

}

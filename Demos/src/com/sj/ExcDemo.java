package com.sj;

public class ExcDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		new ExcDemo().m1();
		
		try {
        	new ExcDemo().m1();
        }
        catch(Exception e) {
        	System.out.println("exception is genreated in m3 "
        			+ "and handled in main after cascading through m2 and m1");
        }
	
	}
	
	public void m1() throws Exception{
		System.out.println("In m1");
		m2();
		
	}
	public void m2() throws Exception {
		System.out.println("In m2");
		m3();
	}
	public void m3() throws Exception{
		System.out.println("In m3");
		throw new Exception();
	}
	

}

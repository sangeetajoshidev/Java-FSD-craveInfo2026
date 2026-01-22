package com.sj;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
		        int n1 = Integer.parseInt(args[0]);
		        int n2 = Integer.parseInt(args[1]);
		
	           System.out.println("Entering division"); 
		  
	          System.out.println(n1/n2);
	          System.out.println("some code in try block");
		   }
		 
		   
		   catch(ArithmeticException e)
		   {
			  // e.printStackTrace();
			   System.out.println("Can not divide by Zero");
		   }
		   catch(ArrayIndexOutOfBoundsException e) {
			   System.out.println("please pass valid input");
		   }
		 
		   catch(Exception e) {
		    	System.out.println(e.getMessage());
		    }
	
	      System.out.println("Some further code");
	
	
	}

}

package com.sj;

public class ExceDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   try {
       double no = Double.parseDouble(args[0]);
	   if(no>=0)
	   System.out.println("SquareRoot of "+no+"is:"+ Math.sqrt(no));
	   else
		   throw new NegativeNumberException
	      ("You entered a negative no.");
	   }
	   catch(Exception e) {
		   System.out.println(e.getMessage());
	   }
	}

}

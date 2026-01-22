/**
 * 
 */
package com.sj;

/**
 * @author sange
 *
 */
public class Account implements Printable{
	
	private int actId;
	private String actHolder;
	private float balance;
	
	public void print() {
		System.out.println("Account details:"
				+actId+"-"+actHolder+"-"+balance);
	}
	
	
	
	
	public Account() {
		System.out.println("no arg constr called");
	}
	
	public Account(int i,String name,float bal) {
	   actId=i;
	   actHolder = name;
	   balance = bal;
	  System.out.println("Param constructor called");
	
	}
	
		
	public void showBalance() {
		System.out.println(balance);
	}
	public void withdraw(float amt) {
		
		if(amt < balance)
		balance = balance - amt;
		else
	    System.out.println("Insufficient balance");
		showBalance();
		
	}	
	public void deposit (float amt) {
		balance = balance + amt;
		showBalance();
		
	}	
	
	public int getActId() {
		return actId;
	}

	public void setActId(int actId) {
		this.actId = actId;
	}
	public String getActHolder() {
		return actHolder;
	}
	public void setActHolder(String actHolder) {
		this.actHolder = actHolder;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}

     
     public void displayBalance() {
    	 System.out.println("Balance is"+balance);
     }


	
	

}

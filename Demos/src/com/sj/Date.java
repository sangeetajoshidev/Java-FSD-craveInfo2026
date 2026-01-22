/**
 * 
 */
package com.sj;

/**
 * @author sange
 *
 */
public class Date implements Printable {
	
	private int day,month,year;
	 
	static int counter;
	
	
	public void print() {
		System.out.println
		("Date is:"+day+"-"+month+"-"+year);
	}
	
	
 
	public Date() {
		super();
		// TODO Auto-generated constructor stub
		counter++;
		System.out.println("No arg constructor");
	}


	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
		counter++;
		System.out.println("param constructor");
		
	}

	public static void displayCounter() {
		System.out.println("No of objects:"+counter);
	}

	public int getDay() {
		return day;
	}


	public void setDay(int d) {
		day = d;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int m) {
		month = m;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int y) {
		this.year = y;
	}


	public void displayDate() {
		System.out.println("The date is"+this.day+"-"+this.month+"-"+this.year);
	}
	
	public static void showCtr() {
		
	}

}

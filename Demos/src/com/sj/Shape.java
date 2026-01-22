/**
 * 
 */
package com.sj;

/**
 * @author sange
 *
 */
public abstract class Shape {
	
	String color;
	static int counter;
	public Shape(String color) {
		super();
		this.color = color;
		counter++;
	}

	public Shape() {
		super();
		// TODO Auto-generated constructor stub
		counter++;
	}

	public abstract void calculateArea() ;
		
	public void showColor() {
		System.out.println("Color of shape is:"+color);
	}
	
	public static void showCount() {
		System.out.println("Counter:"+counter);
	}
}


 abstract class  Hexagone extends Shape{
	 
 }



class Rectangle extends Shape{

		
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of a rectangle is Breadth * Height");
		
	}
	
	
	
}

class Circle extends Shape{
	
	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of a circle is 3.14 * r * r");
		
	}
}
	
class Triangle extends Shape{
	
	
	
	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of a traingle is 0.5 * Base * Height");
		
	}
}





package com.sj;

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        Shape[] shapes = new Shape[3];
	
	        shapes[0]= new Rectangle("Red");
	        shapes[1]= new Circle("Blue");
	        shapes[2]= new Triangle("Brown");
	
	     for(  Shape s:shapes) {
	    	 s.calculateArea();
	    	 s.showColor();
	     }
	     Shape.showCount();
	
	}

}

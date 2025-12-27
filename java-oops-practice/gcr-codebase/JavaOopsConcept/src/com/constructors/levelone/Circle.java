package com.constructors.levelone;
public class Circle {
	
	double radius;
	
		// default constructor for constructor chaining
    	Circle() {
    		this(1.0);
    	}
    	//parametrized constructor
		Circle(double radius){
			this.radius = radius;
		}
		
		void display() {
	        System.out.println("Radius = " + radius);
	    }
		 public static void main(String[] args) {
			   Circle c = new Circle(5);
		       c.display();
		       Circle c1 = new Circle();
		       c1.display();
		 }
}

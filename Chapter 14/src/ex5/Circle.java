package ex5;

import ex1.GeometricObject;

public class Circle extends GeometricObject implements Comparable{
	private double radius;
	public Circle() {
		super("white", false);
		radius =1;
	}
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
	public double getPrimeter() {
		return 2 * radius * Math.PI;
	}
	
	@Override
	public int compareTo(Object o) {
		if(getArea() > ((Circle)o).getArea()) 
			return 1;
		else if(getArea() < ((Circle)o).getArea()) 
			return -1;
		else 
			return 0;
			
	}
	@Override
	
	public boolean equals(Object o) {
		if(this.radius == ((Circle)o).getRadius()) 
			return true;
		else return false;
	}
	
	
	
 }

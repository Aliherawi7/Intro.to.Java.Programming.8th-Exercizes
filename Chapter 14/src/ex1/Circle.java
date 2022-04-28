package ex1;

public class Circle extends GeometricObject {
	double radius;
	public Circle() {
		super("white", false);
		radius =1;
	}
	public Circle(double radius) {
		super("white", false);
		this.radius = radius;
	}
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
		Circle c = new Circle();
		c.equals(color);
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
		if(this.radius == ((Circle)o).radius) 
			return true;
		else return false;
	}
	
	
	
 }

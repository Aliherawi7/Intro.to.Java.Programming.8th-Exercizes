package ex13_5;
import java.awt.*;
public class Triangle extends GeometricObject{
	double side1, side2, side3;
	
	// Default triangle
	public Triangle() {
		super("white", true);
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	// Custom triangle
	public Triangle(double side1, double side2, double side3, String color, boolean filled)throws IllegalTriangleException {
		super(color,filled);
		if(side1+side2 > side3 && side1+side3 >side2 && side2+side3 > side2) {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}else {
			double min;
			if(side1 <side2 && side1 <side3) 
				min = side1;
			else if(side2 <side1 && side2 <side3)
				min = side2;
			else if(side3 < side2 && side3 < side1)
				min = side3;
			
			throw new IllegalTriangleException(min);
		}
			
		
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	
	public double getArea() {
		double s = (side1 + side2 + side3)/2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}
	
	public double getPerimeter(){
		return side1 + side2 + side3;
	}
	
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
				" side3 = " + side3;
	}
	
	
}

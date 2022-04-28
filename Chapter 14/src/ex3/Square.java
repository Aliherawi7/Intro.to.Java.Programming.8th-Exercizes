package ex3;

import ex1.GeometricObject;

public class Square extends GeometricObject implements Colorable{
	double width;
	double height ;
	public Square(double w, double h, String color, boolean filled) {
		super(color,filled);
		width = w;
		height  = h;
	}

	@Override
	public double getArea() {
		
		return width * height ;
	}

	@Override
	public double getPrimeter() {
		// TODO Auto-generated method stub
		return (2 * width)+(2 * height);
	}

	@Override
	public int compareTo(Object o) {
		if(getArea() > ((Square)o).getArea())
			return 1;
		else if(getArea() < ((Square)o).getArea()) 
			return -1;
		else return 0;
	}

	@Override
	public void howToColor() {
		System.out.println("Color all four sides");
		
	}

}

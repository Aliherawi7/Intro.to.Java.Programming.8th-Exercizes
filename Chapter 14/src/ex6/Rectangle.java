package ex6;

public class Rectangle extends GeometricObject implements Comparable{
	private double width;
	private double height;
	public Rectangle() {

	}
	
	public Rectangle(double width, double height) {
		this.height = height;
		this.width = width;
	}
	public Rectangle(double width, double height, String color, boolean filled) {
		super(color,filled);
		this.height = height;
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPrimeter() {
		return (2*width)+(2*height);
	}

	@Override
	public int compareTo(Object o) {
		if(getArea() > ((Rectangle)o).getArea())
			return 1;
		else if(getArea() < ((Rectangle)o).getArea())
			return -1;
		else return 0;
	}
	
	public boolean equals(Object o) {
		if(getArea() == ((Rectangle)o).getArea())
			return true;
		else return false;
	}
	
	

}

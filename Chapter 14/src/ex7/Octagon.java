package ex7;

import ex6.GeometricObject;

public class Octagon extends GeometricObject implements Comparable, Cloneable{
	private double side;
	public Octagon() {
		side = 0;
		
	}
	
	public Octagon(double side) {
		this.side = side;
	}
	
	public Octagon(double side, String color, boolean filled) {
		super(color, filled);
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		return (2+(4/Math.sqrt(2)))*side*side;
	}

	@Override
	public double getPrimeter() {
		
		return 8 * side;
	}

	@Override
	public int compareTo(Object o) {
		if(getArea() > ((Octagon)o).getArea())
			return 1;
		else if(getArea() < ((Octagon)o).getArea())
			return -1;
		else return 0;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
	

}

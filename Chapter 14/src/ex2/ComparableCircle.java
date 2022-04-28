package ex2;

import ex1.Circle;

public class ComparableCircle extends Circle  implements Comparable{

	public ComparableCircle(double radius, String color, boolean filled) {
		super(radius, color, filled);
	}
	@Override
	public int compareTo(Object o) {
		if(getArea() > ((ComparableCircle)o).getArea()) 
			return 1;
		else if(getArea() < ((ComparableCircle)o).getArea()) 
			return -1;
		else 
			return 0;
			
	}

}

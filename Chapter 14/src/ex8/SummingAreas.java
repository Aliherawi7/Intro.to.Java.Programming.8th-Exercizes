package ex8;

import ex1.Circle;
import ex1.GeometricObject;
import ex1.MyRectangle;

public class SummingAreas {

	public static void main(String[] args) {
		GeometricObject[] a = new GeometricObject[4];
		a[0] = new Circle(4.3);
		a[1] = new Circle(8);
		a[2] = new MyRectangle(4, 3);
		a[3] = new MyRectangle(12, 24);
		
		System.out.printf("%2.2f",sumArea(a));

	}
	
	public static double sumArea(GeometricObject[] a) {
		double sumOfArea = 0 ;
		for(int i =0; i < a.length; i++) {
			sumOfArea += a[i].getArea();
		}
		return sumOfArea;
	}

}

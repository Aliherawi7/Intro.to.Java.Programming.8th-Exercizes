package ex1;

public class TestProgram {

	public static void main(String[] args) {
		GeometricObject circle1 = new Circle(12,"red",true);
		GeometricObject circle2 = new Circle(9,"red",true);
		GeometricObject rec1 = new MyRectangle(4, 2, "red",true);
		GeometricObject rec2 = new MyRectangle(12, 3, "red",true);
		System.out.println(rec1.compareTo(rec2));
		System.out.println(circle1.compareTo(circle2));
	}

}

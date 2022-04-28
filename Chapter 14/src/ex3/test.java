package ex3;
import ex1.Circle;
import ex1.GeometricObject;
import ex1.MyRectangle;
public class test {

	public static void main(String[] args)throws Exception {
		GeometricObject[] array = new GeometricObject[5];
		array[0] = new Square(4.5, 8.2, "red", false);
		array[1] = new Circle(4, "red", false);
		array[2] = new MyRectangle(5, 16, "red", false);
		array[3] = new Square(24, 5, "white", false);
		array[4] = new Square(3, 7, "yellow", false);
		
		for(int i=0; i<array.length; i++) {
			try {
				((Colorable) array[i]).howToColor();
			}catch(Exception ex) {
				System.out.println("does not have \"howToColor\" method");
			}
		}
		
		

	}

}

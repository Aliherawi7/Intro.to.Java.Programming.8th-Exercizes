package Ex1;

public class Rectangle {
	double width = 1;
	double high = 1;
	Rectangle(){
		
	}
	Rectangle(double width , double high){
		this.high = high;
		this.width = width;
	}
	public double getArea() {
		return width*high;
	}
	public String getParimeter() {
		String parimeter = "width:"+width+"  high:"+high;
		return parimeter;
	}
}
	


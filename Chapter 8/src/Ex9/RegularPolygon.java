package Ex9;

public class RegularPolygon {
	private int n; //store the number of sides
	private double side; //Store the length of sides
	private double x; // define the x-coordinate of the center of the polygon
	private double y; // define the y-coordinate of the center of the polygon
	RegularPolygon(){
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}
	RegularPolygon(int n, double side){
		this.n = n;
		this.side = side;
		x = 0;
		y = 0;
	}
	RegularPolygon(int n, double side, double x, double y){
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getPerimeter() {
		return getN()*getSide(); 
	}
	public double getArea() {
		double area = (getN()*getSide()*getSide())/4*Math.tanh(Math.PI/getN());
		return area;
		
	}
	
}

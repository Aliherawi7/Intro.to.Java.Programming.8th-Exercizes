package Ex13;

public class MyPoint {
	double x,y;
	public MyPoint() {
		x = 0;
		y = 0;
	}
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
	public double distance(MyPoint myPoint) {
		double d, x, y;
		x = this.x - myPoint.x;
		y = this.y - myPoint.y;
		d = Math.sqrt((x*x)+(y*y));
		return d;
	}
	public double distance(double x, double y) {
		double d, minusX, minusY;
		minusX = this.x - x;
		minusY = this.y - y;
		d = Math.sqrt((minusX*minusX)+(minusY*minusY));
		return d;
	}
	
}

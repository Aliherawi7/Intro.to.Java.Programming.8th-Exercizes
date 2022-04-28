package Ex1;

public class Circle2D {
	double x, y;
	double radius;
	public Circle2D() {
		x =0;
		y =0;
		radius =1;
	}
	public Circle2D(double x ,double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
	public double getPrimeter() {
		return 2*radius*Math.PI;
	}
	public boolean contains(double x, double y) {
		double pointDistance = Math.sqrt(Math.pow(x-this.x, 2) + Math.pow(y-this.y, 2));
		if(pointDistance <= 2*radius)
			 return true;
		else return false;
	}
	public boolean contains(Circle2D circle) {
		
		double pointDistance = Math.sqrt(Math.pow(circle.getX()-x, 2) + Math.pow(circle.getY()-y, 2));
		if(pointDistance <= (this.radius - circle.radius))
			 return true;
		else return false;
	}
	
	public boolean overlops(Circle2D circle) {
		double pointDistance = Math.sqrt(Math.pow(circle.getX()-x, 2) + Math.pow(circle.getY()-y, 2));
		if(pointDistance < (this.radius + circle.radius))
			return true;
		else return false;
	}
 }

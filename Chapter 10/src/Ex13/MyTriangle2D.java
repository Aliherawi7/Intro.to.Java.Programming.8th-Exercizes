package Ex13;

public class MyTriangle2D {
	MyPoint p1, p2, p3;
	
	public MyTriangle2D() {
		this(new MyPoint(0,0), new MyPoint(1,1), new MyPoint(2,5));
		
	}
	
	public MyTriangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public MyPoint getP1() {
		return p1;
	}

	public void setP1(MyPoint p1) {
		this.p1 = p1;
	}

	public MyPoint getP2() {
		return p2;
	}

	public void setP2(MyPoint p2) {
		this.p2 = p2;
	}

	public MyPoint getP3() {
		return p3;
	}

	public void setP3(MyPoint p3) {
		this.p3 = p3;
	}
	
	public double getArea() {
		double area = (1/2)*(p1.x*(p2.y-p3.y)+p2.x*(p3.y-p1.y)+p3.x*(p1.y-p2.y));
		return area;
	}
	//WRONG FOMULA
	public boolean containPoint(double x, double y) {
		
		double s = p1.y * p2.x - p1.x * p2.y +(p2.y - p1.y) * x +(p1.x - p3.x)*y;
		double t = p1.x * p2.y - p1.y * p2.x + (p1.y - p2.y)*x + (p2.x - p1.x)*y;
		
		if((s<0) != (t<0))
			return false;
		
		double A = -p2.y * p3.x + p1.y *(p3.x - p2.x) + p1.x*(p2.y - p3.y) + p2.x * p3.y;
		
		return A<0 ? (x<=0 && s+t >=A) : (s>=0 && s+t <=A);
	}
	
	
}

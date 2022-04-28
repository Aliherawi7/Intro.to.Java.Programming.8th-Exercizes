package ex1;

public class MyRectangle extends GeometricObject{
	double x, y;
	double width, height;
	
	public MyRectangle() {
		super("white",false);
		width =1;
		height =1;
	}
	public MyRectangle(double width, double height) {
		super("white",false);
		this.width = width;
		this.height = height;
	}
	
	public MyRectangle(double width, double height,String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return width*height;
	}
	
	public double getPrimeter() {
		return (2*width) + (2*height);
	}
	
    
    public boolean isEmpty() {
        return (width <= 0.0f) || (height <= 0.0f);
    }
    @Override
    public int compareTo(Object o) {
		if(getArea() > ((MyRectangle)o).getArea()) 
			return 1;
		else if(getArea() < ((MyRectangle)o).getArea()) 
			return -1;
		else 
			return 0;
	}

	
}

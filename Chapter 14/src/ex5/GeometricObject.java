package ex5;
public abstract class GeometricObject {
	private String color;
	private boolean filled;
	private java.util.Date dateCreated;
	
	public GeometricObject() {
		 dateCreated = new java.util.Date();
	}
	
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	
	public void stColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public java.util.Date getDate(){
		return dateCreated;
	}
	
	public String toString() {
		return "created on" + dateCreated + "\ncolor:" + 
				"and filled: " + filled;
	}
	
	
	public abstract double getArea();
	public abstract double getPrimeter();


	
}
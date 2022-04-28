package Ex8;

public class Fan {
	public final int SLOW = 1;
	public final int MEDIUM = 2;
	public final int FAST = 3;
	private int speed;
	private boolean on ;
	private double radius;
	String color ;
	
	Fan(){
		speed = SLOW;
		on = false;
		radius = 5;
		color = "blue";
	}
	public String toString() {
		String report ="-------------------\n";
		if(isOn() == true) {
			report += "The fan speed is:"+getSpeed();
			report += "\nThe fan color is :"+getColor();
			report += "\nthe radius is :"+getRadius();
			
			return report;
		}else {
			report += "the fan color is: "+getColor();
			report += "\nthe fan radius is: "+getRadius();
			report += "\nthe fan is off";
			return report;
		}
	}
	

	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	 
	
}

package ex13_5;

public class IllegalTriangleException extends Exception{
	private double side;
	public IllegalTriangleException(double side) {
		super("Invalid side"+side);
		this.side = side;
	}
	public double getSide() {
		return side;
	}
}

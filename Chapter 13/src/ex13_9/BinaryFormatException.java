package ex13_9;

public class BinaryFormatException extends Exception{

	public BinaryFormatException() {
		super("Invalid binary string");
	}
	public BinaryFormatException(String message) {
		super(message);
	}
	public String getMessage() {
		return super.getMessage();
	}
}

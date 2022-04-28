package ex13_8;

public class HexFormatException extends Exception{
	
	public HexFormatException() {
		super("Invalid Hex String");
	}
	
	public HexFormatException(String message) {
		super(message);
	}
}

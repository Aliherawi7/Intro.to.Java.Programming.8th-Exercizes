package Ex3;

public class MyInteger {
	int value; 
	public MyInteger (int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public boolean isEven() {
		if(this.value/2 ==0)
			return true;
		else 
			return false;
	}
	public boolean isOdd() {
		if(this.isEven())
			return false;
		else return true;
	}
	public boolean isPrime() {
		for(int i =2; i<this.value ; i++) {
			if(this.value % i ==0) {
				return false;
			}
			
		}
		return true;
	}
	//static methods
	public static boolean isEven(int value) {
		if(value/2 ==0)
			return true;
		else 
			return false;
	}
	public static boolean isOdd(int value) {
		if(value %2 == 0)
			return false;
		else return true;
	}
	public static  boolean isPrime(int value) {
		for(int i =2; i<value ; i++) {
			if(value % i ==0) {
				return false;
			}
			
		}
		return true;
	}
	//static method for other objects
	public static boolean isEven(MyInteger mi) {
		if(mi.value/2 ==0)
			return true;
		else 
			return false;
	}
	public static boolean isOdd(MyInteger mi) {
		if(mi.isEven())
			return false;
		else return true;
	}
	public static boolean isPrime(MyInteger mi) {
		for(int i =2; i<mi.value ; i++) {
			if(mi.value % i ==0) {
				return false;
			}
			
		}
		return true;
	}
	
	public boolean equals(int a) {
		if(this.value == a)
			return true;
		else
			return false;
	}
	public static int parseInt(char[] charArray) {
		String str = new String(charArray);
		int num = Integer.parseInt(str);
		return num;
	}
	public static int parseInt(String s) {
		int num = Integer.parseInt(s);
	return num;
	}
	
}

package Ex25;

public class MyCharacter {
	char ch;
	public MyCharacter (char ch) {
		this.ch = ch;
	}

	public char charValue() {
		return this.ch;
	}
	public int compareTo(char ch) {
		if(this.ch == ch) {
			return 0;
		}else if(this.ch > ch) {
			return this.ch-ch;
		}else return this.ch-ch;
	}
	public boolean equalschar(char ch) {
		if(this.ch == ch) {
			return true;
		}else return false;
	}
	
	public String toString() {
		String str = ""+this.ch;
		return str;
	}
	
	public static boolean isDigit(char ch) {
		if(ch >= '0' && ch <='9') {
			return true;
		}else return  false;
	}
	
	public static boolean isLetter(char ch) {
		if(ch >= 'A' && ch <='Z' || ch >='a' && ch<='z') {
			return true;
		}else return  false;
	}
}

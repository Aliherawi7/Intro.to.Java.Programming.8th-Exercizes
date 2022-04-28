package Ex27;

public class MyStringBuilder2 {
	String sb;
	public MyStringBuilder2() {
		
	}
	public MyStringBuilder2(char[] chars) {
		sb = chars.toString();
	}
	
	public MyStringBuilder2(String s) {
		sb = s;
	}
	
	public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
		String sb = s.toString();
		String firstHolder = this.sb.substring(0, offset-1);
		String endHolder =this.sb.substring(offset);
		String str ="";
		if(offset < this.sb.length()) {
			for(int i = offset; i< sb.length(); i++) {
				firstHolder += sb.charAt(i);
			}
			return new MyStringBuilder2(firstHolder+endHolder);
		}else return new MyStringBuilder2(this.sb);
		
	}
	
	public MyStringBuilder2 reverse() {
		char[] charArray = this.sb.toCharArray();
		int i = this.sb.length()-1;
		int j = 0;
		while(i >=0) {
			charArray[j] = this.sb.charAt(i);
			i--;
			j++;
		}
		return new MyStringBuilder2(charArray);
	}
	
	public MyStringBuilder2 substring(int begin) {
		char[] Array = new char[this.sb.length()-begin]; 
		int start = begin;
		if(begin < this.sb.length()) {
			for(int i =0; i< Array.length; i++) {
			Array[i] = this.sb.charAt(start);
			start++;
			}
			return new MyStringBuilder2(Array);
		}else return new MyStringBuilder2(this.sb);
		
		
	}
	
	public MyStringBuilder2 toUpperCase() {
		String upperCase ="";
		for(int i = 0; i< this.sb.length(); i++) {
			if(!(this.sb.charAt(i)>='A' && this.sb.charAt(i)<='Z')) {
				upperCase +=""+ (char)((int)(this.sb.charAt(i))-32); 
			}else {
				upperCase += this.sb.charAt(i) ;
			}
		}
		return new MyStringBuilder2(upperCase);
	}

}

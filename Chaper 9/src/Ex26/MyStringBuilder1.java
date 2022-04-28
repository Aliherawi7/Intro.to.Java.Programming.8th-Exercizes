package Ex26;

public class MyStringBuilder1 {
		String sb ;
	public MyStringBuilder1(String s) {
		sb = s;
	}
	public MyStringBuilder1 append(MyStringBuilder1 s) {
		return new MyStringBuilder1(sb+s);
	}
	public MyStringBuilder1 append(int i) {
		return new MyStringBuilder1(sb+i);
	}
	public int length() {
		char [] ch = this.sb.toCharArray();
		return ch.length;
	}
	public char charAt(int index) {
		return this.sb.charAt(index);
	}
	public MyStringBuilder1 toLowerCase() {
		String str ="";
		for(int i = 0; i< this.length(); i++) {
			
			if(this.charAt(i)>='A' && this.charAt(i)<='Z') {
				str +=""+ (char)((int)(this.charAt(i))+32); 
			}else {
				str +=""+ this.charAt(i) ;
			}
		}
		return new MyStringBuilder1(str);
	}
	public MyStringBuilder1 substring(int begin, int end) {
		String str = "";
		for(int i = begin; i<=end; i++) {
			str += this.charAt(i);
		}
		return new MyStringBuilder1(str);
	}
	public String toString() {
		String str = this.sb;
		return str;
	}
}

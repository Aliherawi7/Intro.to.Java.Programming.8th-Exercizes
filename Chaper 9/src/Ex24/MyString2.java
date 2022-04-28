package Ex24;

public class MyString2 {

	String str;
	
	public MyString2(String s) {
		str= s;
	}
	/*
	public int compare(String s) {
		int sum1 =0;
		int sum2 =0;
		if(str.length()==s.length()) {
			
			for(int i =0; i<str.length(); i++) {
				if(str.charAt(i)==s.charAt(i)) {	
				}else {
					for(int j =i; j<str.length(); j++) {
						sum1 +=str.charAt(j);
						sum2 +=s.charAt(j);
					}
					return sum1-sum2;
				}
			}
			return 0;
			
		}else if(str.length()>s.length()) {
			for(int i =0; i<str.length(); i++) {
				if(str.charAt(i)==s.charAt(i)) {	
				}else {
					for(int j =i; j<str.length(); j++) {
						sum1 +=str.charAt(j);
						if(j<=s.length()) {
							sum2 +=s.charAt(j);
						}
					}
					return sum1-sum2;
				}
			}
		}else {
			for(int i =0; i<s.length(); i++) {
				if(str.charAt(i)==s.charAt(i)) {	
				}else {
					for(int j =i; j<s.length(); j++) {
						sum1 +=str.charAt(j);
						if(j<=s.length()) {
							sum2 +=s.charAt(j);
						}
					}
				}
			}
			return sum1-sum2;
		}
		
		
	}
	*/
	public MyString2 substring(int begin) {
		MyString2 subString ;
		String temp="";
		int count =0;
		for(int i = begin; i<= (str.length()-1)-begin; i++) {
			 temp += str.charAt(i);
			 
		}
		return new MyString2(temp);
	}
	public MyString2 toUpperCase() {
		String upperCase ="";
		for(int i = 0; i< str.length(); i++) {
			if(!(str.charAt(i)>='A' && str.charAt(i)<='Z')) {
				upperCase += (char)((int)(str.charAt(i))-32); 
			}else {
				upperCase += str.charAt(i) ;
			}
		}
		return new MyString2(upperCase);
	}
	public char[] toChars() {
		char[] chars = null ;
		for(int i =0; i<str.length(); i++) {
			chars[i] = str.charAt(i);
		}
		return chars;
	}
	public static MyString2 valueOf(boolean b) {
		String value = ""+b;
		return new MyString2(value);
	}

}

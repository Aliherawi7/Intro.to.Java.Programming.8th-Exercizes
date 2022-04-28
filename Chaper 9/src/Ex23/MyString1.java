package Ex23;

public class MyString1 {
	char [] chars ;
	public MyString1(char[] chars) {
		this.chars = chars;
	}
	public char charAt(int index) {
		return chars[index];
		
	}
	public int length() {
		return chars.length;
	}
	public MyString1 substring(int begin, int end) {
		MyString1 subString ;
		char[] temp = new char[end-begin];
		int count =0;
		for(int i = begin; i<= end; i++) {
			temp[count] = this.charAt(i);
			count++;
		}
		return new MyString1(temp);
	}
	
	public MyString1 toLowerCase() {
		
		char[] lowerCase = new char[chars.length];
		for(int i = 0; i< chars.length; i++) {
			if(this.charAt(i)>='A' && this.charAt(i)<='Z') {
				lowerCase[i] = (char)((int)(this.charAt(i))+32); 
			}else {
				lowerCase[i] = this.charAt(i) ;
			}
			System.out.print(lowerCase[i]);
		}
		
		System.out.println();
		return new MyString1(lowerCase);
	}
	
	public boolean equals(MyString1 s) {
		//check if the both lengths are equals
		if(chars.length == s.length()) {
			for(int i =0; i <chars.length; i++) {
				if(chars[i] == s.charAt(i)) {
				
				}else return false; 
			}
		}else return false;
		
		return true;
	}
	public static MyString1 valueOf(int i) {
		String num = ""+i;
		char[] adad = new char[num.length()];
		int count =0;
		while(count<num.length()) {
			adad[count] = num.charAt(count);
			count++;
		}
		return new MyString1(adad);
		
	}
	

}

package Ex29;

public class SplitMethod {

	public static void main(String[] args) {
		String[] s = split("A?S%FG#H$JKJH#Ali?","[?#%$]");
		for(int i =0; i<s.length; i++) {
			
			System.out.println(s[i]);
		}

	}
	public static String[] split(String s, String regex) {
		char [] delimiters = new char[regex.length()];
		for(int i = 0; i<regex.length(); i++) {
			if(regex.charAt(i) !='[' || regex.charAt(i) !=']') {
				delimiters[i] = regex.charAt(i);
			}
		}
		
		String [] SplitArray = new String[s.length()];
		// initialized to avoid from null value
		for(int i =0; i<SplitArray.length; i++) {
			SplitArray[i] ="";
		}
		
		int arrayCount = 0;
		boolean key =true;
		
		for(int i =0; i<s.length(); i++) {
			//check the character if its deli
			for(int j=0; j<delimiters.length; j++) {
				if(s.charAt(i) == delimiters[j]) {
					arrayCount++;
					SplitArray[arrayCount] = ""+delimiters[j];
					arrayCount++;
					key = false;
				}
			}
			if(key) {
				SplitArray[arrayCount] +=""+s.charAt(i);
			}
			key = true;
		}
		
		return SplitArray;
	}

}

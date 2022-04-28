package Ex7;
import java.util.Scanner;
public class PhoneKeypads {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s = input.nextLine();
		s = s.toLowerCase();
		String str ="";
		StringBuilder sb = new StringBuilder(str);
		
		for(int i = 0; i < s.length(); i++) {
			
			if(Character.isLetter(s.charAt(i))) {
				sb.append(getNumber(s.charAt(i)));
			}else if(Character.isDigit(s.charAt(i)) || s.charAt(i) =='-') {
				sb.append((s.charAt(i)));
			}
		}
		System.out.println(sb.toString());
	}
	public static int getNumber(char uppercaseLetter) {
		
		if(uppercaseLetter == 'a' || uppercaseLetter == 'b' || uppercaseLetter == 'c' ) {
			return  2;
		}else if(uppercaseLetter == 'd' || uppercaseLetter == 'e' || uppercaseLetter == 'f' ) {
			return  3;
		}else if(uppercaseLetter == 'g' || uppercaseLetter == 'h' || uppercaseLetter == 'i' ) {
			return  4;
		}else if(uppercaseLetter == 'k' || uppercaseLetter == 'l' || uppercaseLetter == 'j' ) {
			return  5;
		}else if(uppercaseLetter == 'm' || uppercaseLetter == 'n' || uppercaseLetter == 'o' ) {
			return  6;
		}else if(uppercaseLetter == 'p' || uppercaseLetter == 'q' || uppercaseLetter == 'r' || uppercaseLetter == 's') {
			return  7;
		}else if(uppercaseLetter == 't' || uppercaseLetter == 'u' || uppercaseLetter == 'v' ) {
			return  8;
		}else if(uppercaseLetter == 'w' || uppercaseLetter == 'x' || uppercaseLetter == 'y' || uppercaseLetter == 'z') {
			return  9;
		}else return -1;
		
	}

}

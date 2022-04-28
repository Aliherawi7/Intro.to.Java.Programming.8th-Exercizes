package Ex3;
import java.util.Scanner;
public class CheckingPassword {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the password \n *the pw must have at least eight characters. "
				+ "\n *the pw consists of only letters and digits. "
				+ "\n *the pw must contain at least two digits.");
		String pw = input.nextLine();
		if(checkLength(pw) && letterDigit(pw) && twoDigit(pw)) {
			System.out.println("Correct password");
		}else System.out.println("Incorrect password");

	}
	public static boolean checkLength(String pw) {
		if(pw.length()>7) {
			return true;
		}else return false;
	}
	public static boolean letterDigit(String pw){
		for(int i=0; i < pw.length(); i++) {
			if(Character.isLetterOrDigit(pw.charAt(i))) {
				
			}else return false;
		}
		return true;
	}
	public static boolean twoDigit(String pw) {
		int count = 0;
		for(int i=0; i<pw.length(); i++) {
			if(Character.isDigit(pw.charAt(i))) {
				count++;
			}
		}
		if(count>1) {
			return true;
		}else return false;
	}
	

}

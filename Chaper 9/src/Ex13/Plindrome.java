package Ex13;
import java.util.Scanner;
public class Plindrome {
	
	
	public static void main(String[] args) {
		
		if ( args.length != 1) {
			 System.out.println(
			 "Enter the txt: ");
			 }
		Scanner input = new Scanner(System.in);
		args = new String[2];
		args [0] = input.nextLine();
		if(isPalindrome(args[0])) {
			System.out.println("palindrome");
		}else System.out.println("Not palindrome");

	}
	public static boolean isPalindrome(String s1) {
		StringBuilder sb  = new StringBuilder(s1);
		sb.reverse();
		String s2 = sb.toString();
		if(s1.equals(s2)) {
			return true;
		}else return false;
		
		
	}

}

package Ex2;
import java.util.Scanner;
public class CheckingSubstrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the SubString:");
		String s1 = input.nextLine();
		System.out.println("Enter the Main String:");
		String s2 = input.nextLine();
		if(isSubstring(s1, s2)) {
			System.out.println("("+s1+"): is Subsring of ("+s2+")");
		}else System.out.println("("+s1+"): is not Subsring of ("+s2+")");

	}
	public static boolean isSubstring(String s1, String s2) {
		if(s2.indexOf(s1)!=-1) {
			return true;
		}else return false;
		
	}

}

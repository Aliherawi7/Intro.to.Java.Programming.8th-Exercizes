package Ex1;
import java.util.Scanner;
public class CheckSSN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useDelimiter("-");
		int adad = 34;
		
		System.out.println("Enter the SSN:(xxx-xx-xxxx)");
		input.useDelimiter("-");
		String s = input.nextLine();
		if(isValid(s)) {
			System.out.println("Is Valid");
		}else System.out.println("Is Invalid");
	}
	public static boolean isValid(String s) {
		String[] s1 = s.split("-");
		for(int i =0; i<s1.length; i++) {
			int count = 0;
			for(int j =0; j<s1[i].length(); j++) {
				if(Character.isDigit(s1[i].charAt(j))) {	
				}else return false;
			}
		}
		if(s1[0].length()==3 && s1[1].length()==2 && s1[2].length()==4) {
			return true;
		}else return false;	
	}
	
	

}

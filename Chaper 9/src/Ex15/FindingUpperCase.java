package Ex15;
import java.util.Scanner;

public class FindingUpperCase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the text: ");
		String s = input.nextLine();
		int count = 0;
		for(int i =0; i <s.length(); i++) {
			if(s.charAt(i) >='A' && s.charAt(i) <='Z') {
				count++;
			}
		}
		System.out.println("Total number of uppercase: "+count);

	}

}

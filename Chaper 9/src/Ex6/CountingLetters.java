package Ex6;
import java.util.Scanner;

public class CountingLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the text");
		String s = input.nextLine();
		System.out.println("Total letters: "+countLetters(s));

	}
	public static int countLetters(String s) {
		int count =0;
		for(int i = 0; i<s.length(); i++) {
			if(Character.isLetter(s.charAt(i))) {
				count++;
			}
		}
		return count;
	}


}

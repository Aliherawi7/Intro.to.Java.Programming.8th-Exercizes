package Ex12;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the two words:");
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		if(isAnagram(s1, s2)) {
			System.out.println("Anagram");
		}else System.out.println("Not Anagram");
	}
	public static boolean isAnagram(String s1, String s2) {
		int num1 = 0;
		int num2 = 0;
		for(int i = 0; i < s1.length(); i++) {
			num1 += s1.charAt(i);
		}
		for(int i = 0; i < s2.length(); i++) {
			num2 += s2.charAt(i);
		}
		if(num1 == num2) {
			return true;
		}else return false;
	}

}

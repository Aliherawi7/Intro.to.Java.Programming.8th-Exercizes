package Ex4;
import java.util.Scanner;
public class OccurrencesOfASpecifiedCharacter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("***Enter the String and then the Character***");
		String str = input.nextLine();
		String ch = input.nextLine();
		char chr = ch.charAt(0);
		
		System.out.println("Total number of ("+chr+")is:"+count(str.toLowerCase(),Character.toLowerCase(chr)));
		
	}
	public static int count(String str, char a) {
		int count = 0;
		for(int i =0; i < str.length(); i++) {
			if(str.charAt(i) == a) {
				count++;
			}
		}
		return count;
	}

}

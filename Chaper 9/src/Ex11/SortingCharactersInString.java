package Ex11;
import java.util.Scanner;

public class SortingCharactersInString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a txt: ");
		String str = input.nextLine();
		System.out.println(sort(str));
	
	}
	public static String sort(String s){
		char [] str = s.toCharArray();
		for(int i = 0; i < str.length; i++) {
			char temp = str[i];
			int index = i;
			for (int j = i; j<str.length; j++) {
				if(str[j] < temp) {
					temp = str[j];
					index = j; 
				}
			}
			str[index] = str[i];
			str[i] = temp;
		}
		return new String(str);
	}

}

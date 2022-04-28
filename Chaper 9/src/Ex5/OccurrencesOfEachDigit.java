package Ex5;
import java.util.Scanner;
public class OccurrencesOfEachDigit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("***Type your String***");
		String str = input.nextLine();
		
		int [] digit = countDigit(str); 
		for(int i =0; i<digit.length; i++) {
			if(digit[i]>0) {
				System.out.println(i+": "+digit[i]);
			}
			
			
		}

	}
	public static int[] countDigit(String str) {
		int [] count = new int[10];
		for(int i =0; i< str.length(); i++) {
			if(Character.isDigit(str.charAt(i))){
				char temp = str.charAt(i);
				count[temp-'0']++;
				
			}
			
		}
		return count;
	}

}

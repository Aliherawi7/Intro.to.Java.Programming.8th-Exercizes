package ex13_7;
import java.util.Scanner;

public class ex13_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a binary String: ");
		String binaryTxt = input.nextLine();
		System.out.println("Decimal number is: "+ binaryToDecimal(binaryTxt));
	}
	public static int binaryToDecimal(String binaryTxt) throws NumberFormatException{
		int decimal = 0;
		int pow = binaryTxt.length()-1;
		for(int i = 0; i <binaryTxt.length(); i++) {
			
			int num = Character.getNumericValue(binaryTxt.charAt(i));
			
			if(num != 0 && num != 1) {
				throw new NumberFormatException();
			}
			decimal += num * Math.pow(2,pow);
			pow--;
		}
		
		return decimal;
	}
}

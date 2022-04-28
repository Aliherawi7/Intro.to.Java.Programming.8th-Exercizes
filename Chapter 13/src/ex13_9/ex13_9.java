package ex13_9;

import java.util.Scanner;

public class ex13_9 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a binary String: ");
		String binaryTxt = input.nextLine();
		try {
			System.out.println("Decimal number is: "+ binaryToDecimal(binaryTxt));
		}catch(BinaryFormatException ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	public static int binaryToDecimal(String binaryTxt) throws BinaryFormatException{
		int decimal = 0;
		int pow = binaryTxt.length()-1;
		for(int i = 0; i <binaryTxt.length(); i++) {
			
			int num = Character.getNumericValue(binaryTxt.charAt(i));
			if(num != 0 && num != 1) {
				throw new BinaryFormatException();
			}
			decimal += num * Math.pow(2,pow);
			pow--;
		}
		
		return decimal;
	}
	
}

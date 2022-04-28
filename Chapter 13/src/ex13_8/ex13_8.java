package ex13_8;

import java.util.Scanner;

public class ex13_8 {
	public static void main(String[] args) {
		 // Create a Scanner
		 Scanner input = new Scanner(System.in);
		
		 // Prompt the user to enter a string
		 System.out.print("Enter a hex number: ");
		 String hex = input.nextLine();
		try {
			System.out.println("The decimal value for hex number "
		 + hex + " is " + hexToDecimal(hex.toUpperCase()));
		}catch(HexFormatException ex){
			System.out.println(ex.getMessage());
		}
		 
		 }
		
		 public static int hexToDecimal(String hex)throws HexFormatException {
			 int decimalValue = 0;
			 for (int i = 0; i < hex.length(); i++) {
			 char hexChar = hex.charAt(i);
			 
			 //throw an exception if the character is not digit or alphabet
			 if(!Character.isDigit(hexChar) && !Character.isAlphabetic(hexChar)) {
				 throw new HexFormatException();
			 }
				 
			 
			 decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
			 }
			 return decimalValue;
		 }
		 
		 public static int hexCharToDecimal(char ch) {
			 if (ch >= 'A' && ch <= 'F')
				 return 10 + ch - 'A';
			 else // ch is '0', '1', ..., or '9'
				 return ch - '0';
		 }
}

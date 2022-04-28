package ex13_6;

import java.util.Scanner;

public class ex13_6 {
	 public static void main(String[] args) {
	 // Create a Scanner
	 Scanner input = new Scanner(System.in);
	
	 // Prompt the user to enter a string
	 System.out.print("Enter a hex number: ");
	 String hex = input.nextLine();
	
	 System.out.println("The decimal value for hex number "
	 + hex + " is " + hexToDecimal(hex.toUpperCase()));
	 }
	
	 public static int hexToDecimal(String hex)throws NumberFormatException {
		 int decimalValue = 0;
		 for (int i = 0; i < hex.length(); i++) {
		 char hexChar = hex.charAt(i);
		 
		 //throw an exception if the character is not digit or alphabet
		 if(!Character.isDigit(hexChar) && !Character.isAlphabetic(hexChar)) {
			 throw new NumberFormatException();
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

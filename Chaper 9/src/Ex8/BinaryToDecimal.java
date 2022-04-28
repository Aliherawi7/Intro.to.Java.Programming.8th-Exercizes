package Ex8;
import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a binary String: ");
		String binaryTxt = input.nextLine();
		int decimal = 0;
		int pow = binaryTxt.length()-1;
	
		for(int i = 0; i <binaryTxt.length(); i++) {
			int num = Character.getNumericValue(binaryTxt.charAt(i));
			decimal += num * Math.pow(2,pow);
			pow--;
		}
		System.out.println("Decimal number is: "+decimal);

	}

}

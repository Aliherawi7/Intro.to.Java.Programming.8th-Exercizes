package Ex10;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decimal number:");
		int decimal =  input.nextInt();
		String binary = decimalToBinary(decimal);
		System.out.println("Binary number: "+binary);
	}
	
	public static String decimalToBinary(int value) {
		String binary ="";
		StringBuilder sb = new StringBuilder(binary);
		int remain = 0;
		while(value >=2) {
			remain = value % 2;
			value /=2;
			sb.append(remain);
		}
		return sb.toString();
	}

}

package ex13_2;

import java.util.Scanner;

public class ex13_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		boolean controlLoop = true;
		do {
			System.out.println("_____________________");
			System.out.println("Enter two integers to sum: ");
			try {
			String num1 = input.next();
			String num2 = input.next();
			sum = Integer.parseInt(num1) + Integer.parseInt(num2);
			System.out.println(num1 +" + "+ num2 + " = "+sum);
			controlLoop = false;
			
		}catch(NumberFormatException ex) {
			System.out.println("wrong operand! Enter again");
		}
		
		}while(controlLoop);
		
		

	}

}

package Ex4;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MyStack ms = new MyStack();
		for(int i =0; i<3; i++) {
			System.out.println("Enter a text");
			 ms.add(sc.nextLine());
		}
		System.out.println();
		for(int i = 2; i>=0; i--) {
			System.out.print(ms.get(i)+", ");
		}
		
		
		

	}

}

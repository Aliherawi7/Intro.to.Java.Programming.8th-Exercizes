package ex13_3;

import java.util.Random;
import java.util.Scanner;

public class ex13_3 {

	public static void main(String[] args) {
		Random rand = new Random();
		int [] array = new int[100];
		for(int i =0; i<array.length; i++) {
			array[i] = rand.nextInt(1000);
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an index of array to print the value:");
		int index = input.nextInt();
		try {
			System.out.println("array ["+index+"] is: "+array[index]);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds.");
		}
		

	}

}

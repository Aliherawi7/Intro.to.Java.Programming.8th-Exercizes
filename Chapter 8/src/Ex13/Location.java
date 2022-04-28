package Ex13;
import java.util.Scanner;
public class Location {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of row and column of the array: ");
		int row = input.nextInt();
		int column = input.nextInt();
		double maxValue = 0;
		int r = 0, c = 0;
		Double [][] array = new Double[row][column];
		System.out.println("Enter the array");

		for (int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				double adad = input.nextDouble();
				array[i][j] = adad;
				if(adad > maxValue) {
					maxValue = adad;
					r = i;
					c = j;
				}	
			}
			
		}
		System.out.println("the maxValue is : "+maxValue +" at location ("+r+","+c+").");
		

	}

}

package Ex18;
import java.util.Scanner;
import java.io.*;
public class ProcessingScoresTextFile {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inputFile = new Scanner(System.in);
		System.out.println("Enter the file name and directory: ");
		String strDirectory = inputFile.nextLine();
		File file = new File(strDirectory);
		Scanner scanFile = new Scanner(file);
		double total =0;
		double average =0;
		int countNumbers =0;
		while(scanFile.hasNext()) {
			String hold = scanFile.nextLine();
			String[] holdNum = hold.trim().split(" ");
			for(int i = 0; i<holdNum.length; i++) {
				// if the string is a number, sum it.
				System.out.println(holdNum[i]);
				if(isNumber(holdNum[i])) {
					total += Double.parseDouble(holdNum[i]);
					countNumbers++;
				}
			}
			
		}
		average = total/countNumbers;
		System.out.println("the scores total: "+total+"\nthe scores average: "+average);
	}
	// check if the String is not a number.
	public static boolean isNumber(String s) {
		for(int i =0; i<s.length(); i++) {
			if(Character.isDigit(s.charAt(i))||s.charAt(i) == '.') {
				
			}else return false;
		}
		return true;
	}
}

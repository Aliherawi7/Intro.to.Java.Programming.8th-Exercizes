package Ex17;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountingCharactersWordsLines {

	public static void main(String[] args) throws FileNotFoundException {
		// get file name and directory
		Scanner inputFile = new Scanner(System.in);
		System.out.println("Enter the file directory: ");
		String strFileDirectory = inputFile.nextLine();
		// get the file
		File file = new File(strFileDirectory);
		// scan the file
		Scanner input = new Scanner(file);
		
		int charCount =0; //total number of Characters
		int wordCount =0; //total number of words
		int lineCount =0; //total number of lines
		// till the last line count!
		while(input.hasNext()) {
			String hold = input.nextLine();
			hold = hold.trim();
			// count the number of character
			for(int i =0; i< hold.length(); i++) {
				// the space is exclude
				if(!(hold.charAt(i)==' ')) {
					charCount++;
				}
			}
			// each line separate to a String array by space delimiter then get this array length.
			wordCount += hold.split(" ").length;
			// the line has been trimmed before, in here if the length of be greater than zero is include
			if(hold.length()>0) {
				lineCount++;
			}
			
		}
		System.out.println("this file has :\n"+charCount+" characters\n"+wordCount+" Words\n"+lineCount+" Lines");

	}

}

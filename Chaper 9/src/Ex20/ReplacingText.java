package Ex20;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplacingText {

	public static void main(String x[]) throws FileNotFoundException {
		if(x.length !=3) {
			System.out.println("Enter the file name , old String and new String");
			System.exit(0);
		}
		File file = new File(x[0]);
		if(!file.exists()) {
			System.out.println("the file not exist!");
			System.exit(0);
		}
		Scanner input = new Scanner(file);
		StringBuilder sb = new StringBuilder();
		
		while(input.hasNext()) {
			String s1 = input.nextLine();
			sb.append(s1.replaceAll(x[1], x[2])+"\n");
		}
		input.close();
		PrintWriter pw = new PrintWriter(file);
		pw.print(sb.toString());
		pw.close();
		
		
		
	
	}

}

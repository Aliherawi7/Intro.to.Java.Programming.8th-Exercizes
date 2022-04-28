package Ex16;
import java.io.*;
import java.util.Scanner;
import javax.swing.*;
public class ReformattingJavaSourceCode {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner inputFile = new Scanner(System.in);
		System.out.println("Enter file name with directory:");
		String fileName = inputFile.nextLine();
		File file = new File(fileName);
		Scanner input = new Scanner(file);
		
		StringBuilder sb =new StringBuilder();
		 while(input.hasNext()) {
			 String holder ="";
			 String line1 =input.nextLine();
			
			 if(line1.trim().startsWith("{")) {
				 //no action
			 }else if(!line1.trim().equals("") && !line1.trim().endsWith(";") && !line1.trim().equals("}")) {
				 holder += line1 + "{\n";
				 
			 }else {
				 holder +=line1 +"\n";
			 }
			 sb.append(holder);
		 }
		 PrintWriter pw = new PrintWriter(file);
		 pw.print(sb.toString());	 
		 pw.close();
		 
		 
		
	}
	
	
}

	

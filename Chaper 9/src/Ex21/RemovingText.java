package Ex21;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class RemovingText {

	public static void main(String[] args) throws FileNotFoundException {
		 if(args.length != 2) {
			 System.out.println("Enter the text and file name:");
			 System.exit(0);
		 }
		 File file = new  File(args[1]);
		 Scanner input = new Scanner(file);
		 StringBuilder sb = new StringBuilder();
		 String hold = "";
		 while(input.hasNext()) {
			 String s = input.nextLine();
			 sb.append(s.replaceAll(args[0], "")+"\n");
		 }
		 input.close();
		 PrintWriter pw = new PrintWriter(file);
		 pw.print(sb.toString());
		 pw.close();
		 
	}

}

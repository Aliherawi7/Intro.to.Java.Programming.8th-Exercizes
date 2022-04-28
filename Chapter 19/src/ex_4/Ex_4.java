package ex_4;

import java.io.*;
import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {
		try {
	
			Scanner txtInput = new Scanner(new FileInputStream("D://file.txt"));
			DataOutputStream file = new DataOutputStream(new FileOutputStream("D://txt.dat"));
			
			while(txtInput.hasNextLine()) {
				file.writeUTF(txtInput.nextLine());
			}
			txtInput.close();
			file.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}

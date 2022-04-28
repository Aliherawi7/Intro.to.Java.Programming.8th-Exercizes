package ex_1;

import java.io.*;


public class ex_1 {

	public static void main(String[] args) {
		
		try {
			
			PrintWriter file = new PrintWriter("D://Exercise19_1.txt");
			
			for(int i =0; i<100; i++) {
				int rand = (int) (Math.random()*1000);
				file.print(rand);
				file.print(" ");
			}
			file.close();
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}

	}

}

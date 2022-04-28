package ex_3;

import java.io.*;

public class ex_3 {

	public static void main(String[] args) {
		try {
			
			DataInputStream file = new DataInputStream(new FileInputStream("D://Exercise19_2.dat"));
			int num;
			int sum = 0;
			while(( num = file.read()) !=-1) {
				sum += num;
			}
			file.close();
			
			System.out.println("total nuber is : "+ sum);
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}

	}

}

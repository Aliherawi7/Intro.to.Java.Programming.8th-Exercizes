package ex_5;

import java.io.*;
import java.util.Date;

public class Ex_5 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		Date date = new java.util.Date();
		double db = 5.5;
		
		try {
			
			ObjectOutputStream saveObject = new ObjectOutputStream(new FileOutputStream("D://array.dat"));
			saveObject.writeObject(numbers);
			saveObject.writeObject(date);
			saveObject.writeObject(db);
			saveObject.close();
			
		}catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}

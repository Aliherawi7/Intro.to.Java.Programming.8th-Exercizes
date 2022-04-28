package ex_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ex_2 {

	public static void main(String[] args) {
		
		try {
			
			FileOutputStream file = new FileOutputStream("D://Exercise19_2.dat", true);
			
			for(int i =0; i<100; i++) {
				int rand = (int) (Math.random()*1000);
				file.write(rand);
			}
			file.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}

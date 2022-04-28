package ex_8;

import java.io.*;

public class Ex_8 {

	public static void main(String[] args) {
		try {
			RandomAccessFile inout = new RandomAccessFile("D://Ex_8.dat", "rw");
			int count = inout.read();
			count++;
			inout.seek(0);
			inout.write(count);
			inout.close();
			System.out.println(count);
			
		} catch (EOFException e) {
			
		} catch (IOException e) {
			
		}
		

	}

}

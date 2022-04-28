package ex_7;

import java.io.*;

import ex_6.Loan;

public class Ex_7 {

	public static void main(String[] args) throws EOFException{
		ObjectInputStream file;
		 double total = 0 ;
		try {
			file = new ObjectInputStream(new FileInputStream("D://Exercise19_6.dat"));
			
			while(true) {
				Loan object = (Loan)file.readObject();
				total += object.getLoanAmount();
			}
			
		}catch(EOFException ex) {
			
			System.out.println("total loan amount: "+total);
			
		}catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}

package ex_6;

import java.io.*;

public class ex_6 {

	public static void main(String[] args) {
		Loan l1 = new Loan(0.4, 2, 100);
		Loan l2 = new Loan(2.1, 3, 200);
		Loan l3 = new Loan(0.4, 1, 400);
		Loan l4 = new Loan(0.9, 4, 500);
		Loan l5 = new Loan(1.3, 2, 230);
		
		try {
			
			ObjectOutputStream saveLoan = new ObjectOutputStream(new FileOutputStream("D://Exercise19_6.dat"));
			saveLoan.writeObject(l1);
			saveLoan.writeObject(l2);
			saveLoan.writeObject(l3);
			saveLoan.writeObject(l4);
			saveLoan.writeObject(l5);
			saveLoan.close();
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		

	}

}

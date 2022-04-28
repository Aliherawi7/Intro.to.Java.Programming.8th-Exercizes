package ex13;

import java.math.BigInteger;

public class SquareNumbers {

	public static void main(String[] args) {
		
		
		for(int i =1; i <= 10; i++) {
			BigInteger bigInt = new BigInteger((Long.MAX_VALUE)+"");
			BigInteger bigInt1 = bigInt.add(new BigInteger(i+""));
			System.out.println("Number "+i+": " + bigInt1.multiply(bigInt1));
		}

	}

}

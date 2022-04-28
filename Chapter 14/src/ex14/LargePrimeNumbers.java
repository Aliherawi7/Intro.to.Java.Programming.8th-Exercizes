package ex14;
import java.math.BigInteger;

public class LargePrimeNumbers {

	public static void main(String[] args) {
		
		BigInteger[] primeHolder = new BigInteger[5];
		BigInteger bigInt = new BigInteger((Long.MAX_VALUE)+"");
		
		for(int i =0; i<5; i++) {
			primeHolder[i] = bigInt.nextProbablePrime();
			bigInt = bigInt.add(primeHolder[i]);
		}
		
		for(int i =0; i < primeHolder.length; i++) {
			System.out.println("primeNumber " +(i+1)+ ": "+primeHolder[i]);
		}
		

	}

}

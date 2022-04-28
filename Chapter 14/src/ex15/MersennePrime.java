package ex15;

import java.math.BigInteger;

public class MersennePrime {

	public static void main(String[] args) {
		System.out.println("p\t2^p-1");
		
		for(int i =2; i<=100; i++) {
			if(isPrime(new BigInteger(i+"")) && isPrime(calculateP(new BigInteger(i+"")))) {
				System.out.print(i+"\t"+calculateP(new BigInteger(i+"")));
				System.out.println();
			}
		}
	
	}
	
	public static BigInteger calculateP(BigInteger bigInt) {
		BigInteger p = new BigInteger("2");
		BigInteger counter = new BigInteger("1");
		while(bigInt.compareTo(counter) >0) {
			p = p.multiply(new BigInteger("2"));
			counter = counter.add(new BigInteger("1"));
		}
		return p.subtract(new BigInteger("1"));	
	}
	

	public static boolean isPrime(BigInteger a) {
		
		BigInteger counter = new BigInteger("2");
		while(a.compareTo(counter) >0) {
			BigInteger[] divider = a.divideAndRemainder(counter);
			if((divider[1].equals(new BigInteger("0")))) 
				return false;	
			counter = counter.add(new BigInteger("1"));
		}
		return true;
	}
		
	

}

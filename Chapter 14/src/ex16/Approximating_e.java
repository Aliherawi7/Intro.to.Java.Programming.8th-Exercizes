package ex16;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Approximating_e {

	public static void main(String[] args) {
		System.out.println("value for 100:  "+calculate_e(100));
		System.out.println("value for 200:  "+calculate_e(200));
		System.out.println("value for 1000:  "+calculate_e(1000));
	}
	public static BigDecimal calculateFactorail(int num) {
		BigDecimal bigInt = new BigDecimal("1");
		for(int i =1; i<=num; i++) {
			bigInt = bigInt.multiply(new BigDecimal(i + ""));
		}
		return (BigDecimal)bigInt;
	}
	public static BigDecimal calculate_e(int num) {
		BigDecimal e = BigDecimal.ONE;
		for(int i =1; i <= num; i++) {
			e = e.add(BigDecimal.ONE.divide(calculateFactorail(i),25,BigDecimal.ROUND_UP));
		}
		return e;
		
	}

}

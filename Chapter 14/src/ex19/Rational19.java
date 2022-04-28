package ex19;

import java.math.BigInteger;

import ex18.Rational18;
import ex20.Rational;

public class Rational19 {
	private BigInteger numerator ;
	private BigInteger denominator ;
	public Rational19() {
		this(new BigInteger("0"),new BigInteger("1"));
	}
	
	public Rational19(BigInteger numerator, BigInteger denominator) {
		BigInteger gcd = gcd(numerator, denominator);
		if(denominator.compareTo(BigInteger.ZERO) >0) {
			this.numerator = numerator.multiply(BigInteger.ONE).divide(gcd);
		}else if(denominator.compareTo(BigInteger.ZERO) < 0) {
			this.numerator = numerator.multiply(BigInteger.ONE.negate()).divide(gcd);
		}
		
		this.denominator = denominator.abs().divide(gcd);
	}
	
	private static BigInteger gcd(BigInteger n, BigInteger d) {
		BigInteger n1 = n.abs();
		BigInteger n2 = d.abs();
		 int gcd = 1;
		
		 for (int k = 1; n1.compareTo(new BigInteger(k+""))>=0 && n2.compareTo(new BigInteger(k+""))>=0; k++) {
			 
			 if (n1.remainder(new BigInteger(k+"")) == BigInteger.ZERO && n1.remainder(new BigInteger(k+"")) == BigInteger.ZERO)
			 gcd = k;
		 }
		 return new BigInteger(gcd+"");
	}
	
	public BigInteger getNumerator() {
		 return numerator;
	}
	
	public BigInteger getDenominator() {
		 return denominator;
	}
	
	public Rational19 add(Rational18 secondRational) {
		BigInteger n = numerator.multiply(new BigInteger(secondRational.getDenominator()+"")).
				add(denominator.multiply(new BigInteger(secondRational.getNumerator()+"")));
				 secondRational.getNumerator();
		BigInteger d = denominator.multiply(new BigInteger(secondRational.getDenominator()+""));
		return new Rational19(n, d);
	}
	
	public Rational19 subtract(Rational19 parm1) {
		BigInteger n = numerator.multiply(new BigInteger(parm1.getDenominator()+"")).
				subtract(denominator.multiply(new BigInteger(parm1.getNumerator()+"")));
				 parm1.getNumerator();
		BigInteger d = denominator.multiply(new BigInteger(parm1.getDenominator()+""));
		return new Rational19(n, d);
	}
	
	public Rational19 multiply(Rational secondRational) {
		BigInteger n = numerator.multiply(new BigInteger(secondRational.getNumerator()+""));
		BigInteger d = denominator.multiply(new BigInteger(secondRational.getDenominator()+""));
		return new Rational19(n, d);
	}
	
	public Rational19 divide(Rational18 secondRational) {
		BigInteger n = numerator.multiply(new BigInteger(secondRational.getDenominator()+""));
		BigInteger d = denominator.multiply(new BigInteger(secondRational.getNumerator()+""));
		return new Rational19(n, d);
	}
	public String toString() {
		if (denominator.equals(BigInteger.ONE))
			return numerator + "";
		else
			return numerator + "/" + denominator;
	}
	public boolean equals(Object parm1) {
		if (this.subtract((Rational19)(parm1)).getDenominator() == BigInteger.ZERO)
			return true;
		else
			return false;
	}
	
	public int intValue() {
		return (int)doubleValue();
	}
	
	public float floatValue() {
		return (float)doubleValue();
	}
	public double doubleValue() {
		return numerator.divide(denominator).doubleValue();
	}
	
	public long longValue() {
		return (long)doubleValue();
	}
	
	

}

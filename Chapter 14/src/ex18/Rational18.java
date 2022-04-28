package ex18;

public class Rational18 {
	private long[] r = new long[2];
	
	public Rational18() {
		this(0,1);
	}
	
	public Rational18(long numerator, long denominator) {
		long gcd = gcd(numerator, denominator);
		this.r[0] = ((denominator > 0) ? 1 : -1) * numerator / gcd;
		this.r[1] = Math.abs(denominator) / gcd;
	}
	
	private static long gcd(long n, long d) {
		 long n1 = Math.abs(n);
		 long n2 = Math.abs(d);
		 int gcd = 1;
		
		 for (int k = 1; k <= n1 && k <= n2; k++) {
			 if (n1 % k == 0 && n2 % k == 0)
			 gcd = k;
		 }
		 return gcd;
	}
	
	public long getNumerator() {
		 return r[0];
	}
	
	public long getDenominator() {
		 return r[1];
	}
	
	public Rational18 add(Rational18 secondRational) {
		long n = r[0] * secondRational.getDenominator() +
				r[1] * secondRational.getNumerator();
		long d = r[1] * secondRational.getDenominator();
		return new Rational18(n, d);
	}
	
	public Rational18 subtract(Rational18 secondRational) {
		long n = r[0] * secondRational.getDenominator()
		 - r[1] * secondRational.getNumerator();
		long d = r[1] * secondRational.getDenominator();
		return new Rational18(n, d);
	}
	public Rational18 divide(Rational18 secondRational) {
		long n = r[0] * secondRational.getDenominator();
		long d = r[1] * secondRational.r[0];
		return new Rational18(n, d);
	}
	public String toString() {
		if (r[1] == 1)
			return r[0] + "";
		else
			return r[0] + "/" + r[1];
	}
	public boolean equals(Object parm1) {
		if ((this.subtract((Rational18)(parm1))).getNumerator() == 0)
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
		return r[0] * 1.0 / r[1];
	}
	
	public long longValue() {
		return (long)doubleValue();
	}
	
	public int compareTo(Object o) {
		if ((this.subtract((Rational18)o)).getNumerator() > 0)
			return 1;
		else if ((this.subtract((Rational18)o)).getNumerator() < 0)
			return -1;
		else
			return 0;
	}
	
}

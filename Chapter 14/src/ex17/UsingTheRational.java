package ex17;
public class UsingTheRational {

	public static void main(String[] args) {
		Integer result =0;
		for(int i=1; i <= 100; i++) {
			Rational rational = new Rational(i, i+1);
			result = rational.intValue();
		}
		
		System.out.println(result);

	}

}


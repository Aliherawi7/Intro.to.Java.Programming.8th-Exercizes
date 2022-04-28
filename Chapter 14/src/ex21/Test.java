package ex21;

public class Test {

	public static void main(String[] args) {
		Complex co =new Complex(3.5, 5.5);
		Complex co1 =new Complex(-3.5, 1);
		Complex co3 =co.multiply(co1);
		System.out.printf(co3.getRealPart()+" + "+ co3.getImaginaryPart()+"i");

	}

}

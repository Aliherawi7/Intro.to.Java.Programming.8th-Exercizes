package ex7;

import ex5.Circle;

public class TestOctagon {

	public static void main(String[] args) throws CloneNotSupportedException {
		Octagon o1 = new Octagon(0);
		Octagon o2 = (Octagon) o1.clone();
		System.out.println(o1.compareTo(o2));

	}

}

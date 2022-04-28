package Ex6;

import javax.swing.JFrame;

public abstract class Test {

	public static void main(String[] args) {
		java.util.ArrayList L = new java.util.ArrayList();
		
		L.add(new JFrame());
		L.add(new java.util.Date());
		L.add(new Object());
		L.add("Hello world");
		for(int i=0; i<4; i++) {
			System.out.println(L.get(i).toString());
		}
	}

}

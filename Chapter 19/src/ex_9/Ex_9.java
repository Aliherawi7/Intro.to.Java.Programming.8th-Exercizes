package ex_9;

import java.util.Random;



public class Ex_9 {

	public static void main(String[] args) {
		sum(new Random(), new Random());

	}
	public static <E extends Random> void sum(E u, E i){
		System.out.println(u.nextDouble() + i.nextDouble());
		
	}

}

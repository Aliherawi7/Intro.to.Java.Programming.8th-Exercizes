package Ex10;
import java.util.Scanner;
public class TestQuadraticEquation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the parameter");
		double a, b, c;
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		 QuadraticEquation qE1 = new QuadraticEquation(a,b,c);
		 if(qE1.getDiscriminant()>0) {
			 System.out.println("X1: "+qE1.getRoot1()+"\nX2: "+qE1.getRoot2());
		 }else if(qE1.getDiscriminant()==0) {
			 System.out.println("X1: "+qE1.getRoot1());
		 }else System.out.println("The equation has no roots");
		 

	}

}

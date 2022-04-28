package Ex11;
import java.util.Scanner;
public class TestLinearEquation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the parameters of 2X2 linear Equation");
		double a, b, c, d, e, f;
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();
		LinearEquation LQ = new LinearEquation(a,b,c,d,e,f);
		if(LQ.isSolvable()==true) {
			System.out.println("x: "+LQ.getX()+"\t y: "+LQ.getY());
		}else System.out.println("The Equation has no solution");
		
		
		
	}

}

package ex20;
import ex20.Rational;
public class RationalCalculator {

	public static void main(String[] args) {
		if(args.length !=3) {
			System.out.println("Enter operand1 operand operand2");
			System.exit(0);
		}
		
	/* you can test it in console
 
		args = new String[3];
		args[0] = "5/3";
		args[1] = "+";
		args[2] = "2/3";
		
	*/
		String[] firstRational = args[0].split("/");
		String[] secondRational = args[2].split("/");
		
		
		
		Rational operand1 = new Rational(Long.parseLong(firstRational[0]), Long.parseLong(firstRational[1]));
		Rational operand2 = new Rational(Long.parseLong(secondRational[0]), Long.parseLong(secondRational[1]));
		Rational result = null;
		
		switch(args[1].charAt(0)) {
			case '+': result = operand1.add(operand2);
				break;
			case '-': result = operand1.subtract(operand2); 
				break;
			case '*': result = operand1.multiply(operand2);
				break;
			case '/': result = operand1.divide(operand2);		
		}
		System.out.println(operand1.toString()+" "+args[1]+" "+operand2.toString()+" = "+ result.toString());
		

	}

}

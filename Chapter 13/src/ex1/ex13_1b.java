package ex1;

public class ex13_1b {

	public static void main(String[] args) {
		
		if(args.length != 3) {
			System.out.println("Usage: number1 operator number2");
			System.exit(0);
		}
		
		int result = 0;
		boolean num1 = true, num2 = true;
		// check input 
		for(int i = 0; i<args[0].length(); i++) {
			if(! Character.isDigit(args[0].charAt(i)))
				num1 = false;
		}
		for(int i = 0; i<args[2].length(); i++) {
			if(! Character.isDigit(args[2].charAt(i)))
				num2 = false;
		}
		if(num1 && num2) {
			switch (args[1].charAt(0)) {
			case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
				break;
			case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
				break;
			case '*': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
				break;
			case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
			}
			System.out.println(args[0]+" "+ args[1]+" "+ args[2]+" = "+result);
		}else {
			String wrongOperand = "";
			if(! num1)
				wrongOperand = args[0];
			else wrongOperand = args[2];
			System.out.println("wrong operand type: " +wrongOperand);
		}

	}

}

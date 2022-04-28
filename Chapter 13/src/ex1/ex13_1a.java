package ex1;

public class ex13_1a {

	public static void main(String[] args) {
		
		if(args.length != 3) {
			System.out.println("Usage: number1 operator number2");
			System.exit(0);
		}
		
		int result = 0;
		try {
			switch(args[1].charAt(0)) {
			case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
				break;
			case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
				break;
			case '*': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
				break;
			case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
			
			}
			
			System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
			
		}catch(NumberFormatException ex) {
			System.out.print("wrong operand type " + ex.getMessage());
			
		}
		
		
		

	}

}

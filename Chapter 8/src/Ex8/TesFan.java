package Ex8;

public class TesFan {

	public static void main(String[] args) {
		Fan fan1 = new Fan();
		fan1.setSpeed(fan1.FAST);
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);
		
		Fan fan2 = new Fan();
		fan2.setSpeed(fan1.MEDIUM);
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.setOn(false);
		
		System.out.println(fan1.toString());
		System.out.println(fan2.toString());

	}

}

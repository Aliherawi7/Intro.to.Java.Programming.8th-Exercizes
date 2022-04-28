package Ex2;

public class BMI {
	private String name;
	private int age;
	private double weight;
	private double height;
	public static final double KILOGRAMS_PER_POUD = 0.45359237;
	public static final double METER_PER_INCH = 0.0254;
	
	public BMI(String name, int age, double weight, double height ) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	public BMI(String name, double weight, double height) {
		this(name, 20, weight, height);
	}
	public BMI(String name, int age, double weight, double feet, double inches) {
		this(name, age, weight,feet);
		
	}
	public double getBMI() {
		double bmi = weight * KILOGRAMS_PER_POUD / ((height * METER_PER_INCH)*(height * METER_PER_INCH));
		return Math.round(bmi*100)/100.0;
	}
	public String getStatus() {
		double bmi = getBMI();
		if(bmi < 16)
			return "Seriously underweight";
		else if (bmi < 18)
			return "Underweight";
		else if (bmi < 24)
			return "normal weight";
		else if (bmi < 29)
			return "overweight";
		else if (bmi < 35)
			return "seriously over weight";
		else 
			return "garvely over weight";
		
	}
	public String getName() {
		return name;
	}
	public int gerAge() {
		return age;
	}
	public double getWeight() {
		return weight;
	}
	public double getHeight() {
		return height;
	}
}

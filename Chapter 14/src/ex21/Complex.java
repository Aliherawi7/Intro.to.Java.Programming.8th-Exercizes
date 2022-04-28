package ex21;

public class Complex {
	
	// a = real  , b = imaginary
	 private double real;
	 private double imaginary;
	
	public Complex() {
		real = 0;
		imaginary = 0;
	}
	
	public Complex(double a) {
		this.real = a;
		this.imaginary = 0.0;
	}
	
	public Complex(double a, double b) {
		this.real = a;
		this.imaginary = b;
	}
	
	public Complex add(Complex num) {
		real = (real + num.real);
		imaginary = (imaginary + num.imaginary);
		return new Complex(real,imaginary);
	} 
	
	public Complex subtract(Complex num) {
		real = (real - num.real);
		imaginary = (imaginary - num.imaginary);
		return new Complex(real,imaginary);
	}
	
	public Complex multiply(Complex num) {
		real = ((real * num.real) - (imaginary * num.imaginary));
		imaginary = ((imaginary * num.real) + (real * num.imaginary));
		return new Complex(real,imaginary);
	}
	
	public Complex divide(Complex num) {
		real = ((real * num.real) + (imaginary * num.imaginary))
				/(num.real * num.real + num.imaginary * num.imaginary);
		
		imaginary = ((imaginary * num.real) - (real * num.imaginary))
					/(num.imaginary * num.imaginary + num.imaginary * num.imaginary);
		
		return new Complex(real, imaginary);
	}
	
	public double abs() {
		return Math.sqrt(Math.pow(real, 2) + Math.pow(imaginary, 2));
	}
	
	public double getRealPart(){
		return real;
	}
	
	public double getImaginaryPart(){
		return imaginary;
	}
	
	
	
	
}

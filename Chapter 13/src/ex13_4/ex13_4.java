package ex13_4;
public class ex13_4 {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;
	
	/** Default constructor */
	public ex13_4() {
		this(2.5, 1, 1000);
	}
	
	 /** Construct a loan with specified annual interest rate,
	 number of years, and loan amount
	 */
	public ex13_4(double annualInterestRate, int numberOfYears,double loanAmount) throws IllegalArgumentException{
		if(annualInterestRate >0 && numberOfYears >0 && loanAmount >0) {
			this.annualInterestRate = annualInterestRate;
			this.numberOfYears = numberOfYears;
			this.loanAmount = loanAmount;
			loanDate = new java.util.Date();
		}else { 
			throw new IllegalArgumentException();
		}
	 }
	
	 /** Return annualInterestRate */
	 public double getAnnualInterestRate() {
		 return annualInterestRate;
	 }
	
	
	
	
	 /** Set a new annualInterestRate */
	 public void setAnnualInterestRate(double annualInterestRate)throws IllegalArgumentException {
		 if(annualInterestRate >0) {
			 this.annualInterestRate = annualInterestRate;
		 }else 
			 throw new IllegalArgumentException();
	 }
	
	 /** Return numberOfYears */
	 public int getNumberOfYears() {
		 return numberOfYears;
	 }
	
	 /** Set a new numberOfYears */
	 public void setNumberOfYears(int numberOfYears)throws IllegalArgumentException {
		 if(numberOfYears >0) {
			 this.numberOfYears = numberOfYears;
		 }else 
			 throw new IllegalArgumentException();
		 
	 }
	
	 /** Return loanAmount */
	 public double getLoanAmount() {
		 return loanAmount;
	 }
	
	 /** Set a newloanAmount */
	 public void setLoanAmount(double loanAmount)throws IllegalArgumentException {
		 if(loanAmount >0) {
			 this.loanAmount = loanAmount;
		 }else 
			 throw new IllegalArgumentException();
	 }
	
	 /** Find monthly payment */
	 public double getMonthlyPayment() {
		 double monthlyInterestRate = annualInterestRate / 1200;
		 double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
		 (Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
		 return monthlyPayment;
	 }
	
	 /** Find total payment */
	 public double getTotalPayment() {
		 double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		 return totalPayment;
	 }
	
	 /** Return loan date */
	 public java.util.Date getLoanDate() {
		 return loanDate;
	 }
}


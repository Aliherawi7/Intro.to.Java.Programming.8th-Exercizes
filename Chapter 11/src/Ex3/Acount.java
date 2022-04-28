package Ex3;
import java.util.Date;

public class Acount {
	private int id;
	private double balance;
	private double annualInterestRate;
	private java.util.Date createdDate;
	
	
	public Acount(){
		this.id = 0;
		this.balance =0;
		this.annualInterestRate = 0;
		createdDate = new java.util.Date();
	 }
	public Acount(int id, double balance){
		 this.id = id;
		 this.balance = balance;
		 this.annualInterestRate = 0;
		 createdDate = new java.util.Date();
		 
	 }
	public Acount(int id, double balance, double annualInterestRate){
		 this.id = id;
		 this.balance = balance;
		 this.annualInterestRate =annualInterestRate;
		 createdDate = new java.util.Date();
	 }
	 
	 public void dateCreated() {
		 System.out.println(createdDate);
	 }
	 public double getMonthlyInterestRate(int date) {
		double rate = this.balance;
	   	if(createdDate.getDay() == new java.util.Date().getDay()) {
	   		int years = new java.util.Date().getYear()-createdDate.getYear();
	   		int months = new java.util.Date().getMonth()-createdDate.getMonth();
	   		if(years != 0)
	   			months += ((years-1)*12);

	   		for(int i=1; i<= months; i++) {
	   			rate += annualInterestRate*rate;
	   		}
			 
			 return rate;
		}
		return 0;
	 }
	 public void withdraw(double withdraw) {
		 System.out.println("The withdraw amount is :"+withdraw);
		 balance -= withdraw;
		 System.out.println("Acount amount balance:"+balance);
	 }
	 public void deposit(double deposit) {
		 this.balance = deposit;
	 }
	 
}
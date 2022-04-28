package Ex8;

import java.util.ArrayList;

public class Acount {
	private int id;
	private String name;
	private double balance;
	private double annualInterestRate;
	private java.util.Date createdDate;
	public java.util.ArrayList<Object> transactions = new java.util.ArrayList();
	
	public Acount(){
		this.id = 0;
		this.balance =0;
		this.annualInterestRate = 0;
		createdDate = new java.util.Date();
	 }
	
	// the new constructor
	public Acount(String name, int id, double balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
	
	public Acount(int id, double balance, double annualInterestRate){
		 this.id = id;
		 this.balance = balance;
		 this.annualInterestRate = annualInterestRate;
		 createdDate = new java.util.Date();
	 }
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Object getTransactions(int index) {
		return transactions.get(index);
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
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
		 balance -= withdraw;
		 transactions.add((Object)new Transaction('W', withdraw, balance,"successfuly"));
		
		 
	 }
	 public void deposit(double deposit) {
		 this.balance += deposit;
		 Transaction o = new Transaction('D', deposit, balance, "successfuly");
		 transactions.add((o));
	 }
	
}

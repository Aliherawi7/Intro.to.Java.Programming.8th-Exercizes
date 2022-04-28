package Ex8;

public class Transaction {
	java.util.Date date;
	char type;
	double amount;
	double balance;
	String description;
	
	public Transaction(char type, double amount, double balance, String description) {
		date = new java.util.Date();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
		/**
		System.out.println("Transaction: \n"+"Date: "+date+"   Type:"+type+ "    amount: " + amount + 
				            "    balance: "+ balance +"   Description:" );
		*/
	}
	
}

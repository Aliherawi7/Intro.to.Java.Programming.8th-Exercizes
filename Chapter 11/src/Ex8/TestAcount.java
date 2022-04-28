package Ex8;

public class TestAcount {

	public static void main(String[] args) {
		Acount acount = new Acount("Ahmad", 1122, 1000);
		acount.setAnnualInterestRate(1.5);
		System.out.println("User name: "+acount.getName()+"   intrest rate: "+ 
							acount.getAnnualInterestRate()+"    Balance: "+acount.getBalance());
		acount.deposit(30);
		acount.deposit(40);
		acount.deposit(50);
		acount.withdraw(5);
		acount.withdraw(4);
		acount.withdraw(2);
		acount.transactions.get(0);
		
		System.out.println("Transactions: ");
		int counter =0;
		while(counter < acount.transactions.size()) {
			Transaction t = (Transaction) acount.transactions.get(counter);
			System.out.println("Date:  " + t.date + "   Type: " + t.type + "   amount: " + t.amount + "   balance: " + t.balance);
			counter++;
		}
		
	}

}

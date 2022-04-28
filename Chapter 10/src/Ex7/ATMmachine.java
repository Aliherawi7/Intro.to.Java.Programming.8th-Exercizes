package Ex7;
import java.util.Scanner;

public class ATMmachine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Id: ");
		int id = sc.nextInt();
		Acount [] acountArray = new Acount[10];
		
		for(int i=0; i < acountArray.length; i++) {
			acountArray[i] = new Acount(i, 100);
		}
		if(id >=0 && id <=10) {
			System.out.println("Main menu"+"\n1: check balance\n2: withdraw\n3: deposit\n4: exit\nEnter a choice: ");
		}
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		if(choice == 1) {
			System.out.println(acountArray[id].getBalance());
		}else if(choice == 2) {
			System.out.println("Enter an amount to withdraw:");
			int withrawAmount = input.nextInt();
			acountArray[id].setBalance(acountArray[id].getBalance()-withrawAmount);
		}else if(choice == 3) {
			System.out.println("Enter an amount to withdraw:");
			int desposeAmount = input.nextInt();
			acountArray[id].setBalance(acountArray[id].getBalance()+desposeAmount);
		}else if(choice == 4)
			System.exit(0);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
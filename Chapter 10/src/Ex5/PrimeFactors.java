package Ex5;
import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a number to decompse it:");
		int num = input.nextInt();
		int[] primeFactors = dissection(num);

		StackOfInteger  stack = new StackOfInteger();
	
		for (int i = 0; i < primeFactors.length; i++)
			 stack.push(primeFactors[i]);
		 
		while (!stack.empty())
			  System.out.print(stack.pop() + " ");
			 
		 
	}
	// this method decompose the number
	public static int[] dissection(int num) {
		int[] primFactorArray;
		String holdFactors ="";
		while(num >1) {
			int maqsome;
			if(! isPrime(num)) {
				maqsome = dividable(num);
				num /= maqsome;
				holdFactors += maqsome+" ";
				
			}else {
				maqsome = num;
				holdFactors += maqsome+" ";
				num /= maqsome;
			}
		}
		// get the numbers from holdFactors to a String Array
		String [] StringFactors = holdFactors.split(" ");
		primFactorArray = new int[StringFactors.length];
		for(int i=0; i<primFactorArray.length; i++) {
			primFactorArray[i] = Integer.parseInt(StringFactors[i]);
		}
		return primFactorArray;
		
		
	}
	// check if the number is prime;
	public static boolean isPrime(int num) {
		for(int i =2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	// find the prime number which the number is dividable by it
	public static int dividable(int num) {
		int[] primes = {2, 3, 5, 7, 11, 13, 17};
		for(int i=0; i<primes.length; i++) {
			if(num % primes[i] ==0)
				return primes[i];
		}
		return num;
	}

}

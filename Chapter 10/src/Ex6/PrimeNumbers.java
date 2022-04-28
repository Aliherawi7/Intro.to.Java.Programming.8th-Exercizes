package Ex6;

public class PrimeNumbers {

	public static void main(String[] args) {
		int num = 120;
		int [] primeNumbers;
		String holdNumber = "";
		int count =0;
		for(int i =2; i<= num; i++) {
			boolean b = false;
			for(int j=2; j< i; j++) {
				if(i%j ==0) 
					b = true;
				
			}
			if(!b) {
				holdNumber += i+" ";
			}
		}
		String[] sArray = holdNumber.split(" ");
		primeNumbers = new int[sArray.length];
		for(int i=0; i < primeNumbers.length; i++) {
			primeNumbers[i] = Integer.parseInt(sArray[i]);
		}
		StackOfInteger stack = new StackOfInteger();
		for(int i =0; i < primeNumbers.length; i++) {
			stack.push(primeNumbers[i]);
		}
		while(! stack.empty())
			System.out.print(stack.pop()+" ");
		
		
	}

}

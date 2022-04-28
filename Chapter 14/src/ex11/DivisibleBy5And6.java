package ex11;

import java.math.BigInteger;

public class DivisibleBy5And6 {

	public static void main(String[] args) {
		
		
		String divisibleBy6 = "";
		String divisibleBy5 = "";
		int dividerCounter = 0;
		
		
		// finding for number 6
		for(int i =1; dividerCounter < 10 ; i++) {
			
			// Long.Max_Value + i
			BigInteger Bi = new BigInteger(Long.MAX_VALUE+"");
			BigInteger afterAddedCounter = Bi.add(new BigInteger(i+""));
			// (Long.Max_Value + i)/5 and 6
			BigInteger [] arrayToGetRemainder5 = afterAddedCounter.divideAndRemainder(new BigInteger(5+""));
			BigInteger [] arrayToGetRemainder6 = afterAddedCounter.divideAndRemainder(new BigInteger(6+""));
				// if the number is divisible by 5
				if(arrayToGetRemainder5[1].compareTo(new BigInteger(0+"")) == 0) {
					divisibleBy5 +="\n"+afterAddedCounter.toString()+"";
					dividerCounter++;
					
				// if the number is divisible by 6
				}else if(arrayToGetRemainder6[1].compareTo(new BigInteger(0+"")) == 0) {
					divisibleBy6 +="\n"+afterAddedCounter.toString()+"";
					dividerCounter++;
				}
				
			
		}
		
		
		
		System.out.println("Divisible by 5: "+divisibleBy5);
		System.out.println(".....................");
		System.out.println("Divisible by 6: "+divisibleBy6);
		
	}

}

package Ex30;

public class Financial {

	public static void main(String[] args) {
		//test number:
		// 4388576018402626 || 4388576018410707
		if(isValid("4388576018402626")) {
			System.out.println("is valid");
		}else System.out.println("is invalid");
		
		

	}
	/** Return true if the card number is valid */
	public static boolean isValid(String cardNumber) {
		if((sumOfDoubleEvenPlace(cardNumber)+sumOfOddPlace(cardNumber))%10==0){
			
			return true;
		}else return false;
	}
	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(String cardNumber) {
		int sum =0;
		for(int i =cardNumber.length()-2; i>=0; i-=2) {
			int doubleNumber =2* (Character.getNumericValue(cardNumber.charAt(i)));
			sum +=getDigit(doubleNumber);
		}
		return sum;
	}
	/** Return this number if it is a single digit; otherwise,
	* return the sum of the two digits */
	public static int getDigit(int number) {
		if(number>=0 && number <=9) {
			return number;
		}else {
			int a= number%10;
			number/=10;
			return a+number;
		}
	}
	/** Return sum of odd place digits in number */
	public static int sumOfOddPlace(String cardNumber) {
		int sum =0;
		for(int i =cardNumber.length()-1; i>=0; i-=2) {
			 sum += (Character.getNumericValue(cardNumber.charAt(i)));
		}
		return sum;
	}

}

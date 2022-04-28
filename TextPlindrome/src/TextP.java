import java.util.Scanner;
public class TextP {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a text");
		String s = input.nextLine();
		
		System.out.println("is ("+s+") plindrome? "+isPlindrome(s.toLowerCase()));
		;
	}
	public static boolean isPlindrome(String s) {
		int low =0, high = s.length()-1;
		for(int i = 0; i<=high; i++) {
			if(s.charAt(low)!=(s.charAt(high))){
				return false;
			}else {
				low++;
				high--;
			}
		}
		return true;
	}
}

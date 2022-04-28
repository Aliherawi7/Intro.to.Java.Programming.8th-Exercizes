package Ex32;
import java.util.Scanner;

public class CheckingISBN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		String str = sc.nextLine();
		
		int sum=0;
		int multiple =1;
		for(int i =0; i<9; i++) {
			sum += multiple*Character.getNumericValue(str.charAt(i));
			multiple++;
			
		}
		StringBuilder sb = new StringBuilder(str);
		if(sum%11==10) {
			sb.append('X');
		}else sb.append(sum%11);
		System.out.println(sb.toString());
	}

}

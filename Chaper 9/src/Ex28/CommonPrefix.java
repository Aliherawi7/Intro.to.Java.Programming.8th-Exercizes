package Ex28;
import java.util.Scanner;

public class CommonPrefix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the words:");
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		System.out.println(prefix(s1,s2));

	}
	public static String prefix(String s1, String s2) {
		String [] CommonPrefix = {"dis", "in","pro","sub"}; // you can add more!
		String holder ="";
		String empty ="";
		int count =0;
		while(s1.charAt(count)==s2.charAt(count)) {
			holder += s1.charAt(count);
			count++;
		}
		for(int i=0; i< CommonPrefix.length; i++) {
			if(holder.equalsIgnoreCase(CommonPrefix[i])) {
				return holder;
			}
		}
		return empty;
	}

}

package ex9;
import java.util.Date;

public class FindingTheLargestObject {

	public static void main(String[] args) {
		Comparable[] stringArray = {"computes", "determined", "display", "program",
				"calendar", "year", "ten", "this","divisible", "january"};
		
		Comparable[] intArray = {32, 65, 35, 45, 623, 65, 345, 753, 324, 633};
		
		Comparable[] dateArray = {new Date(2015,7,3), new Date(2016,8,3), new Date(2017,6,3), 
				new Date(2019,2,8), new Date(2011,7,3), new Date(2012,8,26), new Date(2018,6,3), 
				new Date(2014,2,3), new Date(2013,2,23), new Date(2012,2,13), };
		

		
		System.out.println(max(stringArray));
		System.out.println(max(intArray));
		System.out.println(max(dateArray));

	}

	public static Object max(Comparable[] a) {
		Comparable obj = a[0];
		
		for(int i=1; i < a.length; i++) {
			if(a[i].compareTo(obj) == 1) {
				obj = a[i];
			}
		}
		return obj;
		
	}
}

package Ex5;
import java.util.GregorianCalendar;
public class Time {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("Year:"+gc.get(GregorianCalendar.YEAR)+" Month:"
		+gc.get(GregorianCalendar.MONTH)+" Day:"+gc.get(GregorianCalendar.DAY_OF_MONTH));
		gc.setTimeInMillis(1234567898765l);
		System.out.println(gc.getTime());
		
	}

}

package Ex6;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class tes2 {
	public static void main(String[] args) {
		String yearInp = JOptionPane.showInputDialog("Enter the year number");
		int year = Integer.parseInt(yearInp);
		String monthInp = JOptionPane.showInputDialog("Enter the month a number between 1 to 12");
		int month = Integer.parseInt(monthInp);
		JOptionPane.showMessageDialog(null, PrintClass.printMonthTitle(year,month)+PrintClass.printMonthBody(year, month));
	}
}

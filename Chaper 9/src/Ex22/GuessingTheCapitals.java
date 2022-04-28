package Ex22;
import javax.swing.JOptionPane;

public class GuessingTheCapitals {

	public static void main(String[] args) {
		String [][] capitals = new String[5][2];
		capitals[0][0] = "Afghanistan";
		capitals[0][1] = "Kabul";
		capitals[1][0] = "Iran";
		capitals[1][1] = "Tehran";
		capitals[2][0] = "India";
		capitals[2][1] = "Dehly naw";
		capitals[3][0] = "Turkey";
		capitals[3][1] = "Istanbul";
		capitals[4][0] = "Tajikistan";
		capitals[4][1] = "Doshanbe";
	
		int answerCount =0;
		for(int i =0; i<capitals.length; i++) {
			String str = JOptionPane.showInputDialog(null, "Enter the capital of "+capitals[i][0]);
			if(str.equals(capitals[i][1])) {
				JOptionPane.showMessageDialog(null, "Your answer is correct");
				answerCount++;
			}else JOptionPane.showMessageDialog(null, " Wrong!!!");
		}
		JOptionPane.showMessageDialog(null, "Total of correct answer is : "+answerCount);

	}

}

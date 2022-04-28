package ex10;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DisplayingCheckerboard {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setLayout(new GridLayout(8,1));
		
		for(int i =1; i<=4; i++) {
			JPanel p1 = new JPanel(new GridLayout(1,8));
			JPanel p2 = new JPanel(new GridLayout(1,8));
				// create the row that starts with white button
				for(int j =1; j <= 4; j++) {
					JButton jb1 = new JButton();
					jb1.setBackground(Color.WHITE);
					p1.add(jb1);
					JButton jb2 = new JButton();
					jb2.setBackground(Color.BLACK);
					p1.add(jb2);
						
				}
				// create the row that starts with Black button
				for(int j =1; j <= 4; j++) {
					JButton jb1 = new JButton();
					jb1.setBackground(Color.BLACK);
					p2.add(jb1);
					JButton jb2 = new JButton();
					jb2.setBackground(Color.WHITE);
					p2.add(jb2);
					
					
				}
				// add both rows to the frame. the for loop does it at four times
				frame.add(p1);
				frame.add(p2);
		}
		
		
		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}

package ex8;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class SwingCommonFeatures {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setLayout(new GridLayout(2,3));
		JLabel[] label =new JLabel[6];
		
		Font font =new Font("TimesRoman", Font.BOLD, 20);
		String[] labelName = {"Black", "Blue", "cyan", "green", "magenta", "orange"};
		Color[] colorList = {Color.black, Color.blue, Color.cyan, Color.green, Color.magenta, Color.orange};
		String t ="BB";
		for (int i =0; i<=5; i++) {
			
			label[i] = new JLabel(labelName[i]);
			label[i].setBackground(Color.BLACK);
			label[i].setForeground(colorList[i]);
			label[i].setBorder(new LineBorder(Color.BLACK,1));
			label[i].setFont(font);
			frame.add(label[i]);
		}
		
		frame.setSize(300,300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		
		
		
		
	}

}

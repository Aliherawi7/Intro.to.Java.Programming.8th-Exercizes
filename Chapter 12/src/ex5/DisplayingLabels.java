package ex5;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
public class DisplayingLabels {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setLayout(new GridLayout(4,1));
		
		Font font = new Font("Arial",Font.BOLD,15);
		
		JLabel lebal1 = new JLabel("Department of computer science");
		JLabel lebal2 = new JLabel("School of Computing");
		JLabel lebal3 = new JLabel("Armstrong Atlantic state university");
		JLabel lebal4 = new JLabel("Tel(+93)78-594-9459");
		
		Border lineBorder = new LineBorder(Color.BLACK, 1);
		
		lebal1.setFont(font);
		lebal2.setFont(font);
		lebal3.setFont(font);
		lebal4.setFont(font);
		
		lebal1.setBorder(lineBorder);
		lebal2.setBorder(lineBorder);
		lebal3.setBorder(lineBorder);
		lebal4.setBorder(lineBorder);
		
		//frame setting
		f.add(lebal1);
		f.add(lebal4);
		f.add(lebal2);
		f.add(lebal3);
		f.add(lebal4);
		f.setSize(270, 150);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
		

	}

}

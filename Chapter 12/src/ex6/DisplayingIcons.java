package ex6;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.*;
public class DisplayingIcons {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setLayout(new GridLayout(2,2));
		ImageIcon icon1 = new ImageIcon("D:\\Photos\\Icons\\2.jpg");
		ImageIcon icon2 = new ImageIcon("D:\\Photos\\Icons\\2.jpg");
		ImageIcon icon3 = new ImageIcon("D:\\Photos\\Icons\\2.jpg");
		ImageIcon icon4 = new ImageIcon("D:\\Photos\\Icons\\2.jpg");
		
		frame.add(new JLabel(icon1));
		frame.add(new JLabel(icon2));
		frame.add(new JLabel(icon3));
		frame.add(new JLabel(icon4));
		
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}

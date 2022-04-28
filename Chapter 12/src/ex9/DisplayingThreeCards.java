package ex9;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class DisplayingThreeCards {

	public static void main(String[] args) {
		Random rand = new Random();
		JFrame frame = new JFrame();
		frame.setLayout(new GridLayout(1,3,5,5));
		JLabel label ;
		ImageIcon image;
		for(int i =1; i<=3; i++) {
			int randNum  = rand.nextInt(55);
			
			image = new ImageIcon("D:\\image\\"+randNum+".jpg");
			label = new JLabel(image);
			label.setBorder(new LineBorder(Color.BLACK,1));
			frame.add(label);
		}
		
		frame.setSize(400,200);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		

	}

}

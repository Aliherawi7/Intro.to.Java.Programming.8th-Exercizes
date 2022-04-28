package ex7;

import java.awt.GridLayout;

import javax.swing.*;

public class TicTacToeBoard {

	public static void main(String[] args) {
		ImageIcon [] icons = new ImageIcon[3];
		icons[0] = new ImageIcon("C:\\x.jpg");
		icons[1] = new ImageIcon("C:\\o.jpg");
		icons[2] = new ImageIcon();
		JFrame frame = new JFrame("Exercise 12.7");
		frame.setLayout(new GridLayout(3,3));
		for(int i =0; i<=9; i++) {
			int rand = (int) ((Math.random()*10))%3;
			frame.add(new JLabel(icons[rand]));
		}
		frame.setSize(600,600);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}
}

package ex3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class UsingGridLayout {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setLayout(new BorderLayout());
		JPanel p1 = new JPanel(new GridLayout(2,3));
		JPanel p2 = new JPanel(new GridLayout(2,3));
		for(int i=1; i<=3; i++) {
			p1.add(new JButton("Button"+i));
			p2.add(new JButton("Button"+(i+3)));
		}
		
		f.setSize(600,120);
		f.add(p1, BorderLayout.SOUTH);
		f.add(p2, BorderLayout.CENTER);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}


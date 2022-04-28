package ex1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class UsingFlowLayoutManager {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		for(int i=1; i<=3; i++) {
			p1.add(new JButton("Button"+i));
			p2.add(new JButton("Button"+(i+3)));
		}
		
		f.setSize(600,90);
		f.add(p1);
		f.add(p2);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}

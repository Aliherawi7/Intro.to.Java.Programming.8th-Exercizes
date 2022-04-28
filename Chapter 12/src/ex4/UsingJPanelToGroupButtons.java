package ex4;

import java.awt.BorderLayout;
import javax.swing.*;


public class UsingJPanelToGroupButtons {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setLayout(new BorderLayout());
		f.add(new MyPanel(), BorderLayout.SOUTH);
		f.add(new MyPanel(), BorderLayout.CENTER);
		f.setSize(300,120);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}

class MyPanel extends JPanel{
	public MyPanel() {
		add(new JButton("Button 1"));
		add(new JButton("Button 2"));
		add(new JButton("Button 3"));
	}
}

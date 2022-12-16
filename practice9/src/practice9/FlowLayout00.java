package practice9;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FlowLayout00 extends JFrame {
	private JLabel[] label = new JLabel[16];
	public FlowLayout00() {
		setTitle("FlowLayout Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 15));
		
		for(int i=1; i<label.length; i++) {
			label[i] = new JLabel(Integer.toString(i));			
			c.add(new JButton("버튼"+i));
		}
		setSize(450, 300);
		setVisible(true);
	}
	public static void main(String[] args) {		    
		new FlowLayout00();
	}
}

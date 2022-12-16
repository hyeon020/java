package practice9;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorTest00 extends JFrame {
	private JLabel[] label = new JLabel[12];
	
	public ColorTest00() {
		super("3x4 color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,3));
		
		for(int i=0; i<label.length; i++) {
			label[i] = new JLabel(Integer.toString(i));
			label[i].setOpaque(true);
			label[i].setBackground(Color.white);
			c.add(label[i]);
			label[i].addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					JLabel label = (JLabel)e.getSource();
					int r = (int)(Math.random()*256);
					int g = (int)(Math.random()*256);
					int b = (int)(Math.random()*256);
					label.setBackground(new Color(r, g, b));
				}
			});
		}
		setSize(300, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ColorTest00();
	}
}

package practice8;
import javax.swing.*;
import java.awt.*;

public class FlowLayout00 extends JFrame {
	public FlowLayout00() {
		setTitle("FlowLayout Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 15));
		
		contentPane.add(new JButton("버튼1"));
		contentPane.add(new JButton("버튼2"));
		contentPane.add(new JButton("버튼3"));
		contentPane.add(new JButton("버튼4"));
		contentPane.add(new JButton("버튼5"));
		contentPane.add(new JButton("버튼6"));
		contentPane.add(new JButton("버튼7"));
		contentPane.add(new JButton("버튼8"));
		contentPane.add(new JButton("버튼9"));
		contentPane.add(new JButton("버튼10"));
		contentPane.add(new JButton("버튼11"));
		contentPane.add(new JButton("버튼12"));
		contentPane.add(new JButton("버튼13"));
		contentPane.add(new JButton("버튼14"));
		contentPane.add(new JButton("버튼15"));
		
		
		
		setSize(450, 300);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new FlowLayout00();
	}
}

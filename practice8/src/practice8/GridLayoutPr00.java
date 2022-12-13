package practice8;
import javax.swing.*;
import java.awt.*;

public class GridLayoutPr00 extends JFrame {
	public GridLayoutPr00() {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new GridLayout(1, 10));
		
		Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
				Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK,
				Color.LIGHT_GRAY };
		
		for(int i=0; i<10; i++) {
			JButton button = new JButton(Integer.toString(i));
			button.setOpaque(true);
			button.setBackground(color[i]);
			contentPane.add(button);
		}
		setSize(500, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutPr00();
	}
}

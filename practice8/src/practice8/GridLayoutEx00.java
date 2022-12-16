package practice8;
import javax.swing.*;
import java.awt.*;

public class GridLayoutEx00 extends JFrame {
	public GridLayoutEx00() {
		super("GridLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new GridLayout(1, 10)); //girdLayout 위치 지정
		
		for(int i=0; i<10; i++) { //i는 0부터 9까지
			String text = Integer.toString(i);
			JButton button = new JButton(text);
			contentPane.add(button);
		}
		setSize(500, 200); //사이즈 지정
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutEx00();
	}
}

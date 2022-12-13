package practice8;
import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx00 extends JFrame {
	public BorderLayoutEx00() {
		setTitle("BorderLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new BorderLayout(30, 20));
		
		contentPane.add(new JButton("Calculate"), BorderLayout.CENTER); //중앙에 calculate 버튼 지정
		contentPane.add(new JButton("add"), BorderLayout.NORTH); //북쪽에 add버튼 지정
		contentPane.add(new JButton("sub"), BorderLayout.SOUTH); //남쪽에 sub버튼 지정
		contentPane.add(new JButton("mul"), BorderLayout.EAST); //동쪽에 mul버튼 지정
		contentPane.add(new JButton("div"), BorderLayout.WEST); //서쪽에 dib버튼 지정
		
		setSize(300, 200); //사이즈 지정
		setVisible(true);

	}
	public static void main(String [] args) {
		new BorderLayoutEx00();
	}
}

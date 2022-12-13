package practice8;
import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("OK")); //버튼 OK 추가
		contentPane.add(new JButton("Cancel")); //버튼 Cancel 추가
		contentPane.add(new JButton("Ignore")); //버튼 Ignore 추가
		
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new ContentPaneEx();
	}
}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoveJava00 extends JFrame{
	private Font f;
	private int size;
	public LoveJava00()
	{
		setTitle("+,- 키로 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel(" Love Java");
		la.setFont(new Font("Arial", Font.PLAIN, 30));
		la.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {	
				if(e.getKeyChar()=='+') {
					f = la.getFont();
					size = f.getSize();
					la.setFont(new Font("Arial", Font.PLAIN, size + 5));
				}
				else if((e.getKeyChar()=='-')&& size>10) {
					f = la.getFont();
					size = f.getSize();
					la.setFont(new Font("Arial", Font.PLAIN, size - 5));
				}
			}
			public void KeyReleased(KeyEvent e) {}
			public void KeyTyped(KeyEvent e) {}
		});
		c.add(la);
		setSize(300, 300);
		setVisible(true);
		la.setFocusable(true);
		la.requestFocus();
		
	}
	public static void main(String[] args) {
		new LoveJava00();
	}
}

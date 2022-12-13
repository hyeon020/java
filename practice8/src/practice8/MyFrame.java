package practice8;
import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("300x300 스윙 프레임 만들기"); //스윙프레임 제목 지정
		setSize(300, 300); //size 지정
		setVisible(true); 
	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame(); //new Frame 생성
	}
}

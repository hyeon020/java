package practice14;
import java.io.*;
import java.net.*;
import java.util.*;

public class ClientLdh {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		try {
			socket = new Socket("localhost", 9999); //socket생성
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				System.out.print("보내기>>");
				String outputMessage = scanner.nextLine();
				if(outputMessage.equalsIgnoreCase("bye")) { 
					out.write(outputMessage+"\n");
					out.flush();
					break;
				}
				out.write(outputMessage + "\n");
				out.flush();
				String inputMessage = in.readLine();
				System.out.println("서버: " + inputMessage);
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				scanner.close(); //scanner 종료
				if(socket!=null) socket.close();
			} catch(IOException e) { 
				System.out.println("서버와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
}

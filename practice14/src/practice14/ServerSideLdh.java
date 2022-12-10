package practice14;
import java.io.*;
import java.net.*;

class ServerSideLdh { //ServerSide클래스
    public static void main(String args[]) throws Exception {
        int port = Integer.parseInt(args[0]); //정수형 port
        int times = Integer.parseInt(args[1]); //정수형 times
        ServerSocket ss = new ServerSocket(port);
        int i = 1;
        while( i <= times) {
            Socket s = ss.accept();
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            for(int j = 1 ; j <= 10 ; j++)
                dos.writeInt(j);
            s.close();
            ++i;
        }
    }
}

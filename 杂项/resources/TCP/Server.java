package TCP;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端运行");
        ServerSocket ss = new ServerSocket(8888);
//        Socket socket = ss.accept();
//        InputStream is = socket.getInputStream();
//        DataInputStream dis = new DataInputStream(is);
        while (true) {
//            try {
//                String str = dis.readUTF();
//                System.out.println(str);
//            } catch (Exception e) {
//                System.out.println(socket.getRemoteSocketAddress()+"离线");
//                socket.close();
//                dis.close();
//                break;
//            }

            Socket socket = ss.accept();
            System.out.println(socket.getRemoteSocketAddress()+"上线了");
            new ServerReadThread(socket).start();
        }
    }
}

package TCP;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端运行");
        Socket socket = new Socket("127.0.0.1",8888);
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数据，输入exit时退出");
        String str;
        while (true) {
            str= sc.nextLine();
            if(str.equals("exit")){
                dos.close();
                socket.close();
                System.out.println("线程退出");
                break;
            }
            dos.writeUTF(str);
            dos.flush();
        }
//        dos.close();
//        socket.close();
    }
}

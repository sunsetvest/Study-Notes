package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class server {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端启动");
        DatagramSocket socket = new DatagramSocket(6666);
        byte[] buffer = new byte[1024*64];
        DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
        socket.receive(packet);
        int len = packet.getLength();
        String str = new String(buffer,0,len);
        System.out.println(str);
        socket.close();
    }
}

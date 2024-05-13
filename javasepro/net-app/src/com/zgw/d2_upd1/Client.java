package com.zgw.d2_upd1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Client {
    public static void main(String[] args) throws Exception {
        // 1.创建客服端对象
        DatagramSocket socket = new DatagramSocket();

        // 2.创建数据包对象封装要发出去的数据
        // 参数一：要发出去的数据
        // 参数二：发送出去的数据大小
        // 参数三：服务端的IP地址
        // 参数四：服务端程序的端口
        byte[] bytes = "这是一段文字".getBytes();
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 6666);

        // 3.发送数据包
        socket.send(packet);

        // 4.释放资源
        socket.close();
    }
}

package com.zgw.d3_udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Service {
    public static void main(String[] args) throws Exception {
        // 1.创建服务端对象
        DatagramSocket socket = new DatagramSocket(6666);

        // 2.创建数据包对象，用于接收数据
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        while (true) {
            // 3.开始使用数据包接收客户端发来的数据
            socket.receive(packet);

            // 4.从字节数据中把接收到的数据打印出来
            int len = packet.getLength();
            String rs = new String(buffer, 0, len);
            System.out.println(rs);
            System.out.println(packet.getAddress().getHostAddress());
            System.out.println(packet.getPort());
            System.out.println("-----------------------------");
        }

    }
}

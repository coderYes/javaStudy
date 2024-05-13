package com.zgw.d3_udp2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        // 1.创建客服端对象
        DatagramSocket socket = new DatagramSocket();

        // 2.创建数据包对象封装要发出去的数据
        // 参数一：要发出去的数据
        // 参数二：发送出去的数据大小
        // 参数三：服务端的IP地址
        // 参数四：服务端程序的端口
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请说：");
            String msg = sc.nextLine();
            if ("exit".equals(msg)) {
                break;
            }
            byte[] bytes = msg.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 6666);

            // 3.发送数据包
            socket.send(packet);
        }
    }
}

package com.zgw.d5_tcp2;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Service {
    public static void main(String[] args) throws Exception {
        // 1.创建ServerSocket对象，同时为服务器注册端口
        ServerSocket serverSocket = new ServerSocket(8888);

        // 2.使用ServerSocket对象，调用一个accept方法等待客户端连接请求
        Socket socket = serverSocket.accept();

        // 3.从socket管道中得到一个字节输入流
        InputStream is = socket.getInputStream();

        // 4.原始字节输入流包装成数据输入流
        DataInputStream dis = new DataInputStream(is);

        while (true) {
            try {
                // 5.使用数据输入流读取客户端发送过来的消息
                String rs = dis.readUTF();
                System.out.println(rs);
                System.out.println(socket.getRemoteSocketAddress());
            } catch (Exception e) {
                System.out.println(socket.getRemoteSocketAddress() + "");
                socket.close();
                break;
            }
        }

    }
}

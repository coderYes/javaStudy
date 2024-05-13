package com.zgw.d6_tcp3;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Service {
    public static void main(String[] args) throws Exception {
        // 1.创建ServerSocket对象，同时为服务器注册端口
        ServerSocket serverSocket = new ServerSocket(8888);

        while (true) {
            // 2.使用ServerSocket对象，调用一个accept方法等待客户端连接请求
            Socket socket = serverSocket.accept();

            System.out.println("有人上线了：" + socket.getRemoteSocketAddress());

            // 3.把这个客户端对应的通信管道，交给一个独立的线程负责处理
            new ServerReaderThread(socket).start();
        }

    }
}

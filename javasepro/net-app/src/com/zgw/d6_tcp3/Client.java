package com.zgw.d6_tcp3;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        // 1.创建socket对象并同时请求与服务端程序的连接
        Socket socket = new Socket("127.0.0.1", 8888);

        // 2.从Socket通信管道中得到一个字节输出流，用发来数据给服务端程序
        OutputStream os = socket.getOutputStream();

        // 3.把低级字节输出流包装成数据输出流
        DataOutputStream dos = new DataOutputStream(os);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请说：");
            String msg = sc.nextLine();
            if ("exit".equals(msg)) {
                System.out.println("退出成功");
                dos.close();
                socket.close();
                break;
            }
            // 4.开始写数据出去
            dos.writeUTF(msg);
            dos.flush();
        }


    }
}

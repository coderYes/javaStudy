package com.zgw.demo5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private Socket socket;

    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            // 1.创建客户端对象
            Client client = new Client();
            client.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void start() throws Exception {
        socket = new Socket("127.0.0.1", 8118);
        System.out.println("连接服务端成功");
        // 1.开发界面
        while (true) {
            // 2.提示
            System.out.println("请您输入操作命令:");
            System.out.println("1、注册");
            System.out.println("2、登录");
            System.out.println("请选择：");
            String command = sc.next();
            switch (command) {
                case "1":
                    // 注册
                    register();
                    break;
                case "2":
                    // 登录
                    login();
                    break;
                case "exit":
                    System.out.println("退出系统");
                    socket.close();
                    break;
            }
        }
    }

    private void login() throws IOException {
        // 1.tips
        System.out.println("===============登录===============");
        System.out.println("请输入登录名称：");
        String loginName = sc.next();

        System.out.println("请输入登录密码：");
        String passWord = sc.next();

        // 2.发送登录名和密码保存
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        dos.writeInt(2); // 登录
        dos.writeUTF(loginName);
        dos.writeUTF(passWord);
        dos.flush();

        // 3.接收服务端响应
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        System.out.println(dis.readUTF());
    }

    private void register() throws IOException {
        // 1.tips
        System.out.println("===============注册===============");
        System.out.println("登录名称：");
        String loginName = sc.next();

        System.out.println("登录密码：");
        String passWord = sc.next();

        // 2.发送登录名和密码保存
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        dos.writeInt(1); // 注册
        dos.writeUTF(loginName);
        dos.writeUTF(passWord);
        dos.flush();

        // 3.接收服务端响应
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        System.out.println(dis.readUTF());

    }
}

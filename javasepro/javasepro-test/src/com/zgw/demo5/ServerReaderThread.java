package com.zgw.demo5;

import java.io.*;
import java.net.Socket;
import java.util.Properties;

public class ServerReaderThread extends Thread {
    private Socket socket;

    public ServerReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        // 处理信息：登录、注册
        try {
            // 1.得到输入流
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            while (true) {
                // 2.读消息类型
                int type = dis.readInt();
                // 3.区别消息，不同处理
                switch (type) {
                    case 1:
                        // 注册
                        register();
                        break;
                    case 2:
                        // 登录
                        login();
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void login() throws Exception {
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        String loginName = dis.readUTF();
        String passWord = dis.readUTF();

        String result = "登录成功";
        File file = new File(Server.USERS_FILE_PATH);
        if (file.exists()) {
            // 提取全部登录名，是否存在 当前这个登录名
            Properties properties = new Properties();
            properties.load(new FileReader(file));

            // 校验登录名和密码
            String pwd = properties.getProperty(loginName);
            if (pwd == null) {
                result = "登录名称错误";
            } else {
                if (!pwd.equals(passWord)) {
                    result = "登陆错误";
                }
            }
        } else {
            result = "当前无任何用户信息，无法登录";
        }

        // 响应result
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        dos.writeUTF(result);
        dos.flush();
    }

    private void register() throws Exception {
        DataInputStream dis = new DataInputStream(socket.getInputStream());
        String loginName = dis.readUTF();
        String passWord = dis.readUTF();

        String result = "注册成功";
        if (exist(loginName)) {
            result = "注册失败,您注册的登录名称已被占用!";
        } else {
            // 保存登录名和密码
            Properties properties = new Properties();
            properties.setProperty(loginName, passWord);
            properties.store(new FileWriter(Server.USERS_FILE_PATH, true), "");
        }

        // 响应结果回去
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        dos.writeUTF(result);
        dos.flush();

    }

    public boolean exist(String loginName) throws Exception {
        // 判断登录名是否重复
        File file = new File(Server.USERS_FILE_PATH);
        if (file.exists()) {
            // 提取全部登录名，是否存在 当前这个登录名
            Properties properties = new Properties();
            properties.load(new FileReader(file));
            if (properties.containsKey(loginName)) {
                return true;
            }
        }
        return false;
    }
}

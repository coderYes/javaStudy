package com.zgw.d7_tcp4;

import java.io.*;
import java.net.Socket;

public class ServerReaderThread extends Thread {
    private Socket socket;

    public ServerReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while (true) {
                try {
                    String rs = dis.readUTF();
                    System.out.println(rs);
                    // 把这个消息分发给全部客户进行接收
                    sendMsgToAll(rs);
                } catch (Exception e) {
                    System.out.println("有人下线了：" + socket.getRemoteSocketAddress());
                    Service.onLineSocket.remove(socket);
                    dis.close();
                    socket.close();
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void sendMsgToAll(String rs) throws Exception {
        // 发送给全部在线的socket管道接收
        for (Socket onLineSocket : Service.onLineSocket) {
            OutputStream os = onLineSocket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(rs);
            dos.flush();
        }
    }
}

package com.zgw.d4_data_stream;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        try (// 1.创建数据输出流包装低级字节输出流
             DataOutputStream dos = new DataOutputStream(new FileOutputStream(("io-app2/src/a11.txt")));
             DataInputStream dis = new DataInputStream(new FileInputStream(("io-app2/src/a11.txt")));
        ) {
            dos.writeInt(97);
            dos.writeDouble(97.5);
            dos.writeUTF("12346");

            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readUTF());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

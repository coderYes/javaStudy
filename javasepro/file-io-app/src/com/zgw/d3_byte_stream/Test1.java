package com.zgw.d3_byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Test1 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("file-io-app/src/abc2.txt");

        // 读取多个字节
//        byte[] buffer = new byte[3];
//        int len = is.read(buffer);
//        System.out.println(new String(buffer));
//        System.out.println(len);
//
//        int len2 = is.read(buffer);
//        System.out.println(new String(buffer, 0, len2));
//        System.out.println(len2);

        // 使用循环读取
        byte[] buffer = new byte[3];
        int len;
        while ((len = is.read(buffer)) != -1) {
            System.out.println(new String(buffer, 0, len));
        }
    }
}

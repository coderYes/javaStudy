package com.zgw.d2_buffereds_stream;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        try (
                // 定义一个字节缓冲输入流包装原始字节输入流
                InputStream is = new FileInputStream("io-app2/src/a3.txt");
                InputStream bis = new BufferedInputStream(is);

                // 定义一个字节缓冲输出流包装原始字节输出流
                OutputStream os = new FileOutputStream("io-app2/src/a4.txt");
                OutputStream bos = new BufferedOutputStream(os);
        ) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

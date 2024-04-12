package com.zgw.d2_buffereds_stream;

import java.io.*;

public class Test3 {
    public static void main(String[] args) {
        try (
                // 定义一个字符缓冲输出流包装原始字符输出流
                Writer fw = new FileWriter("io-app2/src/a6.txt");
                BufferedWriter bw = new BufferedWriter(fw);

        ) {
            bw.write('a');
            bw.write(97);
            bw.newLine();
            bw.write("这是一段文字");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

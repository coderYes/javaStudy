package com.zgw.d2_buffereds_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class Test2 {
    public static void main(String[] args) {
        try (
                // 定义一个字符缓冲输入流包装原始字符输入流
                Reader fr = new FileReader("io-app2/src/a5.txt");
                BufferedReader br = new BufferedReader(fr);

        ) {
//            char[] buffer = new char[3];
//            int len;
//            while ((len = br.read(buffer)) != -1) {
//                System.out.print(new String(buffer, 0, len));
//            }
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

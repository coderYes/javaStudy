package com.zgw.d3_printstream;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.nio.charset.Charset;

public class Test {
    public static void main(String[] args) {
        // 1.创建打印流管道
        try (
                PrintStream ps = new PrintStream("io-app2/src/a8.txt", Charset.forName("GBK"));
        ) {
            ps.println("这是一段文字");
            ps.println(98);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

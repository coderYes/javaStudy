package com.zgw.d2_buffereds_stream;

import java.io.*;

public class Test7 {
    public static void main(String[] args) {
        try (
                OutputStream os = new FileOutputStream("io-app2/src/a10.txt");
                Writer osw = new OutputStreamWriter(os, "GBK");
                BufferedWriter bw = new BufferedWriter(osw);
        ) {
            bw.write("这是一段文字a");
            bw.write("这是一段文字b");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
